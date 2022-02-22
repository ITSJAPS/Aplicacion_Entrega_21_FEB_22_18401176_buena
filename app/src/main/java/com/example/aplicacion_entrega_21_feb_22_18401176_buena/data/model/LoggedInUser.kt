package com.example.aplicacion_entrega_21_feb_22_18401176_buena.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    val userId: String,
    val displayName: String
)