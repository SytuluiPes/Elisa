package ui.authorization

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AutorizationItem(
    label: String,
    text: String,
    borderColor: Color? = null,
    onValueChange: (String) -> Unit,
) {
    MaterialTheme {
        Column(
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = label,
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.W600,
                fontSize = 22.sp,
            )
            Spacer(Modifier.size(5.dp))
            Box {
                TextField(
                    modifier = if (borderColor != null && text.isEmpty())
                        Modifier.height(60.dp).border(BorderStroke(1.dp, borderColor))
                    else
                        Modifier.height(60.dp),
                    value = text,
                    textStyle = TextStyle(fontSize = 18.sp),
                    colors = TextFieldDefaults.textFieldColors(Color.Blue),
                    onValueChange = onValueChange,
                    singleLine = true,
                )
            }
        }
    }
}