package com.example.log_in_page.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.log_in_page.Navigation.PostOfficeAppRouter
import com.example.log_in_page.Navigation.Screen
import com.example.log_in_page.Navigation.SystemBackButtonHandler
import com.example.log_in_page.components.HeadingTextComponent

@Composable
fun TermsAndConditionsScreen(){
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(16.dp)
    ) {
        HeadingTextComponent(value = "Term of Use")
    }
    SystemBackButtonHandler{
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }
}


