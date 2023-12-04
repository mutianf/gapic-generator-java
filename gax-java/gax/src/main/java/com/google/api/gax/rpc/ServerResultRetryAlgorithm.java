package com.google.api.gax.rpc;

import com.google.api.gax.retrying.BasicResultRetryAlgorithm;
import com.google.api.gax.retrying.TimedAttemptSettings;
import com.google.protobuf.util.Durations;
import com.google.rpc.RetryInfo;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.protobuf.ProtoUtils;
import org.threeten.bp.Duration;

public class ServerResultRetryAlgorithm<ResponseT> extends BasicResultRetryAlgorithm<ResponseT> {

  private static final Metadata.Key<RetryInfo> KEY_RETRY_INFO =
      ProtoUtils.keyForProto(RetryInfo.getDefaultInstance());

  @Override
  public TimedAttemptSettings createNextAttempt(
      Throwable prevThrowable, ResponseT previousResponse, TimedAttemptSettings prevSettings) {
    Duration retryDelay = extractRetryDelay(prevThrowable);
    if (retryDelay != null) {
      return prevSettings
          .toBuilder()
          .setRandomizedRetryDelay(retryDelay)
          .setAttemptCount(prevSettings.getAttemptCount() + 1)
          .build();
    }
    return null;
  }

  @Override
  public boolean shouldRetry(Throwable prevThrowable, ResponseT prevResponse) {
    return extractRetryDelay(prevThrowable) != null
        || ((prevThrowable instanceof ApiException)
            && ((ApiException) prevThrowable).isRetryable());
  }

  public static Duration extractRetryDelay(Throwable throwable) {
    if (throwable == null) {
      return null;
    }
    Metadata trailers = Status.trailersFromThrowable(throwable);
    if (trailers == null) {
      return null;
    }
    RetryInfo retryInfo = trailers.get(KEY_RETRY_INFO);
    if (retryInfo == null) {
      return null;
    }
    if (!retryInfo.hasRetryDelay()) {
      return null;
    }
    return Duration.ofMillis(Durations.toMillis(retryInfo.getRetryDelay()));
  }
}
