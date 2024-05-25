package ui.common.buttons

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ElisaSmallItemButton(
    textButton: String,
    onButtonClick: () -> Unit = {},
) {
    TextButton(
        modifier = Modifier
            .size(width = 220.dp, height = 70.dp)
            .border(1.dp, Color.Companion.Gray, RoundedCornerShape(40.dp)),

        onClick = onButtonClick,
        content = {
            Text(
                text = textButton,
                fontSize = 12.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
            )
        },
    )
}