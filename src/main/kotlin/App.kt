import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import androidx.sqlite.SQLiteConnection
import navigation.NavMainScreen
import util.Constant

lateinit var databaseConnection: SQLiteConnection

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
                onCloseRequest = {
//                    databaseConnection.close()
                    exitApplication()
                },
                state = windowSize,
                resizable = false,
                title = "Elisa",
            ) {
                NavMainScreen.init()
            }
        }
    }
}

fun main() {
//    DbAdapter.init()
    App()
}