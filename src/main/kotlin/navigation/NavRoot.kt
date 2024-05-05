package navigation

import androidx.compose.runtime.*
import ui.*

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

object NavRouteSheetListScreen {
    @Composable
    fun init() {
        var navigation: RouteSheetDestination by
        remember { mutableStateOf(RouteSheetDestination.RouteSheetListScreen) }

        when (navigation) {
            RouteSheetDestination.RouteSheetListScreen ->
                RouteSheetListScreen(
                    onBackClick = { navigation = RouteSheetDestination.MainScreen },
                    onItemClick = { itemDestination -> navigation = itemDestination },
                )

            RouteSheetDestination.MainScreen -> NavMainScreen.init()

            RouteSheetDestination.WeekScheduleListScreen -> WeekScheduleListScreen(
                onBackClick = { navigation = RouteSheetDestination.RouteSheetListScreen }
            )

            RouteSheetDestination.AvailableVehicleListScreen -> AvailableVehicleListScreen(
                onBackClick = { navigation = RouteSheetDestination.RouteSheetListScreen }
            )
        }
    }
}

object NavMonthScheduleScreen {
    @Composable
    fun init(
        defaultDestination: Boolean = false,
    ) {

    }
}

enum class RootDestination {
    Authorization,
    MainScreen,
}

enum class MainScreenDestination {
    MainScreen,
    RouteSheetListScreen,
    MonthScheduleScreen,
    WeekScheduleScreen,
    ReportScreen,
}

enum class RouteSheetDestination {
    RouteSheetListScreen,
    MainScreen,
    WeekScheduleListScreen,
    AvailableVehicleListScreen,
}