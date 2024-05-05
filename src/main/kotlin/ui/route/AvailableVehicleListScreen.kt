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
import data.VehicleModel
import data.VehicleModel.RouteType.Cargo
import data.VehicleModel.RouteType.Documents
import ui.common.DiplomHeader
import ui.common.TextFieldItem
import ui.common.buttons.FooterButtons
import ui.common.exampleLists.ExampleColumnList

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AvailableVehicleListScreen(
    onBackClick: () -> Unit,
    itemList: List<VehicleModel> = listOf(
        VehicleModel(
            fioDriver = "Ковалев Артем Александрович",
            phoneDriver = "89203334411",
            vehicleNumber = "M316BA",
            vehicleModel = "Hyndai Salaris",
            routeType = Documents,
        ),
        VehicleModel(
            fioDriver = "Евгеньев Александр Викторович",
            phoneDriver = "89212092411",
            vehicleNumber = "А321TA",
            vehicleModel = "Scania 2011",
            routeType = Cargo,
        ),
        VehicleModel(
            fioDriver = "Ковалев Артем Александрович",
            phoneDriver = "89203334411",
            vehicleNumber = "M316BA",
            vehicleModel = "Hyndai Salaris",
            routeType = Documents,
        ),
        VehicleModel(
            fioDriver = "Евгеньев Александр Викторович",
            phoneDriver = "89212092411",
            vehicleNumber = "А321TA",
            vehicleModel = "Scania 2011",
            routeType = Cargo,
        ),
        VehicleModel(
            fioDriver = "Ковалев Артем Александрович",
            phoneDriver = "89203334411",
            vehicleNumber = "M316BA",
            vehicleModel = "Hyndai Salaris",
            routeType = Documents,
        ),
        VehicleModel(
            fioDriver = "Евгеньев Александр Викторович",
            phoneDriver = "89212092411",
            vehicleNumber = "А321TA",
            vehicleModel = "Scania 2011",
            routeType = Cargo,
        ),
        VehicleModel(
            fioDriver = "Ковалев Артем Александрович",
            phoneDriver = "89203334411",
            vehicleNumber = "M316BA",
            vehicleModel = "Hyndai Salaris",
            routeType = Documents,
        ),
        VehicleModel(
            fioDriver = "Евгеньев Александр Викторович",
            phoneDriver = "89212092411",
            vehicleNumber = "А321TA",
            vehicleModel = "Scania 2011",
            routeType = Cargo,
        ),
        VehicleModel(
            fioDriver = "Ковалев Артем Александрович",
            phoneDriver = "89203334411",
            vehicleNumber = "M316BA",
            vehicleModel = "Hyndai Salaris",
            routeType = Documents,
        ),
        VehicleModel(
            fioDriver = "Евгеньев Александр Викторович",
            phoneDriver = "89212092411",
            vehicleNumber = "А321TA",
            vehicleModel = "Scania 2011",
            routeType = Cargo,
        ),
        VehicleModel(
            fioDriver = "Ковалев Артем Александрович",
            phoneDriver = "89203334411",
            vehicleNumber = "M316BA",
            vehicleModel = "Hyndai Salaris",
            routeType = Documents,
        ),
        VehicleModel(
            fioDriver = "Евгеньев Александр Викторович",
            phoneDriver = "89212092411",
            vehicleNumber = "А321TA",
            vehicleModel = "Scania 2011",
            routeType = Cargo,
        )
    ),
) {
    var fio by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var carNumber by remember { mutableStateOf("") }
    var makeAndModelCar by remember { mutableStateOf("") }
    var typeTransportation by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .sizeIn(minWidth = 800.dp, minHeight = 400.dp)
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
        ExampleColumnList(itemList)
        FlowRow(
            modifier = Modifier
                .padding(10.dp)
                .height(140.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            maxItemsInEachRow = 3,
        ) {
            TextFieldItem(
                text = fio,
                label = "ФИО водителя:",
                onValueChange = { fio = it }
            )
            TextFieldItem(
                text = phoneNumber,
                label = "Телефон водителя:",
                onValueChange = { phoneNumber = it }
            )
            TextFieldItem(
                text = carNumber,
                label = "Номер т-с:",
                onValueChange = { carNumber = it }
            )
            TextFieldItem(
                text = makeAndModelCar,
                label = "Марка и модель т-с:",
                onValueChange = { makeAndModelCar = it }
            )
            TextFieldItem(
                text = typeTransportation,
                label = "Виды перевозок:",
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