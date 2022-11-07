package com.chanoktrue.mvvmdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.chanoktrue.mvvmdemo.ui.theme.MVVMDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainVM: MainViewModel by viewModels()
        setContent {
            MVVMDemoTheme {
              Greeting(mainVM)
            }
        }
    }
}

@Composable
fun Greeting(mainVM: MainViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Number: ${mainVM.count.value.toString()}"
        )

        OutlinedButton(onClick = {
            mainVM.onAdd()
        }) {
            Text(text = "Add")
        }
    }
}

