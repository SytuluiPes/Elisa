package ui.report.report

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.main.MonthReportModel
import util.Constant
import util.ElisaColor

private val exampleReportItemList = listOf(
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 380,
        total = 18155000,
        orderCount = 14,
    ),
    MonthReportModel(
        id = 2,
        productName = "Сухой бетон М11",
        unit = "мешки",
        count = 420,
        total = 1650000,
        orderCount = 6,
    ),
    MonthReportModel(
        id = 3,
        productName = "Красный огнеупорный кирпич М-200",
        unit = "паллеты",
        count = 120,
        total = 1230000,
        orderCount = 2,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 380,
        total = 18155000,
        orderCount = 14,
    ),
    MonthReportModel(
        id = 2,
        productName = "Сухой бетон М11",
        unit = "мешки",
        count = 420,
        total = 1650000,
        orderCount = 6,
    ),
    MonthReportModel(
        id = 3,
        productName = "Красный огнеупорный кирпич М-200",
        unit = "паллеты",
        count = 120,
        total = 1230000,
        orderCount = 2,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 380,
        total = 18155000,
        orderCount = 14,
    ),
    MonthReportModel(
        id = 2,
        productName = "Сухой бетон М11",
        unit = "мешки",
        count = 420,
        total = 1650000,
        orderCount = 6,
    ),
    MonthReportModel(
        id = 3,
        productName = "Красный огнеупорный кирпич М-200",
        unit = "паллеты",
        count = 120,
        total = 1230000,
        orderCount = 2,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 380,
        total = 18155000,
        orderCount = 14,
    ),
    MonthReportModel(
        id = 2,
        productName = "Сухой бетон М11",
        unit = "мешки",
        count = 420,
        total = 1650000,
        orderCount = 6,
    ),
    MonthReportModel(
        id = 3,
        productName = "Красный огнеупорный кирпич М-200",
        unit = "паллеты",
        count = 120,
        total = 1230000,
        orderCount = 2,
    ),
)

@Composable
fun ReportListTable(
    itemList: List<MonthReportModel> = exampleReportItemList,
    fieldWidthList: List<Dp>,
) {
    LazyColumn(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxHeight()
            .width(Constant.WINDOW_WIDTH - 20.dp)
            .border(
                width = 0.5.dp,
                color = Color.Black,
            ),
        userScrollEnabled = true,
    ) {
        itemList.forEachIndexed { index, item ->
            item {
                ReportItemList(
                    item = item,
                    color = if (index % 2 == 0)
                        Pair(ElisaColor.White, ElisaColor.LightBlue)
                    else
                        Pair(ElisaColor.LightBlue, ElisaColor.White),
                    fieldWidthList = fieldWidthList,
                )
            }
        }
    }
}