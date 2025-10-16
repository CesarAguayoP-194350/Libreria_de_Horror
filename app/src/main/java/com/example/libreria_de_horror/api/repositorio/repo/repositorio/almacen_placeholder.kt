package com.example.libreria_de_horror.api.repositorio.repo.repositorio

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.libreria_de_horror.modelos.Comentario
import com.example.libreria_de_horror.modelos.Publicacion
import java.util.Collections.emptyList

class AlmacenPlaceholder(
    override val publicaciones: MutableState<List<Publicacion>> = mutableStateOf(emptyList<Publicacion>()),
    override val comentarios: MutableState<List<Comentario>> = mutableStateOf(emptyList<Comentario>()),
    override val publicacion_seleccionada: MutableState<Publicacion> = mutableStateOf(Publicacion(
        userId = 0,
        id = 0,
        title = "404",
        body = "no encontrado"
    ))
): InterfazAlmacenPlaceholder {}

interface  InterfazAlmacenPlaceholder{
    val publicaciones: MutableState<List<Publicacion>>
    val comentarios: MutableState<List<Comentario>>
    val publicacion_seleccionada: MutableState<Publicacion>
}