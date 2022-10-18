package com.learn.componentscompose.ui.domain.models

data class Option(
    var checked: Boolean,
    var onCheckedChange: (Boolean) -> Unit = {},
    val label: String,
    var enabled: Boolean = true
)