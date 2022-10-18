package com.learn.componentscompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.learn.componentscompose.ui.components.*

@Composable
fun ImagesScreen(goBack: () -> Unit) {
    Scaffold(topBar = {
        AppBarCustom(goBack)
    }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(15.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleScreens(title = "Botónes e íconos")
            ImageNetworkBasic()
            ImageNetworkPlaceHolder()
            ImageNetworkPlaceHolderWithError()
        }
    }
}