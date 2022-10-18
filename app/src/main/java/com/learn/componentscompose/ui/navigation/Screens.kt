package com.learn.componentscompose.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.Edit
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.navArgument
import com.learn.componentscompose.utils.*

sealed class Screen(
    internal val routeBase: String,
    val icon: ImageVector = Icons.Default.Done,
    val name: String,
    private val navArgs: List<NavArg> = emptyList()
) {
    object Buttons : Screen(
        routeBase = BUTTONS_ROUTE,
        icon = Icons.Default.Send,
        name = "Botones"
    )

    object Home : Screen(
        routeBase = HOME_ROUTE,
        icon = Icons.Default.Home,
        name = "Lista de Componentes"
    )

    object Text : Screen(
        routeBase = TEXT_ROUTE,
        icon = Icons.Outlined.Edit,
        name = "Textos",
        listOf(NavArg.TextSend)
    ) {
        fun createRoute(text: String) = "$routeBase/$text"
    }

    object TextField : Screen(
        routeBase = TEXTFILE_ROUTE,
        icon = Icons.Rounded.Edit,
        name = "Entradas de texto"
    )

    object Images : Screen(
        routeBase = IMAGES_ROUTE,
        icon = Icons.Rounded.AccountBox,
        name = "Imágenes y íconos"
    )

    object SelectElements : Screen(
        routeBase = CHECKS_ROUTE,
        icon = Icons.Rounded.CheckCircle,
        name = "Radio Buttons"
    )

    object CheckBox : Screen(
        routeBase = CHECKBOX_ROUTE,
        icon = Icons.Rounded.Check,
        name = "Check Box"
    )

    val route = run {
        val argValues = navArgs.map { "{${it.key}}" }
        listOf(routeBase)
            .plus(argValues)
            .joinToString("/")
    }

    val args = navArgs.map {
        navArgument(it.key) { type = it.navType }
    }
}

