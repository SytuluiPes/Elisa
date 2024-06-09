package navigation

import androidx.compose.runtime.*
import navigation.RouteSheetDestination.*
import ui.product.AddProductScreen
import ui.task.route.route.RouteSheetListScreen
import ui.task.route.vehicle.AvailableVehicleScreen
import ui.task.week.week.WeekScheduleListScreen

object NavRouteSheetListScreen {
    @Composable
    fun init() {
        var predNavigation: RouteSheetDestination by
        remember { mutableStateOf(RouteSheetListScreen) }

        var navigation: RouteSheetDestination by
        remember { mutableStateOf(RouteSheetListScreen) }
        when (navigation) {
            RouteSheetListScreen ->
                RouteSheetListScreen(
                    onBackClick = { navigation = MainScreen },
                    onItemClick = { itemDestination -> navigation = itemDestination },
                )

            MainScreen -> NavMainScreen.init()

            WeekScheduleScreen -> WeekScheduleListScreen(
                isTask = false,
                onAddAddressClick = {
                    predNavigation = navigation
                    navigation = AddProductScreen
                },
                onAddProductItemClick = {
                    predNavigation = navigation
                    navigation = AddProductScreen
                },
                onBackClick = { navigation = RouteSheetListScreen }
            )

            AvailableVehicleListScreen -> AvailableVehicleScreen(
                onAddProductItemClick = {
                    predNavigation = navigation
                    navigation = AddProductScreen
                },
                onBackClick = { navigation = RouteSheetListScreen }
            )

            AddProductScreen -> AddProductScreen(
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