package ui.common

import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DiplomDivider(
    color: Color = Color.White,
    size: Dp = 2.dp,
) {
    Divider(
        color = color,
        thickness = size,
    )
}