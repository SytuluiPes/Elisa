package ui.weekSchedule

import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable

@Composable
fun WeekScheduleScreen(
    onBackClick: () -> Unit,
) {
    TextButton(onClick = onBackClick) {
        Text("Back to MainScreen")
    }
}