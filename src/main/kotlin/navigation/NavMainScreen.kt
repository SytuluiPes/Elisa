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

            MainScreenDestination.MonthScheduleScreen -> NavMonthScheduleScreen.init()
            MainScreenDestination.WeekScheduleScreen -> NavWeekScheduleScreen.init()
            MainScreenDestination.ReportSheetListScreen -> NavReportSheetListDestination.init()
        }
    }
}

enum class MainScreenDestination {
    MainScreen,
    RouteSheetListScreen,
    MonthScheduleScreen,
    WeekScheduleScreen,
    ReportSheetListScreen,
}