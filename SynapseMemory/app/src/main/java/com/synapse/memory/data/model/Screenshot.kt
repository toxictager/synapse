package com.synapse.memory.data.model

import java.util.UUID

data class Screenshot(
    val id: String = UUID.randomUUID().toString(),
    val timestamp: Long = System.currentTimeMillis(),
    val imagePath: String, // Local path to the image file
    val caption: String? = null
)
