package com.learn.componentscompose.ui.navigation

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.learn.componentscompose.ui.screens.*
import com.learn.componentscompose.utils.composableArgs
import com.learn.componentscompose.utils.findArg

@ExperimentalMaterialApi
@Composable
fun SetupNavGraph(
    navController: NavHostController,
    homeRoute: String
) {

    NavHost(navController = navController, startDestination = homeRoute) {

        composable(Screen.Home.route) {
            MainScreen(navController = navController)
        }

        composableArgs(Screen.Text) { backEntry ->
            val args = backEntry.findArg<String>(NavArg.TextSend.key)
            TextScreen(
                args
            ) { navController.popBackStack() }
        }

        composable(Screen.Buttons.route) {
            ButtonsScreen { navController.popBackStack() }
        }

        composable(Screen.Images.route) {
            ImagesScreen { navController.popBackStack() }
        }

        composable(Screen.TextField.route) {
            TextFieldScreen(goBack = { navController.popBackStack() })
        }

        composable(Screen.TextField.route) {
            TextFieldScreen(goBack = { navController.popBackStack() })
        }
        composable(Screen.SelectElements.route) {
            RadioButtonsScreen(goBack = { navController.popBackStack() })
        }
        composable(Screen.CheckBox.route) {
            CheckBoxScreen(goBack = { navController.popBackStack() })
        }

    }

}
