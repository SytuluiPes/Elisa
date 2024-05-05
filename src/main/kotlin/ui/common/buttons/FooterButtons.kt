package ui.common.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FooterButtons(
    onAddClick: () -> Unit,
    onCloseClick: () -> Unit,
) {
    Row(
        modifier = Modifier.size(height = 60.dp, width = 600.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        DiplomSmallItemButton(
            textButton = "Добавить",
            onButtonClick = onAddClick,
        )
        DiplomSmallItemButton(
            textButton = "Закрыть",
            onButtonClick = onCloseClick,
        )
    }
}