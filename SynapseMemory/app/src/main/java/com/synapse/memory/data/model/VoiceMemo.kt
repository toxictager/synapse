package com.synapse.memory.data.model

import java.util.UUID

data class VoiceMemo(
    val id: String = UUID.randomUUID().toString(),
    val timestamp: Long = System.currentTimeMillis(),
    val audioPath: String, // Local path to the audio file
    val durationMillis: Long // Duration of the voice memo in milliseconds
)
