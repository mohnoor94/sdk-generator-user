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

import com.expediagroup.sdk.rapid.models.CategoryAge
import com.expediagroup.sdk.rapid.models.MaxAllowed
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length
import javax.validation.Valid
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * Occupancy information.
 * @param maxAllowed
 * @param ageCategories Map of the age categories used to determine the maximum children and adult occupancy.
 */
data class Occupancy(
    @JsonProperty("max_allowed")
    @field:Valid
    val maxAllowed: MaxAllowed? = null,
    // Map of the age categories used to determine the maximum children and adult occupancy.
    @JsonProperty("age_categories")
    @field:Valid
    val ageCategories: kotlin.collections.Map<kotlin.String, CategoryAge>? = null
) {
    companion object {
        @JvmStatic
        fun builder() = Builder()
    }

    class Builder(
        private var maxAllowed: MaxAllowed? = null,
        private var ageCategories: kotlin.collections.Map<kotlin.String, CategoryAge>? = null
    ) {
        fun maxAllowed(maxAllowed: MaxAllowed?) = apply { this.maxAllowed = maxAllowed }

        fun ageCategories(ageCategories: kotlin.collections.Map<kotlin.String, CategoryAge>?) = apply { this.ageCategories = ageCategories }

        fun build(): Occupancy {
            return Occupancy(
                maxAllowed = maxAllowed,
                ageCategories = ageCategories
            )
        }
    }
}