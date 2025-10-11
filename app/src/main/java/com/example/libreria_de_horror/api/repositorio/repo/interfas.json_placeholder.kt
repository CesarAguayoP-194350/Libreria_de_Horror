package com.example.libreria_de_horror.api

import com.example.libreria_de_horror.modelos.Publicacion
import retrofit2.http.GET

interface JSONPlaceholder {
    @GET("posts") // o "publicaciones" si tu endpoint es otro
    suspend fun obtener_publicaciones(): List<Publicacion>

    @GET("/posts/{id}/comments")
    suspend fun obtener_comentarios_de_publicacion(@Path("id") id: Int): List<Comentario>
}
