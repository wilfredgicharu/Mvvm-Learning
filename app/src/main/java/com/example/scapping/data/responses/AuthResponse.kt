package com.example.scapping.data.responses

import com.example.scapping.data.db.User

data class AuthResponse(
    val issuccess: Boolean?,
    val message: String?,
    val user: User?
)