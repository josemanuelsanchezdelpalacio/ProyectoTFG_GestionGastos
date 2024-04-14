package com.dam2jms.proyectotfg_gestiongastos.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dam2jms.proyectotfg_gestiongastos.models.ViewModel
import com.dam2jms.proyectotfg_gestiongastos.screens.DatosGastosScreen
import com.dam2jms.proyectotfg_gestiongastos.screens.LoginScreen
import com.dam2jms.proyectotfg_gestiongastos.screens.RegisterScreen


@Composable
fun appNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.LoginScreen.route) {
        composable(route = AppScreens.LoginScreen.route) { LoginScreen(navController, mvvm = ViewModel()) }
        composable(route = AppScreens.RegisterScreen.route) { RegisterScreen(navController, mvvm = ViewModel()) }
        composable(route = AppScreens.DatosGastosScreen.route) { DatosGastosScreen(navController, mvvm = ViewModel()) }
    }
}
