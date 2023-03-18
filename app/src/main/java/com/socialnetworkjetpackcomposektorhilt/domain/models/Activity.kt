package com.socialnetworkjetpackcomposektorhilt.domain.models

import com.socialnetworkjetpackcomposektorhilt.domain.util.ActivityAction

data class Activity(
    val userName: String,
    val actionType: ActivityAction,
    val formattedTime: String
)