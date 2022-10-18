package com.learn.componentscompose.ui.navigation

import androidx.navigation.NavType

enum class NavArg(val key: String,
                  val navType: NavType<*>) {
    TextSend("text", NavType.StringType),
}