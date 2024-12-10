package com.example.postsapp.data

import java.time.LocalDate

data class Post(
    val id: String = "",
    val image: String,
    val description: String,
    val date: String = LocalDate.now().toString()
)
