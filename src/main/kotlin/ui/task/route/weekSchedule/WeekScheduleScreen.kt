package ui.task.route.weekSchedule

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
import ui.HeaderTable
import ui.common.ElisaTextField
import ui.common.buttons.ElisaButton
import ui.common.buttons.FooterButtons
import util.Constant
import util.Constant.ADDRESS
import util.Constant.COUNT
import util.Constant.CUSTOMER
import util.Constant.DATE_DELIVERY
import util.Constant.ID
import util.Constant.PHONE
import util.Constant.PRODUCT_LIST
import util.Constant.PRODUCT_NAME
import util.Constant.TOTAL
import util.Constant.TYPE_DELIVERY
import util.Constant.UNIT
import util.ElisaColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun WeekScheduleListScreen(
    onAddProductItemClick: () -> Unit,
    onBackClick: () -> Unit,
) {
    var customerFio by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var dateDelivery by remember { mutableStateOf("") }
    var typeDelivery by remember { mutableStateOf("") }

    val headerNameList = listOf(
        ID,
        CUSTOMER,
        ADDRESS,
        PHONE,
        PRODUCT_NAME,
        UNIT,
        COUNT,
        TOTAL,
        DATE_DELIVERY,
        TYPE_DELIVERY,
    )
    val fieldWidthList = listOf(60.dp, 150.dp, 250.dp, 120.dp, 150.dp, 80.dp, 80.dp, 110.dp, 120.dp, 140.dp)
    Column(
        modifier = Modifier
            .size(width = Constant.WINDOW_WIDTH - 20.dp, height = Constant.WINDOW_HEIGHT)
            .background(ElisaColor.MainBackground)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        Text(
            text = Constant.WEEK_TASK,
            fontWeight = FontWeight.W400,
            fontSize = 24.sp,
        )
        Spacer(Modifier.size(2.dp))
        HeaderTable(
            headerNameList = headerNameList,
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
                    .width(1000.dp)
                    .border(BorderStroke(0.5.dp, color = ElisaColor.Black), RoundedCornerShape(20))
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalArrangement = Arrangement.SpaceAround,
                maxItemsInEachRow = 3,
            ) {
                ElisaTextField(
                    text = customerFio,
                    label = CUSTOMER,
                    onValueChange = { customerFio = it }
                )
                ElisaTextField(
                    text = address,
                    label = ADDRESS,
                    onValueChange = { address = it }
                )
                ElisaTextField(
                    text = phoneNumber,
                    label = PHONE,
                    onValueChange = { phoneNumber = it }
                )
                ElisaButton(
                    textButton = PRODUCT_LIST,
                    onButtonClick = onAddProductItemClick,
                )
                ElisaTextField(
                    text = dateDelivery,
                    label = DATE_DELIVERY,
                    onValueChange = { dateDelivery = it }
                )
                ElisaTextField(
                    text = typeDelivery,
                    label = TYPE_DELIVERY,
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
