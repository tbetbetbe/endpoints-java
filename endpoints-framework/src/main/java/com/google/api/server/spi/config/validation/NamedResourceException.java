/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
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
package com.google.api.server.spi.config.validation;

import com.google.api.server.spi.config.model.ApiParameterConfig;

import java.lang.reflect.Type;

/**
 * Exception for entity (resource) type parameters that have an @named annotation.
 *
 * @author Eric Orth
 */
public class NamedResourceException extends ApiParameterConfigInvalidException {
  public NamedResourceException(ApiParameterConfig config, Type type) {
    super(config, getErrorMessage(type));
  }

  private static String getErrorMessage(Type type) {
    return String.format(
        "Bad parameter name. Parameter is entity type (%s) and should not be named.", type);
  }
}
