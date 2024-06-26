package com.example.mycompose2024

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

class HomeScreen {
    companion object {
        const val NAME = "HomeScreen"
    }

    @Composable
    fun Content(navController: NavHostController) {
        Scaffold() {
            it
            Column {
                Text(NAME)
                Button(onClick = {
                    android.util.Log.d("testtttt" , "$NAME onClick $this")
                    navController.navigate(NewsScreen.NAME)
                }) {
                    Text("Go to ${NewsScreen.NAME}")
                }
            }
        }
    }
}
