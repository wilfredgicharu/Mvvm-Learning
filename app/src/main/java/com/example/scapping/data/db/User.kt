package com.example.scapping.data.db

import androidx.room.PrimaryKey

const val CURRENT_USER_ID = 0
data class User(
    val id: Int? = null,
    val name: String? = null,
    val email: String? = null,
    val password: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? = null
){
    @PrimaryKey(autoGenerate = false)
    var uid: Int = CURRENT_USER_ID
}