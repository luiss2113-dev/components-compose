package com.learn.componentscompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.learn.componentscompose.ui.components.*
import com.learn.componentscompose.ui.data.local.FakeData.optionsDisciplines
import com.learn.componentscompose.ui.domain.models.Option

@Composable
fun CheckBoxScreen(goBack: () -> Unit) {
    Scaffold(topBar = {
        AppBarCustom(goBack)
    }) {

        val checkedLabel = remember { mutableStateOf(true) }

        val options = optionsDisciplines.map {
            val checked = remember { mutableStateOf(false) }
            Option(
                checked = checked.value,
                onCheckedChange = { checked.value = it },
                label = it,
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            TitleScreens(title = "Componentes CheckBox")
            LabelledCheckbox(
                checked = checkedLabel.value,
                onCheckedChange = { checkedLabel.value = it },
                label = "Checkbox con etiqueta"
            )
            CheckboxList(options = options, listTitle = "Disciplinas")
            DisabledCheckboxExample()
        }
    }
}