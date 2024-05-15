package ui.common.buttons

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ElisaButton(
    textButton: String,
    onButtonClick: () -> Unit = {},
) {
    TextButton(
        modifier = Modifier
            .size(width = 150.dp, height = 60.dp)
            .border(1.dp, Color.Black, RoundedCornerShape(15.dp)),
        onClick = onButtonClick,
        content = {
            Text(
                text = textButton,
                fontSize = 20.sp,
                color = Color.Black
            )
        },
    )
}