package ui.report.listReport

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
import data.model.OrderReportModel
import ui.common.ElisaDivider
import ui.common.ElisaTextItem

@Composable
fun ListReportItemList(
    item: OrderReportModel,
    color: Pair<Color, Color>,
    fieldWidthList: List<Dp>,
) {
    Row(
        modifier = Modifier
            .height(item.productList.size * 40.dp)
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
        Column(
            modifier = Modifier
                .width(fieldWidthList[1] + fieldWidthList[2] + fieldWidthList[3] + fieldWidthList[4] + 3.dp)
                .background(color.first),
        ) {
            for (productItem in item.productList) {
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    ElisaTextItem(
                        text = productItem.productName,
                        textWidth = fieldWidthList[1],
                    )
                    ElisaDivider(
                        color = color.second,
                        isHorizontal = false,
                    )
                    ElisaTextItem(
                        text = productItem.unit,
                        textWidth = fieldWidthList[2],
                    )
                    ElisaDivider(
                        color = color.second,
                        isHorizontal = false,
                    )
                    ElisaTextItem(
                        text = productItem.count.toString(),
                        textWidth = fieldWidthList[3],
                    )
                    ElisaDivider(
                        color = color.second,
                        isHorizontal = false,
                    )
                    ElisaTextItem(
                        text = productItem.total.toString(),
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
            text = item.customer,
            textWidth = fieldWidthList[5],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.addressModel.asString(),
            textWidth = fieldWidthList[6],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.dateDelivery,
            textWidth = fieldWidthList[7],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.dateDeliveryFact,
            textWidth = fieldWidthList[8],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.causeText,
            textWidth = fieldWidthList[9],
        )
    }
}