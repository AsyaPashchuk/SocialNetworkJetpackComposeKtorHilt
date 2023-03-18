package com.socialnetworkjetpackcomposektorhilt.domain.models

data class User(
    val profilePictureUrl: String,
    val userName: String,
    val description: String,
    val followerCount: Int,
    val followingCount: Int,
    val postCount: Int
)
