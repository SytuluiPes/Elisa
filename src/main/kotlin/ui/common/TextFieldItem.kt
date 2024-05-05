package ui.common

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextFieldItem(
    label: String,
    text: String,
    borderColor: Color? = null,
    onValueChange: (String) -> Unit,
) {
    Row(
        modifier = Modifier
            .size(height = 60.dp, width = 300.dp)
            .background(Color(0xFFE5DCDC)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(
            modifier = Modifier.width(120.dp),
            text = label,
            fontWeight = FontWeight.W400,
            fontSize = 16.sp,
            maxLines = 2,
        )
        Spacer(Modifier.size(5.dp))
        TextField(
            modifier = Modifier.width(175.dp)
                .align(Alignment.Bottom)
                .border(
                    if (borderColor != null && text.isEmpty())
                        BorderStroke(1.dp, borderColor) else BorderStroke(0.dp, Color.White)
                ),
            value = text,
            textStyle = TextStyle(fontSize = 18.sp),
            colors = TextFieldDefaults.textFieldColors(Color.Blue),
            onValueChange = onValueChange,
            singleLine = true,
        )
    }
}