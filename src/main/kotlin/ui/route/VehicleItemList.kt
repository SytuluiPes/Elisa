package ui.route

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.VehicleModel
import ui.common.ElisaDivider
import ui.common.ElisaTextItem
import util.Constant

@Composable
fun VehicleItemList(
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
        verticalAlignment = Alignment.CenterVertically,
    ) {
        ElisaTextItem(
            text = item.fioDriver,
            textWidth = 350.dp,
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.phoneDriver,
            textWidth = 200.dp,
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.vehicleNumber,
            textWidth = 150.dp,
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.vehicleModel,
            textWidth = 300.dp,
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.routeType.toString(),
            textWidth = 200.dp,
        )
    }
}