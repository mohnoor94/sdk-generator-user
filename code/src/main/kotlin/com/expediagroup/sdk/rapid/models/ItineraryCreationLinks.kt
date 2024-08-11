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

import com.expediagroup.sdk.rapid.models.Link
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length
import javax.validation.Valid
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

/**
 * A map of links, including links to retrieve a booking, resume a held booking, cancel a held booking, or complete a payment session if a challenge is used.
 * @param retrieve
 * @param resume
 * @param completePaymentSession
 * @param cancel
 */
data class ItineraryCreationLinks(
    @JsonProperty("retrieve")
    @field:Valid
    val retrieve: Link? = null,
    @JsonProperty("resume")
    @field:Valid
    val resume: Link? = null,
    @JsonProperty("complete_payment_session")
    @field:Valid
    val completePaymentSession: Link? = null,
    @JsonProperty("cancel")
    @field:Valid
    val cancel: Link? = null
) {
    companion object {
        @JvmStatic
        fun builder() = Builder()
    }

    class Builder(
        private var retrieve: Link? = null,
        private var resume: Link? = null,
        private var completePaymentSession: Link? = null,
        private var cancel: Link? = null
    ) {
        fun retrieve(retrieve: Link?) = apply { this.retrieve = retrieve }

        fun resume(resume: Link?) = apply { this.resume = resume }

        fun completePaymentSession(completePaymentSession: Link?) = apply { this.completePaymentSession = completePaymentSession }

        fun cancel(cancel: Link?) = apply { this.cancel = cancel }

        fun build(): ItineraryCreationLinks {
            return ItineraryCreationLinks(
                retrieve = retrieve,
                resume = resume,
                completePaymentSession = completePaymentSession,
                cancel = cancel
            )
        }
    }
}
