package com.example.log_in_page.Navigation

import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcherOwner
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalLifecycleOwner

private val LocalBackPressedDispatcher=
    staticCompositionLocalOf<OnBackPressedDispatcherOwner?> { null }

private  class ComposableBackNavigationHandler(enabled:Boolean) : OnBackPressedCallback(enabled){
   lateinit var onBackPressed:()->Unit

     override fun handleOnBackPressed(){
        onBackPressed()
    }
}

@Composable
internal fun ComposableHandler(
    enabled: Boolean = true,
    onBackPressed: () -> Unit
) {
    val dispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher ?: return

    val handler = remember {
        ComposableBackNavigationHandler(enabled)
    }

    DisposableEffect(dispatcher) {
        dispatcher.addCallback(handler)
        onDispose { handler.remove() }
    }

    LaunchedEffect(enabled) {
        handler.isEnabled = enabled
        handler.onBackPressed = onBackPressed
    }
}


@Composable
internal fun SystemBackButtonHandler(onBackPressed: () -> Unit) {
    CompositionLocalProvider(
        LocalBackPressedDispatcher provides LocalLifecycleOwner.current as ComponentActivity
    ) {
        ComposableHandler(onBackPressed = onBackPressed)
    }
}
