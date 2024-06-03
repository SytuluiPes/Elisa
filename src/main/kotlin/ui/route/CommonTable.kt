package ui.route

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*

compose.runtime.*
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
import ui.route.weekSchedule.WeekScheduleTable
import util.Constant
import util.Constant.WEEK_TASK
import util.ElisaColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CommonTable(
    listItem: List<TableRouteModel>,
    onBackClick: () -> Unit,
) {
//    val fieldWidthList = listOf(60.dp, 150.dp, 250.dp, 120.dp, 150.dp, 80.dp, 80.dp, 110.dp, 120.dp, 140.dp)
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
                textWidth = 60.dp,
            )
            ElisaDivider(
                isHorizontal = false,
            )
            listItem.forEachIndexed { index, item ->
                ElisaHeaderText(
                    text = item.title,
                    textWidth = item.width.dp,
                )
                if (index < listItem.lastIndex) {
                    ElisaDivider(
                        isHorizontal = false,
                    )
                }
            }
        }
        WeekScheduleTable(fieldWidthList = emptyList())
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
                listItem.forEach { item ->
                    var fieldState by remember { mutableStateOf("") }
                    ElisaTextField(
                        text = fieldState,
                        label = item.title,
                        onValueChange = {
                            fieldState = it
                            item.onValueChange(it)
                        }
                    )
                }
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