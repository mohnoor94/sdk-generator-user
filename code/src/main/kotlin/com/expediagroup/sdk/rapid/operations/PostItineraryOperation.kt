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
package com.expediagroup.sdk.rapid.operations

import com.expediagroup.sdk.core.model.Operation
import com.expediagroup.sdk.rapid.models.CreateItineraryRequest
import com.expediagroup.sdk.rapid.models.Link

/**
 * Create Booking
 * @property requestBody [CreateItineraryRequest]
 * @property params [PostItineraryOperationParams]
 */
class PostItineraryOperation private constructor(
    params: PostItineraryOperationParams?,
    requestBody: CreateItineraryRequest?,
    link: Link?
) : Operation<
        CreateItineraryRequest
    >(
        url(null, link, "/itineraries"),
        "POST",
        "postItinerary",
        requestBody,
        params
    ) {
    @Deprecated("Switch order of arguments", ReplaceWith("Operation(params: PostItineraryOperationParams, requestBody: CreateItineraryRequest?)"))
    constructor(
        requestBody: CreateItineraryRequest?,
        params: PostItineraryOperationParams
    ) : this(params, requestBody)

    constructor(
        params: PostItineraryOperationParams,
        requestBody: CreateItineraryRequest?
    ) : this(
        params,
        requestBody,
        null
    )

    constructor(
        link: Link,
        context: PostItineraryOperationContext,
        requestBody: CreateItineraryRequest?
    ) : this(
        PostItineraryOperationParams(context),
        requestBody,
        link
    )

    companion object : LinkableOperation {
        override fun pathPattern(): String {
            return "/itineraries"
        }
    }
}
