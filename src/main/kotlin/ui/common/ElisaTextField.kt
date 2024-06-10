package ui.common

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import util.ElisaColor

@Composable
fun ElisaTextField(
    label: String,
    text: String,
    borderColor: Color = ElisaColor.Black,
    onValueChange: (String) -> Unit,
) {
    OutlinedTextField(
        modifier = Modifier
            .height(65.dp)
            .width(250.dp),
        value = text,
        label = {
            Text(
                text = label,
                color = ElisaColor.Black,
            )
        },
        textStyle = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.W500,
            textAlign = TextAlign.Start,
        ),
        colors = TextFieldDefaults.textFieldColors(
            textColor = ElisaColor.Black,
            backgroundColor = ElisaColor.White,
            focusedIndicatorColor = borderColor,
            cursorColor = borderColor,
        ),
        shape = RoundedCornerShape(40),
        onValueChange = onValueChange,
        singleLine = true,
    )
}