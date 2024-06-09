package ui.task.week.storage

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.model.ReportStorageModel
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.ElisaHeaderText
import ui.common.ElisaTextField
import ui.common.buttons.FooterButtons
import util.Constant.ARTICLE
import util.Constant.CHECKER_FIO
import util.Constant.CHECK_DATE
import util.Constant.COUNT
import util.Constant.ID
import util.Constant.PRICE
import util.Constant.PRODUCT_NAME
import util.Constant.REPORT_STORAGE
import util.Constant.TOTAL
import util.Constant.UNIT
import util.Constant.WINDOW_WIDTH
import util.ElisaColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ReportStorageScreen(
    itemList: List<ReportStorageModel> = emptyList(),
    onBackClick: () -> Unit,
) {
    var article by remember { mutableStateOf("") }
    var productName by remember { mutableStateOf("") }
    var unit by remember { mutableStateOf("") }
    var count by remember { mutableStateOf("") }
    var price by remember { mutableStateOf("") }
    var total by remember { mutableStateOf("") }
    var checkDate by remember { mutableStateOf("") }
    var checkerFio by remember { mutableStateOf("") }

    val fieldWidthList = listOf(60.dp, 100.dp, 300.dp, 150.dp, 100.dp, 100.dp, 100.dp, 150.dp, 200.dp)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ElisaColor.MainBackground)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        ElisaHeader(
            text = REPORT_STORAGE,
            isMain = false,
        )
        Spacer(Modifier.size(10.dp))
        ElisaDivider()
        Spacer(Modifier.size(5.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                    .height(60.dp)
                    .width(WINDOW_WIDTH - 20.dp)
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                    .background(Color(0xFF464859)),
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
                    text = ARTICLE,
                    textWidth = fieldWidthList[1],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = PRODUCT_NAME,
                    textWidth = fieldWidthList[2],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = UNIT,
                    textWidth = fieldWidthList[3],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = COUNT,
                    textWidth = fieldWidthList[4],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = PRICE,
                    textWidth = fieldWidthList[5],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = TOTAL,
                    textWidth = fieldWidthList[6],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = CHECK_DATE,
                    textWidth = fieldWidthList[7],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = CHECKER_FIO,
                    textWidth = fieldWidthList[8],
                )
            }
            ReportStorageTable(
                fieldWidthList = fieldWidthList,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            FlowRow(
                modifier = Modifier
                    .height(240.dp)
                    .width(1000.dp)
                    .border(BorderStroke(0.5.dp, color = ElisaColor.Black), RoundedCornerShape(20))
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalArrangement = Arrangement.SpaceAround,
                maxItemsInEachRow = 3,
            ) {
                ElisaTextField(
                    text = article,
                    label = ARTICLE,
                    onValueChange = { article = it }
                )
                ElisaTextField(
                    text = productName,
                    label = PRODUCT_NAME,
                    onValueChange = { productName = it }
                )
                ElisaTextField(
                    text = unit,
                    label = UNIT,
                    onValueChange = { unit = it }
                )
                ElisaTextField(
                    text = count,
                    label = COUNT,
                    onValueChange = { count = it }
                )
                ElisaTextField(
                    text = price,
                    label = PRICE,
                    onValueChange = { price = it }
                )
                ElisaTextField(
                    text = total,
                    label = TOTAL,
                    onValueChange = { total = it }
                )
                ElisaTextField(
                    text = checkDate,
                    label = CHECK_DATE,
                    onValueChange = { checkDate = it }
                )
                ElisaTextField(
                    text = checkerFio,
                    label = CHECKER_FIO,
                    onValueChange = { checkerFio = it }
                )
            }
            FooterButtons(
                onAddClick = {},
                onDeleteClick = {},
                onCloseClick = onBackClick,
            )
        }
    }
}