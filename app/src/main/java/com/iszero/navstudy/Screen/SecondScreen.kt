package com.iszero.navstudy.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun SecondScreen(navController: NavHostController) {
    Column {
        Text(text = "Second Screen")
        Button(onClick = {
            navController.navigate("first")
        }) {
            Text(text = "go back")
        }
    }
}