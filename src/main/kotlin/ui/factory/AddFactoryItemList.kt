package ui.factory

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.FactoryModel
import ui.common.ElisaDivider
import ui.common.ElisaTextItem

@Composable
fun AddFactoryItemList(
    item: FactoryModel,
    color: Pair<Color, Color>,
    fieldWidthList: List<Dp>,
) {
    Row(
        modifier = Modifier
            .height(40.dp)
            .fillMaxWidth()
            .clickable {}
            .background(color = color.first),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        ElisaTextItem(
            text = item.id.toString(),
            textWidth = fieldWidthList[0],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.name,
            textWidth = fieldWidthList[1],
        )
    }
}