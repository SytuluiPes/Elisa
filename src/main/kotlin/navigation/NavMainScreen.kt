package navigation

import androidx.compose.runtime.*
import ui.MainScreen

object NavMainScreen {
    @Composable
    fun init() {
        var navigation: MainScreenDestination by
        remember { mutableStateOf(MainScreenDestination.MainScreen) }

        when (navigation) {
            MainScreenDestination.MainScreen -> MainScreen(
                onItemClick = { itemDestination -> navigation = itemDestination }
            )

            MainScreenDestination.RouteSheetListScreen -> NavRouteSheetListScreen.init()

            MainScreenDestination.MonthScheduleScreen -> TODO()
            MainScreenDestination.WeekScheduleScreen -> TODO()
            MainScreenDestination.ReportScreen -> TODO()
        }
    }
}

enum class MainScreenDestination {
    MainScreen,
    RouteSheetListScreen,
    MonthScheduleScreen,
    WeekScheduleScreen,
    ReportScreen,
}