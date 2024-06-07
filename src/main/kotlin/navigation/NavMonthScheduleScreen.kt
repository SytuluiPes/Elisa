package navigation

import androidx.compose.runtime.*
import navigation.DestinationMonthScheduleScreen.*
import ui.task.month.monthFactory.MonthFactoryScreen

object NavMonthScheduleScreen {
    var navigation: DestinationMonthScheduleScreen
            by remember { mutableStateOf(MonthScheduleListScreen) }

    var predNavigation: DestinationMonthScheduleScreen
            by remember { mutableStateOf(MonthScheduleListScreen) }

    @Composable
    fun init() {
        when (navigation) {
            MainScreen -> NavMainScreen.init()
            OrderScreen -> TODO()
            MonthFactoryScreen -> MonthFactoryScreen(
                onBackClick = { navigation = MonthScheduleListScreen }
            )

        }
    }
}

enum class DestinationMonthScheduleScreen {
    MainScreen,
    OrderScreen,
    MonthScheduleListScreen,
    MonthFactoryScreen,
}