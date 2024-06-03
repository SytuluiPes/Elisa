package ui.route.weekSchedule

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.ElisaHeaderText
import ui.common.ElisaTextField
import ui.common.buttons.FooterButtons
import ui.route.TableRouteModel
import util.Constant
import util.Constant.WEEK_TASK
import util.ElisaColor


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun WeekScheduleListScreen(
    onBackClick: () -> Unit,
) {
    var customerFio by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var productName by remember { mutableStateOf("") }
    var unit by remember { mutableStateOf("") }
    var count by remember { mutableStateOf("") }
    var total by remember { mutableStateOf("") }
    var dateDelivery by remember { mutableStateOf("") }
    var typeDelivery by remember { mutableStateOf("") }

    val fieldWidthList = listOf(60.dp, 150.dp, 250.dp, 120.dp, 150.dp, 80.dp, 80.dp, 110.dp, 120.dp, 140.dp)
    val headerList = remember {
        listOf(
            TableRouteModel(
                title = "Заказчик",
                width = 150,
                onValueChange = { customerFio = it }
            ),
            TableRouteModel(
                title = "Адрес",
                width = 150,
                onValueChange = { customerFio = it }
            ),
            TableRouteModel(
                title = "Заказчик",
                width = 150,
                onValueChange = { customerFio = it }
            ),
            TableRouteModel(
                title = "Заказчик",
                width = 150,
                onValueChange = { customerFio = it }
            ),
            TableRouteModel(
                title = "Заказчик",
                width = 150,
                onValueChange = { customerFio = it }
            ),
            TableRouteModel(
                title = "Заказчик",
                width = 150,
                onValueChange = { customerFio = it }
            ),
            TableRouteModel(
                title = "Заказчик",
                width = 150,
                onValueChange = { customerFio = it }
            )
        )
    }
    Column(
        modifier = Modifier
            .size(width = Constant.WINDOW_WIDTH - 20.dp, height = Constant.WINDOW_HEIGHT)
            .background(ElisaColor.MainBackground)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        ElisaHeader(
            text = WEEK_TASK,
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
                text = "Заказчик",
                textWidth = fieldWidthList[1],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Адрес",
                textWidth = fieldWidthList[2],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Телефон заказчика",
                textWidth = fieldWidthList[3],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Наименование продукции",
                textWidth = fieldWidthList[4],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Ед. изм.",
                textWidth = fieldWidthList[5],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Кол-во",
                textWidth = fieldWidthList[6],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Суммарная стоимость продукции",
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
            ElisaHeaderText(
                text = "Тип перевозки",
                textWidth = fieldWidthList[9],
            )
        }
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
                ElisaTextField(
                    text = address,
                    label = "Адрес",
                    onValueChange = { address = it }
                )
                ElisaTextField(
                    text = phoneNumber,
                    label = "Телефон",
                    onValueChange = { phoneNumber = it }
                )
                ElisaTextField(
                    text = productName,
                    label = "Наименование продукции",
                    onValueChange = { productName = it }
                )
                ElisaTextField(
                    text = unit,
                    label = "Ед. изм.",
                    onValueChange = { unit = it }
                )
                ElisaTextField(
                    text = count,
                    label = "Кол-во",
                    onValueChange = { count = it }
                )
                ElisaTextField(
                    text = total,
                    label = "Суммарная стоимость продукции",
                    onValueChange = { total = it }
                )
                ElisaTextField(
                    text = dateDelivery,
                    label = "Срок поставки",
                    onValueChange = { dateDelivery = it }
                )
                ElisaTextField(
                    text = typeDelivery,
                    label = "Тип перевозки",
                    onValueChange = { typeDelivery = it }
                )
            }
            FooterButtons(
                onAddClick = {
//                    if (isFilled) {
//                        itemList.add(
//                            VehicleModel(
//                                fioDriver = fio,
//                                phoneDriver = phoneNumber,
//                                vehicleNumber = carNumber,
//                                vehicleModel = makeAndModelCar,
//                                routeType = typeTransportation.asRouteType(),
//                            )
//                        )
//                        reset = true
//                    }
                },
                onDeleteClick = {},
                onCloseClick = onBackClick,
            )
        }
    }
}