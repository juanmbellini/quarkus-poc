/*
 * Copyright 2020 Juan Marcos Bellini
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

package com.github.juanmbellini.pocs.quarkus.gateways.jsonplaceholder;

import com.github.juanmbellini.pocs.quarkus.models.Comment;

import java.util.List;

/**
 * JSON Placeholder's comments gateway.
 */
@FunctionalInterface
public interface CommentsGateway {

    /**
     * Retrieves {@link Comment}s from JSON Placeholder, allowing to apply filters.
     *
     * @param name  Filter for name.
     * @param email Filter for email.
     * @return The {@link List} of {@link Comment}s matching the criteria.
     */
    List<Comment> getComments(final String name, final String email);
}
