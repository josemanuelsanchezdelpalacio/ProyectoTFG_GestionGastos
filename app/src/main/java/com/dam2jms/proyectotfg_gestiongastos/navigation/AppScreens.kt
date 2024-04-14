package com.dam2jms.proyectotfg_gestiongastos.navigation
sealed class AppScreens (val route: String){
    object LoginScreen: AppScreens(route = "login_screen")
    object RegisterScreen: AppScreens(route = "register_screen")
    object DatosGastosScreen: AppScreens(route = "datos_gastos_screen")
}
