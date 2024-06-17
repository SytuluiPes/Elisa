package navigation

import androidx.compose.runtime.*
import navigation.MainScreenDestination.MainScreen
import ui.MainScreen
import ui.address.AddAddressScreen
import ui.factory.AddFactoryScreen
import ui.product.AddProductScreen

object NavMainScreen {
    @Composable
    fun init() {
        var navigation: MainScreenDestination by
        remember { mutableStateOf(MainScreen) }

        when (navigation) {
            MainScreen -> MainScreen(
                onItemClick = { itemDestination -> navigation = itemDestination }
            )

            MainScreenDestination.RouteSheetListScreen -> NavRouteSheetListScreen.init()

            MainScreenDestination.MonthScheduleScreen -> NavMonthScheduleScreen.init()
            MainScreenDestination.WeekScheduleScreen -> NavWeekScheduleScreen.init()
            MainScreenDestination.ReportSheetListScreen -> NavReportSheetListDestination.init()
            MainScreenDestination.AddProductScreen -> AddProductScreen {
                navigation = MainScreen
            }

            MainScreenDestination.AddAddressScreen -> AddAddressScreen {
                navigation = MainScreen
            }
            MainScreenDestination.AddFactoryScreen -> AddFactoryScreen {
                navigation = MainScreen
            }
        }
    }
}

enum class MainScreenDestination {
    MainScreen,
    RouteSheetListScreen,
    MonthScheduleScreen,
    WeekScheduleScreen,
    ReportSheetListScreen,
    AddProductScreen,
    AddAddressScreen,
    AddFactoryScreen,
}