package navigation

import androidx.compose.runtime.*
import ui.authorization.AuthorizationScreen

object NavRoot {
    @Composable
    fun init() {
        var navigation: RootDestination by
        remember { mutableStateOf(RootDestination.Authorization) }

        when (navigation) {
            RootDestination.Authorization -> AuthorizationScreen(
                onButtonClick = { navigation = RootDestination.MainScreen }
            )

            RootDestination.MainScreen -> NavMainScreen.init()
        }
    }
}

enum class RootDestination {
    Authorization,
    MainScreen,
}
