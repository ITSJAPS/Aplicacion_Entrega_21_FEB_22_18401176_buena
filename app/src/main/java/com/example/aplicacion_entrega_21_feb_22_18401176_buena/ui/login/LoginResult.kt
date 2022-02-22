package com.example.aplicacion_entrega_21_feb_22_18401176_buena.ui.login

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)