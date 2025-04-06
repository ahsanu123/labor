package org.iwaki.labor.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Suppress("FunctionName")
@Composable
fun HomeScreen(onProfileClick: (String) -> Unit) {
    val listId: List<String> = listOf("1", "2", "3", "4", "5", "6")

    Column {
        Text("Welcome to Home")

        listId.forEach { item ->
            Button(onClick = { onProfileClick(item) }) {
                Text("Click me!")
            }
        }
    }
}
