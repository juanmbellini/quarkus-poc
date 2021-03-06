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

package com.github.juanmbellini.pocs.quarkus.gateways.jsonplaceholder.impl;

import com.github.juanmbellini.pocs.quarkus.gateways.jsonplaceholder.AlbumsGateway;
import com.github.juanmbellini.pocs.quarkus.models.Album;
import lombok.AllArgsConstructor;
import lombok.NonNull;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

/**
 * JSON Placeholder's REST albums gateway.
 */
@ApplicationScoped
@AllArgsConstructor
public class RestAlbumsGateway implements AlbumsGateway {

    private final MicroProfileGetAlbums microProfileGetAlbums;
    private final MicroProfileGetUserAlbums microProfileGetUserAlbums;


    @Override
    public List<Album> getAlbums() {
        return microProfileGetAlbums.perform();
    }

    @Override
    public List<Album> getUserAlbums(@NonNull final Long userId) {
        return microProfileGetUserAlbums.perform(userId);
    }
}
