package org.mobilenativefoundation.trails.common.networking.api.models

import kotlinx.serialization.Serializable

@Serializable
data class GetActivitiesArgs(
    val limit: Int,
    val cursor: String? = null
)