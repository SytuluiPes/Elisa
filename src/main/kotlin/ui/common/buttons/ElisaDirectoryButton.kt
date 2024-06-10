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
fun ElisaDirectoryButton(
    textButton: String,
    onButtonClick: () -> Unit = {},
) {
    TextButton(
        modifier = Modifier
            .size(width = 600.dp, height = 45.dp)
            .border(1.dp, Color.Companion.Gray, RoundedCornerShape(15.dp)),
        onClick = onButtonClick,
        content = {
            Text(
                text = textButton,
                fontSize = 18.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
            )
        },
    )
}