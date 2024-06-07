package ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.common.ElisaTextField
import ui.common.buttons.FooterButtons
import ui.task.route.weekSchedule.WeekScheduleTable
import util.Constant
import util.Constant.COUNT
import util.Constant.PRODUCT_LIST
import util.Constant.PRODUCT_NAME
import util.Constant.TOTAL
import util.Constant.UNIT
import util.ElisaColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AddProductScreen(
    onBackClick: () -> Unit,
) {
    var productName by remember { mutableStateOf("") }
    var unit by remember { mutableStateOf("") }
    var count by remember { mutableStateOf("") }
    var total by remember { mutableStateOf("") }

    val fieldWidthList = listOf(500.dp, 250.dp, 250.dp, 260.dp)
    Column(
        modifier = Modifier
            .size(width = Constant.WINDOW_WIDTH - 20.dp, height = Constant.WINDOW_HEIGHT)
            .background(ElisaColor.MainBackground)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        Text(
            text = PRODUCT_LIST,
            fontWeight = FontWeight.W400,
            fontSize = 24.sp,
        )
        Spacer(Modifier.size(2.dp))
        HeaderTable(
            headerNameList = listOf(PRODUCT_NAME, UNIT, COUNT, TOTAL),
            fieldWidthList = fieldWidthList,
        )
        WeekScheduleTable(fieldWidthList = fieldWidthList)
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            FlowRow(
                modifier = Modifier
                    .height(240.dp)
                    .width(600.dp)
                    .border(BorderStroke(0.5.dp, color = ElisaColor.Black), RoundedCornerShape(20))
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalArrangement = Arrangement.SpaceAround,
                maxItemsInEachRow = 2,
            ) {
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
                    text = total,
                    label = TOTAL,
                    onValueChange = { total = it }
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