package ui

import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable

@Composable
fun ReportScreen(
    onBackClick: () -> Unit,
) {
    TextButton(onClick = onBackClick) {
        Text("Back to MainScreen")
    }
}