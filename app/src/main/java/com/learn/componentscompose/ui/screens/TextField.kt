package com.learn.componentscompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.learn.componentscompose.ui.components.*

@Composable
fun TextFieldScreen(
    goBack: () -> Unit
) {
    Scaffold(topBar = {
        AppBarCustom(goBack)
    }) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {

            TitleScreens(title = "Componentes de TexFields")

            SimpleTextField()

            LabelAndPlaceHolder()

            TextFieldWithInputType()

            OutLineTextFieldSample()

            TextFieldWithIcons()

        }
    }
}