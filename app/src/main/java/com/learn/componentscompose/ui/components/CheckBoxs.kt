package com.learn.componentscompose.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxColors
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.learn.componentscompose.ui.data.local.FakeData.gameReleases
import com.learn.componentscompose.ui.domain.models.Option

@Composable
fun LabelledCheckbox(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: CheckboxColors = CheckboxDefaults.colors()
) {
    Row(
        modifier = modifier.height(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Checkbox(
            checked = checked,
            onCheckedChange = onCheckedChange,
            enabled = enabled,
            colors = colors
        )
        Spacer(Modifier.width(32.dp))
        Text(label)
    }
}

@Composable
fun CheckboxList(options: List<Option>, listTitle: String) {
    Column {
        Text(listTitle, textAlign = TextAlign.Justify)
        Spacer(Modifier.size(8.dp))
        options.forEach { option ->
            LabelledCheckbox(
                checked = option.checked,
                onCheckedChange = option.onCheckedChange,
                label = option.label,
                enabled = option.enabled
            )
        }
    }
}

@Composable
fun DisabledCheckboxExample() {

    val options = gameReleases.map { option ->
        val checked = remember { mutableStateOf(false) }
        Option(
            checked = checked.value,
            onCheckedChange = { checked.value = it },
            label = option
        )
    }

    val numberOfMarks = options.count { it.checked }

    if (numberOfMarks == 2) {
        options
            .filterNot { option -> option.checked }
            .forEach { unchecked -> unchecked.enabled = false }
    }

    CheckboxList(
        options = options,
        listTitle = "Selecciona dos juegos:"
    )
}