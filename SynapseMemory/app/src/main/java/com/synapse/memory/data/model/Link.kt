package com.synapse.memory.data.model

import java.util.UUID

data class Link(
    val id: String = UUID.randomUUID().toString(),
    val timestamp: Long = System.currentTimeMillis(),
    val url: String,
    val title: String? = null // Optional title, might be fetched or user-defined
)
