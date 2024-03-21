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
}
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold() {
        it
        Column {
            Text(HomeScreen.NAME)
            Button(onClick = {
                android.util.Log.d("testtttt" , "HomeScreen onClick $this")

                navController.navigate(NewsScreen.NAME)
            }) {

                Text("Go to NewsScreen")
            }
        }

    }
}