package com.example.log_in_page.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.log_in_page.Navigation.PostOfficeAppRouter
import com.example.log_in_page.Navigation.Screen
import com.example.log_in_page.Screens.LoginScreen
import com.example.log_in_page.Screens.SignUpScreen
import com.example.log_in_page.Screens.TermsAndConditionsScreen

@Composable
fun PostOfficeApp(){
        Surface (
                  modifier = Modifier
                      .fillMaxSize(),
                  color= Color.White
                ) {
                Crossfade(targetState = PostOfficeAppRouter.currentScreen) { currentState->
                    when(currentState.value){
                        is Screen.SignUpScreen->{
                            SignUpScreen()
                        }
                        is Screen.TermsAndConditionsScreen->{
                            TermsAndConditionsScreen()
                        }
                        is Screen.LoginScreen->{
                            LoginScreen()
                        }
                    }
                    
                }
        }
}