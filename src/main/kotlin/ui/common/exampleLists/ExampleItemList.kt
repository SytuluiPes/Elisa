package ui.common.exampleLists

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.VehicleModel
import ui.common.DiplomDivider
import ui.common.DiplomItemText
import util.Constant

@Composable
fun ExampleItemList(
    item: VehicleModel,
    color: Pair<Color, Color>,
) {
    Row(
        modifier = Modifier
            .height(40.dp)
            .width(Constant.WINDOW_WIDTH - 20.dp)
            .clickable {}
            .background(color = color.first)
            .padding(5.dp),
        horizontalArrangement = Arrangement.spacedBy(2.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        DiplomItemText(
            text = item.fioDriver,
            textWidth = 350.dp,
        )
        DiplomDivider(
            color = color.second,
            isHorizontal = false,
        )
        DiplomItemText(
            text = item.phoneDriver,
            textWidth = 200.dp,
        )
        DiplomDivider(
            color = color.second,
            isHorizontal = false,
        )
        DiplomItemText(
            text = item.vehicleNumber,
            textWidth = 150.dp,
        )
        DiplomDivider(
            color = color.second,
            isHorizontal = false,
        )
        DiplomItemText(
            text = item.vehicleModel,
            textWidth = 300.dp,
        )
        DiplomDivider(
            color = color.second,
            isHorizontal = false,
        )
        DiplomItemText(
            text = item.routeType.toString(),
            textWidth = 200.dp,
        )
    }
}