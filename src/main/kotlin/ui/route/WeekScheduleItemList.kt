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
import data.AddressModel
import data.WeekScheduleItemModel
import ui.common.ElisaDivider
import ui.common.ElisaTextItem

@Composable
fun WeekScheduleItemList(
    item: WeekScheduleItemModel,
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
        ElisaTextItem(
            text = item.customer,
            textWidth = fieldWidthList[1],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.address.asString(),
            textWidth = fieldWidthList[2],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.phoneNumber,
            textWidth = fieldWidthList[3],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        Column(
            modifier = Modifier
                .height(item.productList.size * 40.dp)
                .width(fieldWidthList[4] + fieldWidthList[5] + fieldWidthList[6] + fieldWidthList[7]),
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
                        textWidth = fieldWidthList[4],
                    )
                    ElisaDivider(
                        color = color.second,
                        isHorizontal = false,
                    )
                    ElisaTextItem(
                        text = productItem.unit,
                        textWidth = fieldWidthList[5],
                    )
                    ElisaDivider(
                        color = color.second,
                        isHorizontal = false,
                    )
                    ElisaTextItem(
                        text = productItem.count.toString(),
                        textWidth = fieldWidthList[6],
                    )
                    ElisaDivider(
                        color = color.second,
                        isHorizontal = false,
                    )
                    ElisaTextItem(
                        text = productItem.total.toString(),
                        textWidth = fieldWidthList[7],
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
            text = item.dateDelivery,
            textWidth = fieldWidthList[8],
        )
        ElisaDivider(
            color = color.second,
            isHorizontal = false,
        )
        ElisaTextItem(
            text = item.typeDelivery,
            textWidth = fieldWidthList[9],
        )
    }
}

private fun AddressModel.asString() =
    "${this.index}, ${this.region}, ${this.town}, ${this.street}, ${this.house}"