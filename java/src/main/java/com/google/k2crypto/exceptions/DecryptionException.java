/*
 * Copyright 2014 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.k2crypto.exceptions;

import com.google.k2crypto.K2Exception;

/**
 * This class represents a Encryption Exception in K2. It is thrown when decryption fails.
 *
 * @author John Maheswaran (maheswaran@google.com)
 */

public class DecryptionException extends K2Exception {

  /**
   * Constructs a new DecryptionException with the specified message.
   *
   * @param message the detail message.
   */
  public DecryptionException(String message) {
    super(message);
  }

  /**
   * Constructs a new DecryptionException with the specified message and cause.
   *
   * @param message the detail message.
   * @param cause the cause of this exception.
   */
  public DecryptionException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs a new DecryptionException with the specified cause.
   *
   * @param cause the cause of this exception.
   */
  public DecryptionException(Throwable cause) {
    super(cause);
  }
}
