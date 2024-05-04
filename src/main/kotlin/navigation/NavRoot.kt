package navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import ui.*

object NavRoot {
    private var navigation: RootDestination by mutableStateOf(RootDestination.Authorization)

    @Composable
    fun init() {
        when (navigation) {
            RootDestination.Authorization -> AuthorizationScreen(
                onButtonClick = { navigation = RootDestination.MainScreen }
            )

            RootDestination.MainScreen -> NavMainScreen.init()
        }
    }
}

object NavMainScreen {
    private var navigation: MainScreenDestination by mutableStateOf(MainScreenDestination.MainScreen)

    @Composable
    fun init(
        defaultDestination: MainScreenDestination? = null
    ) {
        if (defaultDestination != null) {
            navigation = defaultDestination
        }
        when (navigation) {
            MainScreenDestination.MainScreen -> MainScreen(
                onItemClick = { destination -> navigation = destination }
            )

            MainScreenDestination.RouteSheetListScreen -> NavRouteSheetListScreen.init(
                RouteSheetDestination.RouteSheetListScreen
            )

            MainScreenDestination.MonthScheduleScreen -> TODO()
            MainScreenDestination.WeekScheduleScreen -> TODO()
            MainScreenDestination.ReportScreen -> TODO()
        }
    }
}

object NavRouteSheetListScreen {
    private var navigation: RouteSheetDestination by mutableStateOf(
        RouteSheetDestination.RouteSheetListScreen
    )

    @Composable
    fun init(
        defaultDestination: RouteSheetDestination? = null
    ) {
        if (defaultDestination != null) {
            navigation = defaultDestination
        }
        when (navigation) {
            RouteSheetDestination.RouteSheetListScreen ->
                RouteSheetListScreen(
                    onBackClick = { navigation = RouteSheetDestination.MainScreen }
                )

            RouteSheetDestination.MainScreen -> NavMainScreen.init(MainScreenDestination.MainScreen)
            RouteSheetDestination.WeekScheduleListScreen -> WeekScheduleListScreen(
                onBackClick = { navigation = RouteSheetDestination.RouteSheetListScreen }
            )

            RouteSheetDestination.AvailableVehicleListScreen -> AvailableVehicleListScreen(
                onBackClick = { navigation = RouteSheetDestination.RouteSheetListScreen }
            )
        }
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