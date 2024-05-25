package ui.authorization

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import util.ElisaColor

@Composable
fun AuthorizationTextItem(
    label: String,
    text: String,
    borderColor: Color = Color.White,
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
                color = ElisaColor.White,
            )
            Spacer(Modifier.size(5.dp))
            OutlinedTextField(
                modifier = if (text.isEmpty())
                    Modifier
                        .height(60.dp)
                        .clip(RoundedCornerShape(40))
                        .border(BorderStroke(2.dp, borderColor), RoundedCornerShape(40))
                else
                    Modifier
                        .height(60.dp)
                        .clip(RoundedCornerShape(40))
                        .border(BorderStroke(2.dp, borderColor), RoundedCornerShape(40)),
                value = text,
                textStyle = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.W400),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = ElisaColor.Raspberry,
                    focusedIndicatorColor = borderColor,
                    cursorColor = borderColor,
                ),
                onValueChange = onValueChange,
                singleLine = true,
            )
        }
    }
}