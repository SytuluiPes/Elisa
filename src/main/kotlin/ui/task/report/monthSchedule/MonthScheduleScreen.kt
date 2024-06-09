package ui.task.report.monthSchedule

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.model.MonthScheduleItemModel
import navigation.DestinationMonthScheduleScreen
import navigation.DestinationMonthScheduleScreen.MonthFactoryScreen
import navigation.DestinationMonthScheduleScreen.OrderScreen
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.ElisaHeaderText
import ui.common.ElisaTextField
import ui.common.buttons.ElisaButton
import ui.common.buttons.ElisaSmallItemButton
import ui.common.buttons.FooterButtons
import util.Constant.ADDRESS
import util.Constant.CLOSE
import util.Constant.MONTH_FACTORY
import util.Constant.MONTH_TASK
import util.Constant.ORDER_LIST
import util.Constant.PRINT
import util.Constant.PRODUCT_LIST
import util.Constant.SOLUTION
import util.Constant.WINDOW_WIDTH
import util.ElisaColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MonthScheduleScreen(
    isTask: Boolean = true,
    itemList: List<MonthScheduleItemModel> = emptyList(),
    onItemClick: (DestinationMonthScheduleScreen) -> Unit = {},
    onAddAddressClick: () -> Unit = {},
    onAddProductClick: () -> Unit = {},
    onBackClick: () -> Unit,
) {
    var customerFio by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var dateDelivery by remember { mutableStateOf("") }

    val fieldWidthList = listOf(60.dp, 190.dp, 150.dp, 80.dp, 100.dp, 200.dp, 250.dp, 110.dp, 120.dp)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ElisaColor.MainBackground)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        ElisaHeader(
            text = MONTH_TASK,
            isMain = false,
        )
        Spacer(Modifier.size(10.dp))
        ElisaDivider()
        if (isTask) {
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
                        .width(WINDOW_WIDTH - 20.dp)
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
                        text = "Наименование продукции",
                        textWidth = fieldWidthList[1],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Ед. изм.",
                        textWidth = fieldWidthList[2],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Кол-во",
                        textWidth = fieldWidthList[3],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Суммарная стоимость продукции",
                        textWidth = fieldWidthList[4],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Заказчик",
                        textWidth = fieldWidthList[5],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Адрес",
                        textWidth = fieldWidthList[6],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Телефон заказчика",
                        textWidth = fieldWidthList[7],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Срок поставки",
                        textWidth = fieldWidthList[8],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                }
                MonthScheduleTable(
                    fieldWidthList = fieldWidthList,
                )
            }
        } else {
            Spacer(Modifier.size(2.dp))
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
                        text = "№ п/п",
                        textWidth = fieldWidthList[0],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Наименование продукции",
                        textWidth = fieldWidthList[1],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Ед. изм.",
                        textWidth = fieldWidthList[2],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Кол-во",
                        textWidth = fieldWidthList[3],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Суммарная стоимость продукции",
                        textWidth = fieldWidthList[4],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Заказчик",
                        textWidth = fieldWidthList[5],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Адрес",
                        textWidth = fieldWidthList[6],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Телефон заказчика",
                        textWidth = fieldWidthList[7],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                    ElisaHeaderText(
                        text = "Срок поставки",
                        textWidth = fieldWidthList[8],
                    )
                    ElisaDivider(
                        isHorizontal = false,
                    )
                }
                MonthScheduleTable(
                    fieldWidthList = fieldWidthList,
                )
            }
        }
        if (isTask) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceAround,
            ) {
                ElisaSmallItemButton(
                    textButton = ORDER_LIST,
                    onButtonClick = { onItemClick(OrderScreen) },
                )
                ElisaSmallItemButton(
                    textButton = MONTH_FACTORY,
                    onButtonClick = { onItemClick(MonthFactoryScreen) },
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
        } else {
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
                        text = customerFio,
                        label = "Заказчик",
                        onValueChange = { customerFio = it }
                    )
                    ElisaButton(
                        textButton = ADDRESS,
                        onButtonClick = onAddAddressClick,
                    )
                    ElisaTextField(
                        text = phoneNumber,
                        label = "Телефон",
                        onValueChange = { phoneNumber = it }
                    )
                    ElisaButton(
                        textButton = PRODUCT_LIST,
                        onButtonClick = onAddProductClick,
                    )
                    ElisaTextField(
                        text = dateDelivery,
                        label = "Срок поставки",
                        onValueChange = { dateDelivery = it }
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
}