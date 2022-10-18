package com.learn.componentscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.learn.componentscompose.ui.navigation.SetupNavGraph
import com.learn.componentscompose.ui.theme.ComponentsComposeTheme
import com.learn.componentscompose.utils.HOME_ROUTE

@ExperimentalMaterialApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentsComposeTheme {

                val navController = rememberNavController()
                SetupNavGraph(navController = navController, homeRoute = HOME_ROUTE)

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComponentsComposeTheme {
        Greeting("Android")
    }
}