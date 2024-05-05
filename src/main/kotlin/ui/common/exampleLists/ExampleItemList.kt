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

@Composable
fun ExampleItemList(
    item: VehicleModel,
    color: Pair<Color, Color>,
) {
    Row(
        modifier = Modifier
            .height(40.dp)
            .width(800.dp)
            .clickable {}
            .background(color = color.first)
            .padding(5.dp),
        horizontalArrangement = Arrangement.spacedBy(2.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        DiplomItemText(
            text = item.fioDriver,
        )
        DiplomDivider(
            color = color.second,
            size = 1.dp,
            isHorizontal = false,
        )
        DiplomItemText(
            text = item.phoneDriver
        )
        DiplomDivider(
            color = color.second,
            size = 1.dp,
            isHorizontal = false,
        )
        DiplomItemText(
            text = item.vehicleNumber
        )
        DiplomDivider(
            color = color.second,
            size = 1.dp,
            isHorizontal = false,
        )
        DiplomItemText(
            text = item.vehicleModel
        )
        DiplomDivider(
            color = color.second,
            size = 1.dp,
            isHorizontal = false,
        )
        DiplomItemText(
            text = item.routeType.toString()
        )
    }
}