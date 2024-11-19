package com.angelgallegozayas.examEJ3.Navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.angelgallegozayas.examEJ3.Objects.Inicial
import com.angelgallegozayas.examEJ3.Objects.Tercera
import com.angelgallegozayas.examEJ3.Objects.parametro
import com.angelgallegozayas.examEJ3.Screens.pantallaInicial
import com.angelgallegozayas.examEJ3.Screens.pantallaSecundaria
import com.angelgallegozayas.examEJ3.Screens.pantallaTercera

@Composable
fun navigation() {

    val navController = rememberNavController()
    //al final ponemos la primera pantalla que queremos que se muestre
    NavHost(navController = navController, startDestination = Inicial) {
        composable<Inicial> {
            pantallaInicial() { nombreParametro -> navController.navigate(parametro(nombreParametro)) }
        }
        composable<parametro> { P ->
            val parametro = P.toRoute<parametro>( )
            pantallaSecundaria(parametro.nombre) { navController.navigate(Inicial ) }
        }
        composable<Tercera>{
            pantallaTercera()
        }
    }
}