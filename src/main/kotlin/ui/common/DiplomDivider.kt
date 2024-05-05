package ui.common

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DiplomDivider(
    color: Color = Color.White,
    size: Dp = 2.dp,
    isHorizontal: Boolean = true,
) {
    Divider(
        modifier = if (!isHorizontal) {
            Modifier
                .height(40.dp)
                .width(1.dp)
        } else Modifier,
        color = color,
        thickness = size,
    )
}