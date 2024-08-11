/*
 * Copyright (C) 2022 Expedia, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.expediagroup.sdk.rapid.models

import com.expediagroup.sdk.rapid.models.BedGroupAvailabilityLinks
import com.expediagroup.sdk.rapid.models.BedGroupConfiguration
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length
import javax.validation.Valid
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 *
 * @param links
 * @param id Unique identifier for a bed group.
 * @param description This is a display ready description of a bed configuration for this room.
 * @param configuration The bed configuration for a given room. This array can be empty for the related bed group.
 */
data class BedGroupAvailability(
    @JsonProperty("links")
    @field:Valid
    val links: BedGroupAvailabilityLinks? = null,
    // Unique identifier for a bed group.
    @JsonProperty("id")
    @field:Valid
    val id: kotlin.String? = null,
    // This is a display ready description of a bed configuration for this room.
    @JsonProperty("description")
    @field:Valid
    val description: kotlin.String? = null,
    // The bed configuration for a given room. This array can be empty for the related bed group.
    @JsonProperty("configuration")
    @field:Valid
    val configuration: kotlin.collections.List<BedGroupConfiguration>? = null
) {
    companion object {
        @JvmStatic
        fun builder() = Builder()
    }

    class Builder(
        private var links: BedGroupAvailabilityLinks? = null,
        private var id: kotlin.String? = null,
        private var description: kotlin.String? = null,
        private var configuration: kotlin.collections.List<BedGroupConfiguration>? = null
    ) {
        fun links(links: BedGroupAvailabilityLinks?) = apply { this.links = links }

        fun id(id: kotlin.String?) = apply { this.id = id }

        fun description(description: kotlin.String?) = apply { this.description = description }

        fun configuration(configuration: kotlin.collections.List<BedGroupConfiguration>?) = apply { this.configuration = configuration }

        fun build(): BedGroupAvailability {
            return BedGroupAvailability(
                links = links,
                id = id,
                description = description,
                configuration = configuration
            )
        }
    }
}