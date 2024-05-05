package ui.authorization

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
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
