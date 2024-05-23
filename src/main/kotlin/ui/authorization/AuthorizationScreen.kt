package ui.authorization

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.common.buttons.ElisaButton
import util.ElisaColor

@Composable
fun AuthorizationScreen(
    onButtonClick: () -> Unit
) {
    var login: String by remember { mutableStateOf("") }
    var pass: String by remember { mutableStateOf("") }

    var borderColor: Color by remember { mutableStateOf(ElisaColor.White) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ElisaColor.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Авторизация",
            fontWeight = FontWeight.W700,
            fontSize = 42.sp,
            color = ElisaColor.White,
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
        ElisaButton(
            textButton = "Войти",
            onButtonClick = {
                borderColor = if (login.isEmpty() || pass.isEmpty()) ElisaColor.Raspberry else ElisaColor.White
                if (borderColor != ElisaColor.Raspberry) {
                    onButtonClick()
                }
            },
        )
    }
}
