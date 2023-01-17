// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schema/google/showcase/v1beta1/sequence.proto

package com.google.showcase.v1beta1;

public interface SequenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.Sequence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Sequence of responses to return in order for each attempt. If empty, the
   * default response is an immediate OK.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Sequence.Response responses = 2;</code>
   */
  java.util.List<com.google.showcase.v1beta1.Sequence.Response> 
      getResponsesList();
  /**
   * <pre>
   * Sequence of responses to return in order for each attempt. If empty, the
   * default response is an immediate OK.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Sequence.Response responses = 2;</code>
   */
  com.google.showcase.v1beta1.Sequence.Response getResponses(int index);
  /**
   * <pre>
   * Sequence of responses to return in order for each attempt. If empty, the
   * default response is an immediate OK.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Sequence.Response responses = 2;</code>
   */
  int getResponsesCount();
  /**
   * <pre>
   * Sequence of responses to return in order for each attempt. If empty, the
   * default response is an immediate OK.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Sequence.Response responses = 2;</code>
   */
  java.util.List<? extends com.google.showcase.v1beta1.Sequence.ResponseOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <pre>
   * Sequence of responses to return in order for each attempt. If empty, the
   * default response is an immediate OK.
   * </pre>
   *
   * <code>repeated .google.showcase.v1beta1.Sequence.Response responses = 2;</code>
   */
  com.google.showcase.v1beta1.Sequence.ResponseOrBuilder getResponsesOrBuilder(
      int index);
}