package com.example.navigas.navigation

import androidx.compose.runtime.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigas.view.*

@Composable
fun NavigasiUtama() {
    val navController: NavHostController = rememberNavController()

    var pesertaList by remember { mutableStateOf(listOf<Peserta>()) }

    NavHost(navController = navController, startDestination = "halaman_utama") {
        composable("halaman_utama") {
            HalamanUtama(navController)
        }
        composable("formulir") {
            Formulir(navController) { peserta ->
                pesertaList = pesertaList + peserta
                navController.navigate("list_peserta")
            }
        }
        composable("list_peserta") {
            ListPeserta(navController, pesertaList)
        }
    }
}
