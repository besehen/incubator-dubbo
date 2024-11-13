/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.spring.boot.autoconfigure.observability.zipkin.customizer;

import org.springframework.web.reactive.function.client.WebClient;

/**
 * Callback interface that can be implemented by beans wishing to customize the
 * {@link WebClient.Builder} used to send spans to Zipkin.
 *
 * @since 3.2.0
 */
@FunctionalInterface
public interface ZipkinWebClientBuilderCustomizer {

    /**
     * Customize the web client builder.
     *
     * @param webClientBuilder the {@code WebClient.Builder} to customize
     */
    void customize(WebClient.Builder webClientBuilder);
}