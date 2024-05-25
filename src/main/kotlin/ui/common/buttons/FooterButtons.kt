package ui.common.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FooterButtons(
    onAddClick: () -> Unit,
    onDeleteClick: () -> Unit,
    onCloseClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .height(230.dp)
            .width(220.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterVertically),
    ) {
        ElisaSmallItemButton(
            textButton = "Добавить",
            onButtonClick = onAddClick,
        )
        ElisaSmallItemButton(
            textButton = "Удалить",
            onButtonClick = onDeleteClick,
        )
        ElisaSmallItemButton(
            textButton = "Закрыть",
            onButtonClick = onCloseClick,
        )
    }
}