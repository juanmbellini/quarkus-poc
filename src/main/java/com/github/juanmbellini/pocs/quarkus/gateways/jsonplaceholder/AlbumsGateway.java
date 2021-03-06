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

import com.github.juanmbellini.pocs.quarkus.models.Album;
import com.github.juanmbellini.pocs.quarkus.models.User;

import java.util.List;

/**
 * JSON Placeholder's albums gateway.
 */
public interface AlbumsGateway {

    /**
     * Retrieves all {@link Album}s from JSON Placeholder.
     *
     * @return The {@link List} of {@link Album}s.
     */
    List<Album> getAlbums();

    /**
     * Retrieves a {@link User}'s {@link Album}s from JSON Placeholder.
     *
     * @param userId The user's id.
     * @return The {@link List} of {@link Album}s.
     */
    List<Album> getUserAlbums(final Long userId);
}
