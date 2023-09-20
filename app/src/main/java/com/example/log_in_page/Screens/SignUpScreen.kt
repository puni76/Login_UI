package com.example.log_in_page.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.log_in_page.R
import com.example.log_in_page.Navigation.PostOfficeAppRouter
import com.example.log_in_page.Navigation.Screen
import com.example.log_in_page.components.*


@Composable
fun SignUpScreen (){

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    )
        {
            Column(modifier = Modifier.fillMaxSize()) {
                NormalTextComponent(value = "Login")

                HeadingTextComponent(value = "Welcome Back")

                Spacer(modifier = Modifier.height(20.dp))
                MyTextField(labelValue = "First Name"){
                    Icon(painter = painterResource(id = R.drawable.profile), contentDescription = "first name")
                }

                MyTextField(labelValue = "Last Name"){
                    Icon(painter = painterResource(id = R.drawable.profile), contentDescription = "last name")
                }
//
                MyTextField(labelValue = "Email") {
                    Icon(painter = painterResource(id = R.drawable.email), contentDescription = "email")
                }

                PasswordTextField(labelValue = "Password")
//
                Spacer(modifier = Modifier.height(20.dp))

                CheckBox(value = "",
                    onTextSelected = {
                        PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                    },

                )

                Spacer(modifier = Modifier.height(20.dp))

                ButtonComponent(value = "Signup")

                Spacer(modifier = Modifier.height(20.dp))


                DividerTextComponent()
                ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
                })
            }
//
        }
    }


