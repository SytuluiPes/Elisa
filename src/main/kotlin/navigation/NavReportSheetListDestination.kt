package navigation

import androidx.compose.runtime.*
import ui.AddAddressScreen
import ui.AddProductScreen
import ui.report.listReport.ListReportScreen
import ui.report.monthSchedule.MonthScheduleScreen
import ui.report.report.ReportSheetListScreen

object NavReportSheetListDestination {
    @Composable
    fun init() {
        var navigation: ReportSheetDestination by
        remember { mutableStateOf(ReportSheetDestination.ReportSheetListScreen) }

        var predNavigation: ReportSheetDestination by
        remember { mutableStateOf(ReportSheetDestination.ReportSheetListScreen) }

        when (navigation) {
            ReportSheetDestination.ReportSheetListScreen -> ReportSheetListScreen(
                onBackClick = { navigation = ReportSheetDestination.MainScreen },
                onItemClick = { item -> navigation = item },
            )

            ReportSheetDestination.MainScreen -> NavMainScreen.init()

            ReportSheetDestination.MonthScheduleScreen -> MonthScheduleScreen(
                onAddAddressClick = {
                    predNavigation = navigation
                    navigation = ReportSheetDestination.AddAddressScreen
                },
                onAddProductClick = {
                    predNavigation = navigation
                    navigation = ReportSheetDestination.AddProductItemScreen
                },
                onBackClick = { navigation = ReportSheetDestination.ReportSheetListScreen },
            )

            ReportSheetDestination.ListReportScreen -> ListReportScreen(
                onBackClick = { navigation = ReportSheetDestination.ReportSheetListScreen },
                onAddAddressClick = {
                    predNavigation = navigation
                    navigation = ReportSheetDestination.AddAddressScreen
                },
                onAddProductItemClick = {
                    predNavigation = navigation
                    navigation = ReportSheetDestination.AddProductItemScreen
                },
            )

            ReportSheetDestination.AddAddressScreen -> AddAddressScreen(
                onBackClick = { navigation = predNavigation },
            )

            ReportSheetDestination.AddProductItemScreen -> AddProductScreen(
                onBackClick = { navigation = predNavigation }
            )
        }
    }
}

enum class ReportSheetDestination {
    MainScreen,
    ReportSheetListScreen,
    ListReportScreen,
    MonthScheduleScreen,
    AddAddressScreen,
    AddProductItemScreen,
}