package com.iszero.navstudy.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun FirstScreen(navController: NavHostController) {
    Column {
        Text(text = "First Screen")
        Button(onClick = {
            navController.navigate("second")
        }) {
            Text(text = "go Second")
        }
    }
}