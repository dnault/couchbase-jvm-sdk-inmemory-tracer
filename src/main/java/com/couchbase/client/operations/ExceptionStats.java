/*
 * Copyright (c) 2025 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.couchbase.client.operations;

import com.couchbase.client.core.annotation.Stability;

/**
 * Stores simple statistics for each exception.
 */
@Stability.Volatile
public class ExceptionStats {
  private final String exceptionSimpleName;
  private final long count;

  @Stability.Internal
  public ExceptionStats(String exceptionSimpleName, long count) {
    this.exceptionSimpleName = exceptionSimpleName;
    this.count = count;
  }

  public String exceptionSimpleName() {
    return exceptionSimpleName;
  }

  public long count() {
    return count;
  }
}
