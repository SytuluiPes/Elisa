package ui.common

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun DiplomItemText(
    text: String,
    fontSize: TextUnit = 12.sp,
) {
    Text(
        text = text,
        fontSize = fontSize,
        textAlign = TextAlign.Start,
    )
}