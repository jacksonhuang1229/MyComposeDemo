package com.example.mycompose2024

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

class NewsScreen {
    companion object {
        const val NAME = "NewsScreen"
    }
    @Composable
    fun Content(navController: NavHostController) {
        Scaffold() {
            it
            Column {
                Text(NAME)
                Button(onClick = {
                    android.util.Log.d("testtttt" , "$NAME onClick $this")
                    navController.navigate(TopicScreen.NAME)
                }) {
                    Text("Go to ${TopicScreen.NAME}")
                }
            }
        }
    }
}
