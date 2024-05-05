import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import navigation.NavRoot

class App {
    init {
        application {
            val windowSize = rememberWindowState(size = DpSize(1000.dp, 600.dp))

            Window(
                onCloseRequest = ::exitApplication,
                state = windowSize,
                title = "Diplom",
            ) {
                NavRoot.init()
            }
        }
    }
}

fun main() {
    App()
}