package ui.task.report.report

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.model.MonthReportModel
import navigation.ReportSheetDestination
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.ElisaHeaderText
import ui.common.buttons.ElisaSmallItemButton
import util.Constant
import util.Constant.CLOSE
import util.Constant.COUNT
import util.Constant.ID
import util.Constant.LIST_REPORT
import util.Constant.MONTH_TASK
import util.Constant.ORDER_COUNT
import util.Constant.PRINT
import util.Constant.PRODUCT_NAME
import util.Constant.REPORT_TASK
import util.Constant.SOLUTION
import util.Constant.TOTAL
import util.Constant.UNIT
import util.ElisaColor

private val exampleReportSheetList = listOf(
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
    MonthReportModel(
        id = 1,
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 685,
        total = 13850000,
        orderCount = 32,
    ),
    MonthReportModel(
        id = 2,
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 540,
        total = 18421000,
        orderCount = 24,
    ),
)

@Composable
fun ReportSheetListScreen(
    itemList: List<MonthReportModel> = exampleReportSheetList,
    onBackClick: () -> Unit,
    onItemClick: (ReportSheetDestination) -> Unit,
) {
    val fieldWidthList = listOf(60.dp, 350.dp, 200.dp, 200.dp, 250.dp, 200.dp)
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFE8E8E8)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Spacer(Modifier.size(15.dp))
        ElisaHeader(
            text = REPORT_TASK,
            isMain = false,
        )
        Spacer(Modifier.size(10.dp))
        ElisaDivider()
        Spacer(Modifier.size(5.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                    .height(60.dp)
                    .width(Constant.WINDOW_WIDTH - 20.dp)
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                    .background(ElisaColor.DarkBlue),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                ElisaHeaderText(
                    text = ID,
                    textWidth = fieldWidthList[0],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = PRODUCT_NAME,
                    textWidth = fieldWidthList[1],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = UNIT,
                    textWidth = fieldWidthList[2],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = COUNT,
                    textWidth = fieldWidthList[3],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = TOTAL,
                    textWidth = fieldWidthList[4],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = ORDER_COUNT,
                    textWidth = fieldWidthList[5],
                )
            }
            ReportListTable(
                itemList = itemList,
                fieldWidthList = fieldWidthList,
            )
        }
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            ElisaSmallItemButton(
                textButton = LIST_REPORT,
                onButtonClick = { onItemClick(ReportSheetDestination.ListReportScreen) },
            )
            ElisaSmallItemButton(
                textButton = MONTH_TASK,
                onButtonClick = { onItemClick(ReportSheetDestination.MonthScheduleScreen) },
            )
            ElisaSmallItemButton(
                textButton = SOLUTION,
            )
            ElisaSmallItemButton(
                textButton = PRINT,
            )
            ElisaSmallItemButton(
                textButton = CLOSE,
                onButtonClick = onBackClick,
            )
        }
    }
}