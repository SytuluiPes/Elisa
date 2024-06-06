package ui.route.vehicle

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.main.VehicleModel
import data.main.VehicleModel.RouteType
import data.main.VehicleModel.RouteType.Cargo
import data.main.VehicleModel.RouteType.Documents
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.ElisaHeaderText
import ui.common.ElisaTextField
import ui.common.buttons.ElisaButton
import ui.common.buttons.FooterButtons
import util.Constant
import util.Constant.AVAILABLE_CAR
import util.ElisaColor

private val exampleVehicleList = mutableStateListOf(
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
)

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AvailableVehicleScreen(
    onAddProductItemClick: () -> Unit,
    onBackClick: () -> Unit,
    itemList: MutableList<VehicleModel> = exampleVehicleList,
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

    val fieldWidthList = listOf(350.dp, 200.dp, 150.dp, 300.dp, 200.dp)

    Column(
        modifier = Modifier
            .size(width = Constant.WINDOW_WIDTH - 20.dp, height = Constant.WINDOW_HEIGHT)
            .background(ElisaColor.MainBackground)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        ElisaHeader(
            text = AVAILABLE_CAR,
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
                text = "ФИО водителя",
                textWidth = 350.dp,
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Телефон водителя",
                textWidth = 200.dp,
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Номер автомобиля",
                textWidth = 150.dp,
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Марка автомобиля",
                textWidth = 300.dp,
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = "Назначение",
                textWidth = 200.dp,
            )
        }
        VehicleTable(itemList, fieldWidthList)
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
                    text = fio,
                    label = "ФИО водителя",
                    onValueChange = { fio = it }
                )
                ElisaTextField(
                    text = phoneNumber,
                    label = "Телефон водителя",
                    onValueChange = { phoneNumber = it }
                )
                ElisaTextField(
                    text = carNumber,
                    label = "Номер автомобиля",
                    onValueChange = { carNumber = it }
                )
                ElisaTextField(
                    text = makeAndModelCar,
                    label = "Марка автомобиля",
                    onValueChange = { makeAndModelCar = it }
                )
                ElisaTextField(
                    text = typeTransportation,
                    label = "Назначение",
                    onValueChange = { typeTransportation = it }
                )
                ElisaButton(
                    textButton = "ТЕСТ",
                    onButtonClick = onAddProductItemClick,
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
                onDeleteClick = {},
                onCloseClick = onBackClick,
            )
        }
    }
}

private fun String.asRouteType(): RouteType =
    when (this) {
        Cargo.toString() -> Cargo
        Documents.toString() -> Documents
        else -> RouteType.None
    }
