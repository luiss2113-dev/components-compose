package com.learn.componentscompose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.learn.componentscompose.ui.components.TitleScreens
import com.learn.componentscompose.ui.navigation.Screen

@Composable
fun MainScreen(
    navController: NavController
) {
    val itemsScreen = Screen::class.sealedSubclasses
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(15.dp),
            contentPadding = PaddingValues(vertical = 20.dp, horizontal = 10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            item {
                TitleScreens(title = "Componentes - Jetpack Compose")
                Spacer(modifier = Modifier.size(10.dp))
            }
            items(itemsScreen) { screen ->
                if (screen.objectInstance != Screen.Home) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp)
                            .padding(5.dp)
                            .background(
                                Color.LightGray.copy(0.2f),
                                RoundedCornerShape(15.dp)
                            )
                            .clickable {
                                when (screen.objectInstance) {
                                    is Screen.Text -> navController.navigate(
                                        Screen.Text.createRoute("Componentes de texto")
                                    )
                                    else -> {
                                        navController.navigate(
                                            screen.objectInstance?.route ?: Screen.Home.route
                                        )
                                    }
                                }
                            },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Spacer(modifier = Modifier.size(5.dp))
                        Icon(
                            imageVector = screen.objectInstance?.icon!!,
                            contentDescription = screen.objectInstance?.icon?.name
                        )

                        Spacer(modifier = Modifier.size(15.dp))

                        Text(
                            screen.objectInstance?.name ?: "Route",
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}