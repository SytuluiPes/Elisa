package ui.route

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.VehicleModel
import data.VehicleModel.RouteType
import data.VehicleModel.RouteType.Cargo
import data.VehicleModel.RouteType.Documents
import ui.common.DiplomDivider
import ui.common.DiplomHeader
import ui.common.DiplomHeaderText
import ui.common.TextFieldItem
import ui.common.buttons.FooterButtons
import ui.common.exampleLists.AvailableVehicleList
import util.Constant

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AvailableVehicleScreen(
    onBackClick: () -> Unit,
    itemList: MutableList<VehicleModel> = mutableStateListOf(
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
    var reset by remember { mutableStateOf(false) }
    var fio by remember(reset) { mutableStateOf("") }
    var phoneNumber by remember(reset) { mutableStateOf("") }
    var carNumber by remember(reset) { mutableStateOf("") }
    var makeAndModelCar by remember(reset) { mutableStateOf("") }
    var typeTransportation by remember(reset) { mutableStateOf("") }

    val isFilled: Boolean by remember {
        derivedStateOf {
            fio.isNotEmpty()
            phoneNumber.isNotEmpty()
            carNumber.isNotEmpty()
            makeAndModelCar.isNotEmpty()
        }
    }

    Column(
        modifier = Modifier
            .size(width = Constant.WINDOW_WIDTH, height = Constant.WINDOW_HEIGHT)
            .background(Color(0xFFE8E8E8))
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        DiplomHeader(
            text = "Перечень доступных транспортных средств",
            isMain = false,
        )
        Spacer(Modifier.size(2.dp))
        Row(
            modifier = Modifier
                .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                .height(60.dp)
                .width(Constant.WINDOW_WIDTH - 20.dp)
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(Color(0xFF464859)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(2.dp)
        ) {
            DiplomHeaderText(
                text = "ФИО водителя",
                textWidth = 350.dp,
            )
            DiplomDivider(
                isHorizontal = false,
            )
            DiplomHeaderText(
                text = "Телефон водителя",
                textWidth = 200.dp,
            )
            DiplomDivider(
                isHorizontal = false,
            )
            DiplomHeaderText(
                text = "Номер автомобиля",
                textWidth = 150.dp,
            )
            DiplomDivider(
                isHorizontal = false,
            )
            DiplomHeaderText(
                text = "Марка автомобиля",
                textWidth = 300.dp,
            )
            DiplomDivider(
                isHorizontal = false,
            )
            DiplomHeaderText(
                text = "Назначение",
                textWidth = 200.dp,
            )
        }
        AvailableVehicleList(itemList)
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
            onAddClick = {
                if (isFilled) {
                    itemList.add(
                        VehicleModel(
                            fioDriver = fio,
                            phoneDriver = phoneNumber,
                            vehicleNumber = carNumber,
                            vehicleModel = makeAndModelCar,
                            routeType = typeTransportation.asRouteType(),
                        )
                    )
                    reset = true
                }
            },
            onCloseClick = onBackClick,
        )
    }
}

private fun String.asRouteType(): RouteType =
    when (this) {
        Cargo.toString() -> Cargo
        Documents.toString() -> Documents
        else -> RouteType.None
    }
