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

public class LineCommentTest {
  @Test
  public void writeNormalLineComment() {
      String content = "this is a test comment";
      LineComment lineComment = LineComment.builder().setComment(content).build();
      assertThat(lineComment.write()).isEqualTo(content);
  }

  @Test
  public void writeLongLineComment() {
    String content = "this is a long test comment with so many words, hello world, hello again, hello for 3 times, blah, blah!";
    LineComment lineComment = LineComment.builder().setComment(content).build();
    // TODO(xiaozhenliu): The long line comments will be splitted into several lines.
    assertThat(lineComment.write()).isEqualTo(content);
  } 
}
