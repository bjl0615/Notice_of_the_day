package com.example.notice_of_the_day

import com.google.gson.annotations.SerializedName

data class Message(
    @SerializedName("nickname")
    val nickname: String
)

