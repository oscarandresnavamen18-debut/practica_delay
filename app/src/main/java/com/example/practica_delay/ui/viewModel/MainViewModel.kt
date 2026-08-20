package com.example.practica_delay.ui.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

data class Fruit(
    val name: String,
    val color: String,
    val price: Double
)

class MainViewModel : ViewModel() {
    var mensaje by mutableStateOf("Esperando...")
        private set

    var showTable by mutableStateOf(false)
        private set

    val fruits = listOf(
        Fruit("Manzana", "Rojo", 1.500),
        Fruit("Plátano", "Amarillo", 2.000),
        Fruit("Pera", "Verde", 1.200),
        Fruit("Naranja", "Naranja", 1.100),
        Fruit("Uva", "Morado", 2.500)
    )

    fun ejecuta() {
        mensaje = "¡Tabla de frutas generada!"
        showTable = true
    }
}
