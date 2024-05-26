package ui.common

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ElisaTextItem(
    text: String,
    textWidth: Dp,
    fontSize: TextUnit = 12.sp,
) {
    Text(
        modifier = Modifier
            .width(textWidth)
            .padding(2.dp),
        text = text,
        fontSize = fontSize,
        textAlign = TextAlign.Start,
    )
}