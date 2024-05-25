package ui.route

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
            .background(color = color.first)
            .padding(5.dp, 5.dp, 5.dp, 0.dp),
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
                .width(550.dp),
        ) {
            for (productItem in item.productList) {
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .width(550.dp),
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
                    ElisaDivider(
                        color = color.second,
                        isHorizontal = false,
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