package com.learn.componentscompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.learn.componentscompose.ui.components.*

@Composable
fun RadioButtonsScreen(goBack: () -> Unit) {
    Scaffold(topBar = {
        AppBarCustom(goBack)
    }) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            TitleScreens(title = "Componentes Radio Buttons")
            Preview_MultipleRadioButtons()
            Preview_MultipleRadioButtonsWithCustomColors()
            Preview_CustomRadioButtonIndicator_WithIconToggleButton()
        }
    }
}