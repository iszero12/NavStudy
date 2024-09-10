package com.iszero.navstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iszero.navstudy.Screen.FirstScreen
import com.iszero.navstudy.Screen.SecondScreen
import com.iszero.navstudy.ui.theme.NavStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavStudyTheme {
                val navController = rememberNavController()

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController,startDestination = "first",
                        //첫화면 지정
                        Modifier.padding(innerPadding))
                    //나브 콘트롤러에 모디피어 넣으면 스크린에 안넣어도 됨
                        {composable("first"){//각각 주소 설정
                            FirstScreen(navController)
                        }
                        composable("second"){
                            SecondScreen(navController)
                        }

                    }
                }
            }
        }
    }
}
