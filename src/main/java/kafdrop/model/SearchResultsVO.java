/*
 * Copyright 2021 Kafdrop contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package kafdrop.model;

import java.util.List;

public final class SearchResultsVO {
  private List<MessageVO> messages;

  private String completionDetails;

  public List<MessageVO> getMessages() {
    return messages;
  }

  public String getCompletionDetails() {
    return completionDetails;
  }

  public void setCompletionDetails(String completionDetails) {
    this.completionDetails = completionDetails;
  }

  public void setMessages(List<MessageVO> messages) {
    this.messages = messages;
  }
}
