// Copyright 2022 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.generator.gapic.composer.grpcrest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.google.api.generator.gapic.composer.common.TestProtoLoader;
import com.google.api.generator.gapic.model.GapicContext;
import com.google.api.generator.gapic.model.GapicServiceConfig;
import com.google.api.generator.gapic.model.Message;
import com.google.api.generator.gapic.model.ResourceName;
import com.google.api.generator.gapic.model.Service;
import com.google.api.generator.gapic.model.Transport;
import com.google.api.generator.gapic.protoparser.Parser;
import com.google.api.generator.gapic.protoparser.ServiceConfigParser;
import com.google.longrunning.OperationsProto;
import com.google.protobuf.Descriptors.FileDescriptor;
import com.google.protobuf.Descriptors.ServiceDescriptor;
import com.google.protobuf.StructProto;
import com.google.showcase.grpcrest.v1beta1.EchoGrpcrest;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class GrpcRestTestProtoLoader extends TestProtoLoader {
  private static final GrpcRestTestProtoLoader INSTANCE = new GrpcRestTestProtoLoader();

  protected GrpcRestTestProtoLoader() {
    super(Transport.GRPC_REST, "src/test/resources/");
  }

  public static GrpcRestTestProtoLoader instance() {
    return INSTANCE;
  }

  @Override
  public GapicContext parseShowcaseEcho() {
    FileDescriptor echoFileDescriptor = EchoGrpcrest.getDescriptor();

    ServiceDescriptor echoServiceDescriptor = echoFileDescriptor.getServices().get(0);
    assertEquals("Echo", echoServiceDescriptor.getName());

    Map<String, Message> messageTypes = Parser.parseMessages(echoFileDescriptor);
    messageTypes.putAll(Parser.parseMessages(OperationsProto.getDescriptor()));
    messageTypes.putAll(Parser.parseMessages(StructProto.getDescriptor()));

    Map<String, ResourceName> resourceNames = Parser.parseResourceNames(echoFileDescriptor);
    Set<ResourceName> outputResourceNames = new HashSet<>();
    List<Service> services =
        Parser.parseService(
            echoFileDescriptor, messageTypes, resourceNames, Optional.empty(), outputResourceNames);

    String jsonFilename = "showcase_grpc_service_config.json";
    Path jsonPath = Paths.get(getTestFilesDirectory(), jsonFilename);
    Optional<GapicServiceConfig> configOpt = ServiceConfigParser.parse(jsonPath.toString());
    assertTrue(configOpt.isPresent());
    GapicServiceConfig config = configOpt.get();

    return GapicContext.builder()
        .setMessages(messageTypes)
        .setResourceNames(resourceNames)
        .setServices(services)
        .setServiceConfig(config)
        .setHelperResourceNames(outputResourceNames)
        .setTransport(getTransport())
        .build();
  }
}
