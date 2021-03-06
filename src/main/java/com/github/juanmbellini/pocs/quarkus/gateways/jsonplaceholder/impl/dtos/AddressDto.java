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

package com.github.juanmbellini.pocs.quarkus.gateways.jsonplaceholder.impl.dtos;

import com.github.juanmbellini.pocs.quarkus.models.Address;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Getter
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(force = true, access = AccessLevel.PACKAGE)
public class AddressDto {
    private final String street;
    private final String suite;
    private final String city;
    private final String zipcode;
    private final GeoLocationDto geo;

    public Address toAddress() {
        return Address.builder()
                .street(street)
                .suite(suite)
                .city(city)
                .zipcode(zipcode)
                .geoLocation(Optional.ofNullable(geo).map(GeoLocationDto::toGeoLocation).orElse(null))
                .build();
    }
}
