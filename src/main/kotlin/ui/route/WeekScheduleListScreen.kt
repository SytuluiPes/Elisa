package ui.route

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ui.common.DiplomHeader
import ui.common.TextFieldItem
import ui.common.buttons.FooterButtons
import ui.common.exampleLists.AvailableVehicleList

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun WeekScheduleListScreen(
    onBackClick: () -> Unit,
) {
    var customerFio by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var productName by remember { mutableStateOf("") }
    var units by remember { mutableStateOf("") }
    var count by remember { mutableStateOf("") }
    var total by remember { mutableStateOf("") }
    var dateDelivery by remember { mutableStateOf("") }
    var typeTransportation by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8E8E8))
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(2.dp),
    ) {
        Spacer(Modifier.size(3.dp))
        DiplomHeader(
            text = "Перечень доступных транспортных средств",
            isMain = false,
        )
        AvailableVehicleList()
        FlowRow(
            modifier = Modifier
                .padding(10.dp)
                .height(210.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            maxItemsInEachRow = 3,
        ) {
            TextFieldItem(
                text = customerFio,
                label = "Заказчик:",
                onValueChange = { customerFio = it }
            )
            TextFieldItem(
                text = address,
                label = "Адрес:",
                onValueChange = { address = it }
            )
            TextFieldItem(
                text = phoneNumber,
                label = "Телефон заказчика:",
                onValueChange = { phoneNumber = it }
            )
            TextFieldItem(
                text = productName,
                label = "Наименование продукции:",
                onValueChange = { productName = it }
            )
            TextFieldItem(
                text = units,
                label = "Ед.изм.:",
                onValueChange = { units = it }
            )
            TextFieldItem(
                text = count,
                label = "Кол-во:",
                onValueChange = { count = it }
            )
            TextFieldItem(
                text = total,
                label = "Стоимость продукции:",
                onValueChange = { total = it }
            )
            TextFieldItem(
                text = dateDelivery,
                label = "Срок поставки:",
                onValueChange = { dateDelivery = it }
            )
            TextFieldItem(
                text = typeTransportation,
                label = "Тип перевозки:",
                onValueChange = { typeTransportation = it }
            )
        }
        FooterButtons(
            //TODO()
            onAddClick = {},
            onCloseClick = onBackClick,
        )
    }
}