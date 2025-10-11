package com.example.libreria_de_horror.ui.theme.controladores

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.libreria_de_horror.ui.pantalla.lista_publicacioines
import com.example.libreria_de_horror.ui.pantalla.pantalla_publicacion

@Composable
fun NavegacionPrincipal(modificador: Modifier = Modifier){
    val control_navegacion = rememberNavController()

    NavHost(navController = control_navegacion, startDestination = PantallaListaPublicaiciones){
        composable<PantallaListaPublicaiciones> {
            lista_publicaciones(modificador, navegar_a_publiacion = { control_navegacion.navigate(PantallaPublicacion) })
        }

        composable<PantallaPublicacion> {
            PantallaPublicacion(modificador)
        }

    }
}