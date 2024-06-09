package navigation

import androidx.compose.runtime.*
import navigation.WeekScheduleDestination.*
import ui.address.AddAddressScreen
import ui.product.AddProductScreen
import ui.task.report.monthSchedule.MonthScheduleScreen
import ui.task.week.storage.ReportStorageScreen
import ui.task.week.week.WeekScheduleListScreen

object NavWeekScheduleScreen {

    @Composable
    fun init() {
        var navigation by remember { mutableStateOf(WeekScheduleScreen) }
        var predNavigation by remember { mutableStateOf(WeekScheduleScreen) }

        when (navigation) {
            MainScreen -> NavMainScreen.init()
            WeekScheduleScreen -> WeekScheduleListScreen(
                onItemClick = { navigation = it },
                onBackClick = { navigation = MainScreen },
            )

            ReportStorageScreen -> ReportStorageScreen {
                navigation = WeekScheduleScreen
            }

            MonthScheduleScreen -> MonthScheduleScreen(
                isTask = false,
                onAddProductClick = {
                    predNavigation = navigation
                    navigation = AddProductScreen
                },
                onAddAddressClick = {
                    predNavigation = navigation
                    navigation = AddAddressScreen
                },
                onBackClick = { navigation = WeekScheduleScreen }
            )

            AddProductScreen -> AddProductScreen {
                navigation = predNavigation
            }

            AddAddressScreen -> AddAddressScreen {
                navigation = predNavigation
            }
        }
    }
}

enum class WeekScheduleDestination {
    MainScreen,
    WeekScheduleScreen,
    ReportStorageScreen,
    MonthScheduleScreen,
    AddProductScreen,
    AddAddressScreen,
}