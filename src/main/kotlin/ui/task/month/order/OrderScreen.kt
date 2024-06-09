package ui.task.month.order

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
import util.Constant.UNIT
import util.ElisaColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun OrderScreen(
    onAddProductItemClick: () -> Unit,
    onAddAddressItemClick: () -> Unit,
    onBackClick: () -> Unit,
) {
    var customerFio by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var dateDelivery by remember { mutableStateOf("") }

    val headerNameList = listOf(
        ID,
        CUSTOMER,
        ADDRESS,
        PHONE,
        DATE_DELIVERY,
        PRODUCT_NAME,
        UNIT,
        COUNT,
        TOTAL,
    )
    val fieldWidthList = listOf(60.dp, 150.dp, 220.dp, 130.dp, 100.dp, 280.dp, 100.dp, 100.dp, 110.dp)
    Column(
        modifier = Modifier
            .size(width = Constant.WINDOW_WIDTH - 20.dp, height = Constant.WINDOW_HEIGHT)
            .background(ElisaColor.MainBackground)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        Text(
            text = Constant.ORDER_LIST,
            fontWeight = FontWeight.W400,
            fontSize = 24.sp,
        )
        Spacer(Modifier.size(2.dp))
        HeaderTable(
            headerNameList = headerNameList,
            fieldWidthList = fieldWidthList,
        )
        OrderTable(fieldWidthList = fieldWidthList)
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
                    onButtonClick = onAddAddressItemClick,
                )
                ElisaTextField(
                    text = phoneNumber,
                    label = PHONE,
                    onValueChange = { phoneNumber = it }
                )
                ElisaTextField(
                    text = dateDelivery,
                    label = DATE_DELIVERY,
                    onValueChange = { dateDelivery = it }
                )
                ElisaButton(
                    textButton = PRODUCT_LIST,
                    onButtonClick = onAddProductItemClick,
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
