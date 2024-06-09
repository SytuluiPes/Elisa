package navigation

import androidx.compose.runtime.*
import navigation.DestinationMonthScheduleScreen.*
import ui.address.AddAddressScreen
import ui.product.AddProductScreen
import ui.task.month.monthFactory.MonthFactoryScreen
import ui.task.month.order.OrderScreen
import ui.task.report.monthSchedule.MonthScheduleScreen

object NavMonthScheduleScreen {
    @Composable
    fun init() {
        var navigation: DestinationMonthScheduleScreen
                by remember { mutableStateOf(MonthScheduleListScreen) }

        var predNavigation: DestinationMonthScheduleScreen
                by remember { mutableStateOf(MonthScheduleListScreen) }

        when (navigation) {
            MainScreen -> NavMainScreen.init()
            MonthScheduleListScreen -> MonthScheduleScreen(
                onBackClick = {
                    navigation = MainScreen
                },
                onItemClick = { navigation = it }
            )

            OrderScreen -> OrderScreen(
                onAddProductItemClick = {
                    predNavigation = navigation
                    navigation = AddProductScreen
                },
                onAddAddressItemClick = {
                    predNavigation = navigation
                    navigation = AddAddressScreen
                },
                onBackClick = {
                    navigation = MonthScheduleListScreen
                }

            )
            MonthFactoryScreen -> MonthFactoryScreen(
                onBackClick = {
                    navigation = MonthScheduleListScreen
                }
            )

            AddProductScreen -> AddProductScreen(
                onBackClick = {
                    navigation = predNavigation
                }
            )

            AddAddressScreen -> AddAddressScreen(
                onBackClick = {
                    navigation = predNavigation
                }
            )

        }
    }
}

enum class DestinationMonthScheduleScreen {
    MainScreen,
    OrderScreen,
    MonthScheduleListScreen,
    MonthFactoryScreen,
    AddProductScreen,
    AddAddressScreen,
}