package navigation

import androidx.compose.runtime.Composable

object NavMonthScheduleScreen {
    @Composable
    fun init(
        defaultDestination: Boolean = false,
    ) {

    }
}

enum class DestinationMonthScheduleScreen {
    MainScreen,
    OrderScreen,
    MonthScheduleListScreen,
}