package navigation

import androidx.compose.runtime.*
import ui.route.route.RouteSheetListScreen
import ui.route.vehicle.AvailableVehicleScreen
import ui.route.weekSchedule.WeekScheduleListScreen

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

            RouteSheetDestination.AvailableVehicleListScreen -> AvailableVehicleScreen(
                onBackClick = { navigation = RouteSheetDestination.RouteSheetListScreen }
            )
        }
    }
}

enum class RouteSheetDestination {
    RouteSheetListScreen,
    MainScreen,
    WeekScheduleListScreen,
    AvailableVehicleListScreen,
}