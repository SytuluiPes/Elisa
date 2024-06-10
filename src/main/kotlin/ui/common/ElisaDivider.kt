package ui.common

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import util.ElisaColor

@Composable
fun ElisaDivider(
    color: Color = ElisaColor.White,
    size: Dp = 2.dp,
    horizontalSize: Dp = 1.dp,
    isHorizontal: Boolean = true,
) {
    Divider(
        modifier = if (!isHorizontal) {
            Modifier
                .fillMaxHeight()
                .width(1.dp)
        } else Modifier
            .fillMaxWidth()
            .height(horizontalSize),
        color = color,
        thickness = size,
    )
}