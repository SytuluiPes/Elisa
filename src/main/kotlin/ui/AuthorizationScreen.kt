package ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import navigation.MainScreenDestination
import navigation.NavRoot
import navigation.RouteSheetDestination

@Composable
fun AuthorizationScreen(
    onButtonClick: () -> Unit
) {
    var login: String by remember { mutableStateOf("") }
    var pass: String by remember { mutableStateOf("") }

    var borderColor: Color? by remember { mutableStateOf(null) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Авторизация",
            fontWeight = FontWeight.W400,
            fontSize = 32.sp,
        )
        Spacer(Modifier.size(60.dp))
        AutorizationItem(
            label = "Логин:",
            text = login,
            borderColor = borderColor,
            onValueChange = { login = it },
        )
        Spacer(Modifier.size(30.dp))
        AutorizationItem(
            label = "Пароль:",
            text = pass,
            borderColor = borderColor,
            onValueChange = { pass = it },
        )
        Spacer(Modifier.size(30.dp))
        DiplomButton(
            textButton = "Войти",
            onButtonClick = onButtonClick,
//            {
//                borderColor = if (login.isEmpty() || pass.isEmpty()) Color.Red else null
//                if (borderColor != Color.Red) {
//                    onButtonClick()
//                }
//            },
        )
    }
}

@Composable
fun AutorizationItem(
    label: String,
    text: String,
    borderColor: Color? = null,
    onValueChange: (String) -> Unit,
) {
    MaterialTheme {
        Column(
            horizontalAlignment = Alignment.Start,
        ) {
            Text(
                text = label,
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.W600,
                fontSize = 22.sp,
            )
            Spacer(Modifier.size(5.dp))
            TextField(
                modifier = if (borderColor != null && text.isEmpty())
                    Modifier.height(60.dp).border(BorderStroke(1.dp, borderColor))
                else
                    Modifier.height(60.dp),
                value = text,
                textStyle = TextStyle(fontSize = 18.sp),
                colors = TextFieldDefaults.textFieldColors(Color.Blue),
                onValueChange = onValueChange,
                singleLine = true,
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@NonRestartableComposable
@Composable
fun MainScreen(
    onItemClick: (MainScreenDestination) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFE8E8E8)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ) {
        Spacer(Modifier.size(10.dp))
        DiplomHeader(
            text = "Главноe меню",
        )
        DiplomDivider()
        Spacer(Modifier.size(20.dp))
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(50.dp),
            verticalArrangement = Arrangement.spacedBy(50.dp),
            maxItemsInEachRow = 2,

            ) {
            DiplomBigItemButton(
                textButton = "Формирование маршрутного листа движения транспортного средства",
                onButtonClick = { onItemClick(MainScreenDestination.RouteSheetListScreen) },
            )
            DiplomBigItemButton(
                textButton = "Формирование месячного плана отгрузки готовой продукции",
                onButtonClick = { onItemClick(MainScreenDestination.MonthScheduleScreen) },
            )
            DiplomBigItemButton(
                textButton = "Составление недельного графика поставки готовой продукции",
                onButtonClick = { onItemClick(MainScreenDestination.WeekScheduleScreen) },
            )
            DiplomBigItemButton(
                textButton = "Составление отчета о выполнении месячного плана отгрузки готовой продукции",
                onButtonClick = { onItemClick(MainScreenDestination.ReportScreen) },
            )
        }
    }
}

@Composable
fun RouteSheetListScreen(
    onBackClick: (RouteSheetDestination) -> Unit = {},
) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFE8E8E8)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Spacer(Modifier.size(15.dp))
        DiplomHeader(
            text = "Маршрутный лист движения транспортного средства",
            isMain = false,
        )
        Spacer(Modifier.size(10.dp))
        DiplomDivider()
        Spacer(Modifier.size(5.dp))
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            ExampleRowList()
            Column(
                modifier = Modifier.width(200.dp).fillMaxHeight().padding(top = 10.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                DiplomSmallItemButton(
                    textButton = "Недельный график поставки готовой продукции",
                )
                DiplomSmallItemButton(
                    textButton = "Перечень доступных транспортных средств",
                )
                DiplomSmallItemButton(
                    textButton = "Решение задачи",
                )
                DiplomSmallItemButton(
                    textButton = "Печать",
                )
                DiplomSmallItemButton(
                    textButton = "Закрыть",
                    onButtonClick = { onBackClick(RouteSheetDestination.MainScreen) },
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AvailableVehicleListScreen(
    onBackClick: () -> Unit,
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
        ExampleColumnList()
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
            onButtonAddClick = {},
            onButtonCloseClick = onBackClick,
        )
    }
}

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
        ExampleColumnList()
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
            onButtonAddClick = {},
            onButtonCloseClick = onBackClick,
        )
    }
}

@Composable
fun MonthScheduleScreen() {
    Text("Month")
}

@Composable
fun WeekScheduleScreen() {
    Text("Week")
}

@Composable
fun ReportScreen() {
    Text("Report")
}

// common

@Composable
fun FooterButtons(
    onButtonAddClick: () -> Unit,
    onButtonCloseClick: () -> Unit,
) {
    Row(
        modifier = Modifier.size(height = 60.dp, width = 600.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        DiplomSmallItemButton(
            textButton = "Добавить",
            onButtonClick = onButtonAddClick,
        )
        DiplomSmallItemButton(
            textButton = "Закрыть",
            onButtonClick = onButtonCloseClick,
        )
    }
}

@Composable
fun TextFieldItem(
    label: String,
    text: String,
    borderColor: Color? = null,
    onValueChange: (String) -> Unit,
) {
    MaterialTheme {
        Row(
            modifier = Modifier
                .size(height = 60.dp, width = 300.dp)
                .background(Color(0xFFE5DCDC)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                modifier = Modifier.width(120.dp),
                text = label,
                fontWeight = FontWeight.W400,
                fontSize = 16.sp,
                maxLines = 2,
            )
            Spacer(Modifier.size(5.dp))
            TextField(
                modifier = Modifier.width(175.dp)
                    .align(Alignment.Bottom)
                    .border(
                        if (borderColor != null && text.isEmpty())
                            BorderStroke(1.dp, borderColor) else BorderStroke(0.dp, Color.White)
                    ),
                value = text,
                textStyle = TextStyle(fontSize = 18.sp),
                colors = TextFieldDefaults.textFieldColors(Color.Blue),
                onValueChange = onValueChange,
                singleLine = true,
            )
        }
    }
}

@Composable
fun DiplomDivider(
    color: Color = Color.White,
    size: Dp = 2.dp,
) {
    Divider(
        color = color,
        thickness = size,
    )
}

@Composable
fun DiplomButton(
    textButton: String,
    onButtonClick: () -> Unit = {},
) {
    TextButton(
        modifier = Modifier
            .size(width = 150.dp, height = 60.dp)
            .border(1.dp, Color.Black, RoundedCornerShape(15.dp)),
        onClick = onButtonClick,
        content = {
            Text(
                text = textButton,
                fontSize = 20.sp,
                color = Color.Black
            )
        },
    )
}

@Composable
fun DiplomBigItemButton(
    textButton: String,
    onButtonClick: () -> Unit = {},
) {
    TextButton(
        modifier = Modifier
            .size(width = 300.dp, height = 150.dp)
            .border(1.dp, Color.Companion.Gray, RoundedCornerShape(15.dp)),

        onClick = onButtonClick,
        content = {
            Text(
                text = textButton,
                fontSize = 18.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
            )
        },
    )
}

@Composable
fun DiplomSmallItemButton(
    textButton: String,
    onButtonClick: () -> Unit = {},
) {
    TextButton(
        modifier = Modifier
            .size(width = 200.dp, height = 80.dp)
            .border(1.dp, Color.Companion.Gray, RoundedCornerShape(40.dp)),

        onClick = onButtonClick,
        content = {
            Text(
                text = textButton,
                fontSize = 12.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Center,
            )
        },
    )
}

@Composable
fun DiplomHeader(
    text: String,
    isMain: Boolean = true,
) {
    Text(
        text = text,
        fontWeight = FontWeight.W400,
        fontSize = if (isMain) 32.sp else 24.sp,
    )
}

@Composable
fun ExampleColumnList() {
    LazyColumn(
        modifier = Modifier
            .padding(10.dp)
            .height(200.dp)
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = Color.Black,
            )
            .background(color = Color.Gray),
        userScrollEnabled = true,
    ) {
        repeat(50) {
            item {
                Text(
                    text = it.toString(),
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth()
                        .clickable {}
                        .background(
                            color =
                            if (it % 2 == 0)
                                Color(0xFFFFFFFF)
                            else
                                Color(0xFFF0F3FF),
                        ),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                )
            }
        }
    }
}

@Composable
fun ExampleRowList() {
    LazyColumn(
        modifier = Modifier
            .padding(10.dp)
            .width(550.dp)
            .fillMaxHeight()
            .border(
                width = 1.dp,
                color = Color.Black,
            )
            .background(color = Color.Gray),
        userScrollEnabled = true,
    ) {
        repeat(50) {
            item {
                Text(
                    text = it.toString(),
                    modifier = Modifier
                        .height(40.dp)
                        .fillMaxWidth()
                        .clickable {}
                        .background(
                            color =
                            if (it % 2 == 0)
                                Color(0xFFFFFFFF)
                            else
                                Color(0xFFF0F3FF),
                        ),
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                )
            }
        }
    }
}

fun main() = application {
    val windowSize = rememberWindowState(size = DpSize(1000.dp, 600.dp))

    Window(
        onCloseRequest = ::exitApplication,
        state = windowSize,
        title = "Diplom",
    ) {
        NavRoot.init()
    }
}
