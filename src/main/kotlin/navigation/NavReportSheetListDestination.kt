package navigation

import androidx.compose.runtime.*
import ui.monthSchedule.MonthScheduleScreen
import ui.report.listReport.ListReportScreen
import ui.report.report.ReportSheetListScreen

object NavReportSheetListDestination {
    @Composable
    fun init() {
        var navigation: ReportSheetDestination by
        remember { mutableStateOf(ReportSheetDestination.ReportSheetListScreen) }

        when (navigation) {
            ReportSheetDestination.ReportSheetListScreen -> ReportSheetListScreen(
                onBackClick = { navigation = ReportSheetDestination.MainScreen },
                onItemClick = { item -> navigation = item },
            )

            ReportSheetDestination.MainScreen -> NavMainScreen.init()

            ReportSheetDestination.MonthScheduleScreen -> MonthScheduleScreen(
                onBackClick = { navigation = ReportSheetDestination.ReportSheetListScreen },
            )

            ReportSheetDestination.ListReportScreen -> ListReportScreen(
                onBackClick = { navigation = ReportSheetDestination.ListReportScreen },
            )
        }
    }
}

enum class ReportSheetDestination {
    MainScreen,
    ReportSheetListScreen,
    ListReportScreen,
    MonthScheduleScreen,
}