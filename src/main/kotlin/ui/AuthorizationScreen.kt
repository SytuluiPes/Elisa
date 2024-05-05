package ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.common.buttons.DiplomButton

@Composable
fun AuthorizationScreen(
    onButtonClick: () -> Unit
) {
    var login: String by remember { mutableStateOf("") }
    var pass: String by remember { mutableStateOf("") }

    var borderColor: Color? by remember { mutableStateOf(null) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Авторизация",
            fontWeight = FontWeight.W400,
            fontSize = 32.sp,
        )
        Spacer(Modifier.size(60.dp))
        AutorizationItem(
            label = "Логин:",
            text = login,
            borderColor = borderColor,
            onValueChange = { login = it },
        )
        Spacer(Modifier.size(30.dp))
        AutorizationItem(
            label = "Пароль:",
            text = pass,
            borderColor = borderColor,
            onValueChange = { pass = it },
        )
        Spacer(Modifier.size(30.dp))
        DiplomButton(
            textButton = "Войти",
            onButtonClick = onButtonClick,
//            { // TODO(Check login)
//                borderColor = if (login.isEmpty() || pass.isEmpty()) Color.Red else null
//                if (borderColor != Color.Red) {
//                    onButtonClick()
//                }
//            },
        )
    }
}

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
