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

import com.github.juanmbellini.pocs.quarkus.models.Photo;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;


class PhotosRestClient {

    @ApplicationScoped
    @RegisterRestClient(baseUri = "https://jsonplaceholder.typicode.com")
    public interface GetPhotos {

        @GET
        @Path("/photos")
        @Produces(MediaType.APPLICATION_JSON)
        List<Photo> perform();
    }

    @ApplicationScoped
    @RegisterRestClient(baseUri = "https://jsonplaceholder.typicode.com")
    public interface GetAlbumPhotos {

        @GET
        @Path("/photos")
        @Produces(MediaType.APPLICATION_JSON)
        List<Photo> perform(@QueryParam("albumId") final List<Long> id);
    }
}
