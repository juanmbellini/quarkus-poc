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

package com.github.juanmbellini.pocs.quarkus.controllers;

import com.github.juanmbellini.pocs.quarkus.usecases.GetPhotos;
import lombok.AllArgsConstructor;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Rest endpoint for getting photos from JSON Placeholder.
 */
@Path("/photos")
@AllArgsConstructor
public class GetPhotosResource {

    private final GetPhotos getPhotos;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPhotos() {
        final var photos = getPhotos.get();
        return Response.ok(photos).build();
    }
}
