package navigation

import androidx.compose.runtime.*
import ui.AddProductScreen
import ui.route.route.RouteSheetListScreen
import ui.route.vehicle.AvailableVehicleScreen
import ui.route.weekSchedule.WeekScheduleListScreen

object NavRouteSheetListScreen {
    @Composable
    fun init() {
        var predNavigation: RouteSheetDestination by
        remember { mutableStateOf(RouteSheetDestination.RouteSheetListScreen) }

        var navigation: RouteSheetDestination by
        remember { mutableStateOf(RouteSheetDestination.RouteSheetListScreen) }
        when (navigation) {
            RouteSheetDestination.RouteSheetListScreen ->
                RouteSheetListScreen(
                    onBackClick = { navigation = RouteSheetDestination.MainScreen },
                    onItemClick = { itemDestination -> navigation = itemDestination },
                )

            RouteSheetDestination.MainScreen -> NavMainScreen.init()

            RouteSheetDestination.WeekScheduleScreen -> WeekScheduleListScreen(
                onAddProductItemClick = {
                    predNavigation = navigation
                    navigation = RouteSheetDestination.AddProductScreen
                },
                onBackClick = { navigation = RouteSheetDestination.RouteSheetListScreen }
            )

            RouteSheetDestination.AvailableVehicleListScreen -> AvailableVehicleScreen(
                onAddProductItemClick = {
                    predNavigation = navigation
                    navigation = RouteSheetDestination.AddProductScreen
                },
                onBackClick = { navigation = RouteSheetDestination.RouteSheetListScreen }
            )

            RouteSheetDestination.AddProductScreen -> AddProductScreen(
                onBackClick = { navigation = predNavigation }
            )
        }
    }
}

enum class RouteSheetDestination {
    RouteSheetListScreen,
    MainScreen,
    WeekScheduleScreen,
    AvailableVehicleListScreen,
    AddProductScreen,
}