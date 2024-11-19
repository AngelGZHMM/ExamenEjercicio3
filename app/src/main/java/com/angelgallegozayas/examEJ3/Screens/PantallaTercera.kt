package com.angelgallegozayas.examEJ3.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
@Composable
fun pantallaTercera(){

    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,){
        Text(text = "Esta es la tercera pantalla")
        Button(onClick = {}) { }
}
}