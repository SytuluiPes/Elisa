package ui.task.week.week

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
import navigation.WeekScheduleDestination
import navigation.WeekScheduleDestination.MonthScheduleScreen
import navigation.WeekScheduleDestination.ReportStorageScreen
import ui.HeaderTable
import ui.common.ElisaDivider
import ui.common.ElisaTextField
import ui.common.buttons.ElisaButton
import ui.common.buttons.ElisaSmallItemButton
import ui.common.buttons.FooterButtons
import util.Constant
import util.Constant.ADDRESS
import util.Constant.CLOSE
import util.Constant.COUNT
import util.Constant.CUSTOMER
import util.Constant.DATE_DELIVERY
import util.Constant.ID
import util.Constant.MONTH_TASK
import util.Constant.PHONE
import util.Constant.PRINT
import util.Constant.PRODUCT_LIST
import util.Constant.PRODUCT_NAME
import util.Constant.REPORT_STORAGE
import util.Constant.SOLUTION
import util.Constant.TOTAL
import util.Constant.TYPE_DELIVERY
import util.Constant.UNIT
import util.ElisaColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun WeekScheduleListScreen(
    isTask: Boolean = true,
    onItemClick: (WeekScheduleDestination) -> Unit = {},
    onAddAddressClick: () -> Unit = {},
    onAddProductItemClick: () -> Unit = {},
    onBackClick: () -> Unit,
) {
    var customerFio by remember { mutableStateOf("") }
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
            .fillMaxSize()
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
        if (isTask) {
            Spacer(Modifier.size(10.dp))
            ElisaDivider()
            Spacer(Modifier.size(5.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(600.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                HeaderTable(
                    headerNameList = headerNameList,
                    fieldWidthList = fieldWidthList,
                )
                WeekScheduleTable(
                    fieldWidthList = fieldWidthList,
                )
            }
        } else {
            Spacer(Modifier.size(2.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                HeaderTable(
                    headerNameList = headerNameList,
                    fieldWidthList = fieldWidthList,
                )
                WeekScheduleTable(
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
                    textButton = MONTH_TASK,
                    onButtonClick = { onItemClick(MonthScheduleScreen) },
                )
                ElisaSmallItemButton(
                    textButton = REPORT_STORAGE,
                    onButtonClick = { onItemClick(ReportStorageScreen) },
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
                        label = CUSTOMER,
                        onValueChange = { customerFio = it }
                    )
                    ElisaButton(
                        textButton = ADDRESS,
                        onButtonClick = onAddAddressClick,
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
                    onAddClick = {},
                    onDeleteClick = {},
                    onCloseClick = onBackClick,
                )
            }
        }
    }
}
