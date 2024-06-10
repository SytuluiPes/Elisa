package ui.common.buttons

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import util.ElisaColor

@Composable
fun ElisaButton(
    textButton: String,
    onButtonClick: () -> Unit = {},
) {
    TextButton(
        modifier = Modifier
            .padding(top = 8.dp)
            .size(width = 250.dp, height = 55.dp)
            .border(1.dp, ElisaColor.Gray, RoundedCornerShape(20.dp)),
        onClick = onButtonClick,
        content = {
            Text(
                text = textButton,
                textAlign = TextAlign.End,
                fontWeight = FontWeight.W500,
                fontSize = 16.sp,
                color = ElisaColor.DarkGray,
            )

        },
    )
}