package ui.route.vehicle

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.VehicleModel
import util.Constant

@Composable
fun VehicleTable(
    itemList: List<VehicleModel> = emptyList(),
    fieldWidthList: List<Dp>,
) {
    LazyColumn(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
            .height(350.dp)
            .width(Constant.WINDOW_WIDTH - 20.dp)
            .border(
                width = 0.5.dp,
                color = Color.Black,
            ),
        userScrollEnabled = true,
    ) {
        itemList.forEachIndexed { index, item ->
            item {
                VehicleItemList(
                    item = item,
                    color = if (index % 2 == 0)
                        Pair(Color(0xFFFFFFFF), Color(0xFFF0F3FF))
                    else
                        Pair(Color(0xFFF0F3FF), Color(0xFFFFFFFF)),
                    fieldWidthList = fieldWidthList,
                )
            }
        }
    }
}