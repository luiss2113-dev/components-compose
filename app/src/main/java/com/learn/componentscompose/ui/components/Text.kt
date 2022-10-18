package com.learn.componentscompose.ui.components

import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun TextWithSize(label: String, size: TextUnit) {
    Text(label, fontSize = size)
}

@Composable
fun ColorText() {
    Text("Text Blue", color = Color.Blue)
}

@Composable
fun BoldText() {
    Text("Texto con Bold", fontWeight = FontWeight.Bold)
}

@Composable
fun ItalicText() {
    Text("texto con style Italic", fontStyle = FontStyle.Italic)
}

@Composable
fun MaxLines() {
    Text("repeat ".repeat(50), maxLines = 6)
}

@Composable
fun OverflowedText() {
    Text("Hola Compose ".repeat(50), maxLines = 2, overflow = TextOverflow.Ellipsis)
}

@Composable
fun SelectableText() {
    SelectionContainer {
        Text("Este texto se puede seleccionar")
    }
}

@Composable
fun TextUnderline() {
    Text(
        text = "Texto subrayado",
        style = TextStyle(
            color = Color.Black, fontSize = 24.sp,
            textDecoration = TextDecoration.Underline
        )
    )
}

@Composable
fun TextLineThrough() {
    Text(
        text = "Text tachado",
        style = TextStyle(
            color = Color.Blue, fontSize = 24.sp,
            textDecoration = TextDecoration.LineThrough
        )
    )
}

@Composable
fun TitleScreens(title: String, modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = title,
        style = MaterialTheme.typography.h4,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextTypeH1() {
    Text(
        text = "Texto tamaño H1",
        style = MaterialTheme.typography.h1
    )
}

@Composable
fun TextTypeH3() {
    Text(
        text = "Texto tañamo 3",
        style = MaterialTheme.typography.h3
    )
}

@Composable
fun TextTypeH6() {
    Text(
        text = "Texto tañamo 6",
        style = MaterialTheme.typography.h6
    )
}

