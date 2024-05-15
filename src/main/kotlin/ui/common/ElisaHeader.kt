package ui.common

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ElisaHeader(
    text: String,
    isMain: Boolean = true,
) {
    Text(
        text = text,
        fontWeight = FontWeight.W400,
        fontSize = if (isMain) 32.sp else 24.sp,
    )
}