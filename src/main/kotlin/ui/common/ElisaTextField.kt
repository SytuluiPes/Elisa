package ui.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import util.ElisaColor

@Composable
fun ElisaTextField(
    text: String,
    borderColor: Color?,
    onValueChange: (String) -> Unit,
) {
    OutlinedTextField(
        modifier = Modifier
            .height(60.dp)
            .background(ElisaColor.White)
            .border(BorderStroke(1.dp, borderColor ?: ElisaColor.Gray)),
        value = text,
        textStyle = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.W400),
        colors = TextFieldDefaults.textFieldColors(ElisaColor.Raspberry),
        onValueChange = onValueChange,
        singleLine = true,
    )
}