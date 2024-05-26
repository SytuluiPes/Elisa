package ui.route.route

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.times
import data.RouteItemModel
import ui.common.ElisaDivider
import ui.common.ElisaTextItem
import util.Constant

@Composable
fun RouteItemList(
    item: RouteItemModel,
    color: Pair<Color, Color>,
    fieldWidthList: List<Dp>,
) {
    Row(
        modifier = Modifier
            .height(item.productList.size * 40.dp)
            .width(Constant.WINDOW_WIDTH - 20.dp)
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
            text = item.address,
            textWidth = fieldWidthList[1],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        Column(
            modifier = Modifier
                .height(item.productList.size * 40.dp)
                .width(fieldWidthList[2] + fieldWidthList[3] + fieldWidthList[4] + 3.dp),
        ) {
            for (productItem in item.productList) {
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .width(fieldWidthList[2] + fieldWidthList[3] + fieldWidthList[4] + 2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    ElisaTextItem(
                        text = productItem.productName,
                        textWidth = fieldWidthList[2],
                    )
                    ElisaDivider(
                        color = color.second,
                        isHorizontal = false,
                    )
                    ElisaTextItem(
                        text = productItem.unit,
                        textWidth = fieldWidthList[3],
                    )
                    ElisaDivider(
                        color = color.second,
                        isHorizontal = false,
                    )
                    ElisaTextItem(
                        text = productItem.count.toString(),
                        textWidth = fieldWidthList[4],
                    )
                }
                ElisaDivider(
                    color = color.second,
                )
            }
        }
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.phoneNumber,
            textWidth = fieldWidthList[5],
        )
    }
}