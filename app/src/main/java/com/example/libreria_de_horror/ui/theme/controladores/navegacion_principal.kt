package com.example.libreria_de_horror.ui.theme.controladores

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.libreria_de_horror.ui.theme.pantalla.ListaPublicaciones
import com.example.libreria_de_horror.ui.theme.pantalla.PantallaPublicacion

@Composable
fun NavegacionPrincipal(modificador: Modifier = Modifier){
    val control_navegacion = rememberNavController()

    NavHost(navController = control_navegacion, startDestination = PantallaListaPublicaiciones){
        composable<PantallaListaPublicaiciones> {
            ListaPublicaciones(modificador, navegar_a_publiacion = { control_navegacion.navigate(PantallaPublicacion) })
        }

        composable<PantallaPublicacion> {
            PantallaPublicacion(modificador)
        }

    }
}