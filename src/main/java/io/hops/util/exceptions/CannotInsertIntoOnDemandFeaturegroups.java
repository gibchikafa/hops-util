/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.hops.util.exceptions;

/**
 * Exception thrown when a the user tries insert into an on-demand feature group.
 * The insert operation is only supported for cached feature groups
 */
public class CannotInsertIntoOnDemandFeaturegroups extends Exception {

  Integer status;

  public CannotInsertIntoOnDemandFeaturegroups(String message) {
    super(message);
  }

  public CannotInsertIntoOnDemandFeaturegroups(Integer status, String message) {
    super(message);
    this.status = status;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }
}