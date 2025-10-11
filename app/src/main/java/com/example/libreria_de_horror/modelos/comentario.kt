package com.example.libreria_de_horror.modelos

data class Comentario(
    val postId: Int,
    val id: Int,
    val name: String,
    val email: String,
    val body: String
)