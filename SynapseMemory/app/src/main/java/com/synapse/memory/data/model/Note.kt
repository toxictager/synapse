package com.synapse.memory.data.model

import java.util.UUID

data class Note(
    val id: String = UUID.randomUUID().toString(),
    val timestamp: Long = System.currentTimeMillis(),
    val content: String
)
