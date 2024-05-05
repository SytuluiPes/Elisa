import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import navigation.NavRoot
import util.Constant

class App {
    init {
        application {
            val windowSize = rememberWindowState(
                size = DpSize(
                    width = Constant.WINDOW_WIDTH,
                    height = Constant.WINDOW_HEIGHT,
                )
            )

            Window(
                onCloseRequest = ::exitApplication,
                state = windowSize,
                resizable = false,
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