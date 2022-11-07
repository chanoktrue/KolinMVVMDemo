package com.chanoktrue.mvvmdemo

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _count = mutableStateOf(0) // in keep data
    val count: State<Int> = _count // it show ui

    fun onAdd() {
        _count.value = _count.value + 1
    }
}