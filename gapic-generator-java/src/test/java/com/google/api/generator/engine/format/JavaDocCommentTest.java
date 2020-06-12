// Copyright 2020 Google LLC
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

package com.google.api.generator.engine.format;
import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class JavaDocCommentTest {
  @Test
  public void writeNormalJavaDocComment() {
      String content = "this is a test comment";
      String deprecatedText = "Use the {@link ArchivedBookName} class instead.";
      JavaDocComment javaDocComment = JavaDocComment.builder().setComment(content).setDeprecatedText(deprecatedText).build();
      assertThat(javaDocComment.write()).isEqualTo(content);
  }
}
