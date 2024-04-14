package com.dam2jms.proyectotfg_gestiongastos.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dam2jms.proyectotfg_gestiongastos.models.ViewModel
import com.dam2jms.proyectotfg_gestiongastos.navigation.AppScreens
import com.dam2jms.proyectotfg_gestiongastos.states.UiState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController, mvvm: ViewModel) {

    val uiState by mvvm.uiState.collectAsState()

    LoginScreenBody(modifier = Modifier.padding(), navController, mvvm, uiState)

}

@Composable
fun LoginScreenBody(modifier: Modifier, navController: NavController, mvvm: ViewModel, uiState: UiState) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Brush.verticalGradient(listOf(Color.DarkGray, Color.Black)))
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                modifier = modifier.fillMaxWidth(),
                value = "",
                onValueChange = { },
                label = { Text("Introduce tu correo") }
            )
            Spacer(modifier = modifier.height(8.dp))
            TextField(
                modifier = modifier.fillMaxWidth(),
                value = "",
                onValueChange = { },
                label = { Text("Contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
            Spacer(modifier = modifier.height(16.dp))

            Button(
                modifier = modifier.fillMaxWidth(),
                onClick = { navController.navigate(route = AppScreens.DatosGastosScreen.route) },
                colors = ButtonDefaults.buttonColors(Color.Cyan)
            ) {
                Text("Iniciar sesión")
            }
            Spacer(modifier = modifier.height(8.dp))

            Text(
                text = "¿Te olvidaste la contraseña?",
                color = Color.LightGray,
                modifier = modifier.clickable {  }
            )
            Spacer(modifier = modifier.height(8.dp))
            Text(
                text = "Registrarse",
                color = Color.LightGray,
                modifier = modifier.clickable { navController.navigate(route = AppScreens.RegisterScreen.route) }
            )
        }
    }
}
