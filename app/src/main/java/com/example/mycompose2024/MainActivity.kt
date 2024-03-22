package com.example.mycompose2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mycompose2024.ui.theme.MyCompose2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            MyCompose2024Theme {
                NavHost(navController = navController, startDestination = HomeScreen.NAME) {

                    var cnt = 0
                    composable(HomeScreen.NAME) {
                        android.util.Log.d("testtttt" , " ${cnt++} entry ${HomeScreen.NAME} $this")
                        HomeScreen().Content(navController)
                    }
                    composable(NewsScreen.NAME) {
                        android.util.Log.d("testtttt" , " ${cnt++} entry ${NewsScreen.NAME} $this")
                        NewsScreen().Content(navController)
                    }
                    composable(TopicScreen.NAME) {
                        android.util.Log.d("testtttt" , " ${cnt++} entry ${TopicScreen.NAME} $this")
                        TopicScreen().Content(navController)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCompose2024Theme {
        Greeting("Android")
    }
}