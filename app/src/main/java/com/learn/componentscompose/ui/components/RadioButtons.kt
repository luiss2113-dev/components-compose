package com.learn.componentscompose.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.learn.componentscompose.R
import com.learn.componentscompose.ui.data.local.FakeData.itemsList
import com.learn.componentscompose.ui.data.local.FakeData.textToEnableList


@Composable
fun Preview_MultipleRadioButtons() {
    val selectedValue = remember { mutableStateOf("") }

    val isSelectedItem: (String) -> Boolean = { selectedValue.value == it }
    val onChangeState: (String) -> Unit = { selectedValue.value = it }

    Column(Modifier.padding(8.dp)) {
        Text(text = "Valor seleccionado: ${selectedValue.value.ifEmpty { "NONE" }}")
        itemsList.forEach { item ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .selectable(
                        selected = isSelectedItem(item),
                        onClick = { onChangeState(item) },
                        role = Role.RadioButton
                    )
                    .padding(8.dp)
            ) {
                RadioButton(
                    selected = isSelectedItem(item),
                    onClick = null
                )
                Text(
                    text = item,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Composable
fun Preview_MultipleRadioButtonsWithCustomColors() {
    val selectedValue = remember { mutableStateOf("") }

    val isSelectedItem: (String) -> Boolean = { selectedValue.value == it }
    val onChangeState: (String) -> Unit = { selectedValue.value = it }

    Column(Modifier.padding(8.dp)) {
        Text(text = "Valor seleccionado: ${selectedValue.value.ifEmpty { "NONE" }}")
        textToEnableList.forEach { textToEnableState ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .selectable(
                        selected = isSelectedItem(textToEnableState.first),
                        enabled = textToEnableState.second,
                        onClick = { onChangeState(textToEnableState.first) }
                    )
                    .padding(8.dp)
            ) {
                RadioButton(
                    selected = isSelectedItem(textToEnableState.first),
                    onClick = null,
                    colors = RadioButtonDefaults.colors(
                        selectedColor = Color.Green,
                        unselectedColor = Color.Red,
                        disabledColor = Color.LightGray
                    ),
                    enabled = textToEnableState.second
                )
                Text(
                    text = textToEnableState.first,
                    color = when {
                        isSelectedItem(textToEnableState.first) -> Color.Green
                        !textToEnableState.second -> Color.LightGray
                        else -> Color.Red
                    }
                )
            }
        }
    }
}

@Composable
fun Preview_CustomRadioButtonIndicator_WithIconToggleButton() {

    val selectedValue = remember { mutableStateOf("") }

    Column(Modifier.padding(8.dp)) {
        Text(text = "Valor seleccionado: ${selectedValue.value.ifEmpty { "NONE" }}")
        itemsList.forEach { item ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .selectable(
                        selected = (selectedValue.value == item),
                        onClick = { selectedValue.value = item },
                        role = Role.RadioButton
                    )
                    .padding(8.dp)
            ) {
                IconToggleButton(
                    checked = selectedValue.value == item,
                    onCheckedChange = { selectedValue.value = item },
                    modifier = Modifier.size(24.dp)
                ) {
                    Icon(
                        painter = painterResource(
                            if (selectedValue.value == item) {
                                R.drawable.ic_baseline_check_
                            } else {
                                R.drawable.ic_check_circle_outline
                            }
                        ),
                        contentDescription = null,
                        tint = MaterialTheme.colors.primary
                    )
                }
                Text(
                    text = item,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}