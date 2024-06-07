package ui.task.month.monthFactory

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.model.MonthFactoryItemModel
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.ElisaHeaderText
import ui.common.ElisaTextField
import ui.common.buttons.FooterButtons
import util.Constant
import util.Constant.ARTICLE
import util.Constant.COUNT
import util.Constant.DATE_END
import util.Constant.DATE_START
import util.Constant.FACTORY
import util.Constant.MONTH_TASK
import util.Constant.PRODUCT_NAME
import util.Constant.TOTAL
import util.Constant.UNIT
import util.ElisaColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MonthFactoryScreen(
    itemList: List<MonthFactoryItemModel> = emptyList(),
    onBackClick: () -> Unit,
) {
    var article by remember { mutableStateOf("") }
    var productName by remember { mutableStateOf("") }
    var unit by remember { mutableStateOf("") }
    var count by remember { mutableStateOf("") }
    var dateStart by remember { mutableStateOf("") }
    var dateEnd by remember { mutableStateOf("") }
    var total by remember { mutableStateOf("") }
    var factoryId by remember { mutableStateOf("") }

    val fieldWidthList = listOf(60.dp, 120.dp, 350.dp, 120.dp, 120.dp, 120.dp, 120.dp, 120.dp, 130.dp)
    Column(
        modifier = Modifier
            .size(width = Constant.WINDOW_WIDTH - 20.dp, height = Constant.WINDOW_HEIGHT)
            .background(ElisaColor.MainBackground)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        ElisaHeader(
            text = MONTH_TASK,
            isMain = false,
        )
        Spacer(Modifier.size(2.dp))
        Row(
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                .height(60.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(Color(0xFF464859)),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            ElisaHeaderText(
                text = "№ п/п",
                textWidth = fieldWidthList[0],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Артикул",
                textWidth = fieldWidthList[1],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Наименование продукции",
                textWidth = fieldWidthList[2],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Ед. изм.",
                textWidth = fieldWidthList[3],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Кол-во",
                textWidth = fieldWidthList[4],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Суммарная стоимость продукции",
                textWidth = fieldWidthList[5],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Дата начала",
                textWidth = fieldWidthList[6],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Дата окончания",
                textWidth = fieldWidthList[7],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Номер цеха",
                textWidth = fieldWidthList[8],
            )
        }
        MonthFactoryTable(
            fieldWidthList = fieldWidthList,
        )
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
                    text = total,
                    label = TOTAL,
                    onValueChange = { total = it }
                )
                ElisaTextField(
                    text = dateStart,
                    label = DATE_START,
                    onValueChange = { dateStart = it }
                )
                ElisaTextField(
                    text = dateEnd,
                    label = DATE_END,
                    onValueChange = { dateEnd = it }
                )
                ElisaTextField(
                    text = factoryId,
                    label = FACTORY,
                    onValueChange = { factoryId = it }
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