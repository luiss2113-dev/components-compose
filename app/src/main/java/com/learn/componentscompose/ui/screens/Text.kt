package com.learn.componentscompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.learn.componentscompose.ui.components.*

@Composable
fun TextScreen(args: String, goBack: () -> Unit) {

    Scaffold(topBar = {
        AppBarCustom(goBack)
    }) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            TitleScreens(title = args)
            TextWithSize("Texto customizable", 18.sp)
            ColorText()
            BoldText()
            ItalicText()
            MaxLines()
            OverflowedText()
            SelectableText()
            TextUnderline()
            TextLineThrough()
            TextTypeH1()
            TextTypeH3()
            TextTypeH6()
        }
    }
}