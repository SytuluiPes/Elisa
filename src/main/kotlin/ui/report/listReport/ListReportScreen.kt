package ui.report.listReport

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.AddressModel
import data.ProductModel
import data.model.OrderReportModel
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.ElisaHeaderText
import ui.common.ElisaTextField
import ui.common.buttons.ElisaButton
import ui.common.buttons.FooterButtons
import util.Constant
import util.Constant.ADDRESS
import util.Constant.CAUSE
import util.Constant.COUNT
import util.Constant.CUSTOMER
import util.Constant.DATE_DELIVERY
import util.Constant.DATE_DELIVERY_FACT
import util.Constant.ID
import util.Constant.LIST_REPORT
import util.Constant.PRODUCT_LIST
import util.Constant.PRODUCT_NAME
import util.Constant.TOTAL
import util.Constant.UNIT
import util.ElisaColor

private val exampleProductList = listOf(
    ProductModel(
        productName = "Цемент мешок 5 кг",
        unit = "Штуки",
        count = 3
    ),
    ProductModel(
        productName = "Цемент мешок 50 кг",
        unit = "Штуки",
        count = 10
    ),
    ProductModel(
        productName = "Цемент мешок 50 кг",
        unit = "Штуки",
        count = 10
    ),
)

private val exampleOrderReportList = listOf(
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Егоров Егор Егорыч",
        addressModel = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        dateDelivery = "24.12.2024",
        dateDeliveryFact = "25.12.2024",
        causeText = "Ошибка водителя",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Собакин Собак Собаков",
        addressModel = AddressModel(
            index = "012445",
            region = "Псковская обл.",
            town = "Жучкино",
            street = "ул Проигрателей",
            house = 77
        ),
        dateDelivery = "24.04.2024",
        dateDeliveryFact = "24.04.2024",
        causeText = "-",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Егоров Егор Егорыч",
        addressModel = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        dateDelivery = "24.12.2024",
        dateDeliveryFact = "25.12.2024",
        causeText = "Ошибка водителя",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Собакин Собак Собаков",
        addressModel = AddressModel(
            index = "012445",
            region = "Псковская обл.",
            town = "Жучкино",
            street = "ул Проигрателей",
            house = 77
        ),
        dateDelivery = "24.04.2024",
        dateDeliveryFact = "24.04.2024",
        causeText = "-",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Егоров Егор Егорыч",
        addressModel = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        dateDelivery = "24.12.2024",
        dateDeliveryFact = "25.12.2024",
        causeText = "Ошибка водителя",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Собакин Собак Собаков",
        addressModel = AddressModel(
            index = "012445",
            region = "Псковская обл.",
            town = "Жучкино",
            street = "ул Проигрателей",
            house = 77
        ),
        dateDelivery = "24.04.2024",
        dateDeliveryFact = "24.04.2024",
        causeText = "-",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Егоров Егор Егорыч",
        addressModel = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        dateDelivery = "24.12.2024",
        dateDeliveryFact = "25.12.2024",
        causeText = "Ошибка водителя",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Собакин Собак Собаков",
        addressModel = AddressModel(
            index = "012445",
            region = "Псковская обл.",
            town = "Жучкино",
            street = "ул Проигрателей",
            house = 77
        ),
        dateDelivery = "24.04.2024",
        dateDeliveryFact = "24.04.2024",
        causeText = "-",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Егоров Егор Егорыч",
        addressModel = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        dateDelivery = "24.12.2024",
        dateDeliveryFact = "25.12.2024",
        causeText = "Ошибка водителя",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Собакин Собак Собаков",
        addressModel = AddressModel(
            index = "012445",
            region = "Псковская обл.",
            town = "Жучкино",
            street = "ул Проигрателей",
            house = 77
        ),
        dateDelivery = "24.04.2024",
        dateDeliveryFact = "24.04.2024",
        causeText = "-",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Егоров Егор Егорыч",
        addressModel = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        dateDelivery = "24.12.2024",
        dateDeliveryFact = "25.12.2024",
        causeText = "Ошибка водителя",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Собакин Собак Собаков",
        addressModel = AddressModel(
            index = "012445",
            region = "Псковская обл.",
            town = "Жучкино",
            street = "ул Проигрателей",
            house = 77
        ),
        dateDelivery = "24.04.2024",
        dateDeliveryFact = "24.04.2024",
        causeText = "-",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Егоров Егор Егорыч",
        addressModel = AddressModel(
            index = "012445",
            region = "Московская обл.",
            town = "Пушкино",
            street = "ул Победителей",
            house = 12
        ),
        dateDelivery = "24.12.2024",
        dateDeliveryFact = "25.12.2024",
        causeText = "Ошибка водителя",
    ),
    OrderReportModel(
        id = 1,
        productList = exampleProductList,
        customer = "Собакин Собак Собаков",
        addressModel = AddressModel(
            index = "012445",
            region = "Псковская обл.",
            town = "Жучкино",
            street = "ул Проигрателей",
            house = 77
        ),
        dateDelivery = "24.04.2024",
        dateDeliveryFact = "24.04.2024",
        causeText = "-",
    ),
)

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ListReportScreen(
    onAddProductItemClick: () -> Unit,
    onAddAddressClick: () -> Unit,
    onBackClick: () -> Unit,
    itemList: List<OrderReportModel> = exampleOrderReportList,
) {
    var reset by remember { mutableStateOf(false) }
    var customer by remember(reset) { mutableStateOf("") }
    var addressModel: AddressModel? by remember(reset) { mutableStateOf(null) }
    var productList: List<ProductModel>? by remember(reset) { mutableStateOf(null) }
    var dateDelivery by remember(reset) { mutableStateOf("") }
    var dateDeliveryFact by remember(reset) { mutableStateOf("") }
    var causeText by remember(reset) { mutableStateOf("") }

    val isFilled: Boolean by remember {
        derivedStateOf {
            customer.isNotEmpty()
//            addressModel.orNull() TODO()
//            productList.isNotEmpty()
        }
    }

    val fieldWidthList = listOf(60.dp, 250.dp, 80.dp, 60.dp, 60.dp, 200.dp, 150.dp, 80.dp, 100.dp, 220.dp)
    val headerNameList = listOf(
        ID,
        PRODUCT_NAME,
        UNIT,
        COUNT,
        TOTAL,
        CUSTOMER,
        ADDRESS,
        DATE_DELIVERY,
        DATE_DELIVERY_FACT,
        CAUSE,
    )

    Column(
        modifier = Modifier
            .size(width = Constant.WINDOW_WIDTH - 20.dp, height = Constant.WINDOW_HEIGHT)
            .background(ElisaColor.MainBackground)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        ElisaHeader(
            text = LIST_REPORT,
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
                text = headerNameList[0],
                textWidth = fieldWidthList[0],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = headerNameList[1],
                textWidth = fieldWidthList[1],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = headerNameList[2],
                textWidth = fieldWidthList[2],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = headerNameList[3],
                textWidth = fieldWidthList[3],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = headerNameList[4],
                textWidth = fieldWidthList[4],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = headerNameList[5],
                textWidth = fieldWidthList[5],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = headerNameList[6],
                textWidth = fieldWidthList[6],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = headerNameList[7],
                textWidth = fieldWidthList[7],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = headerNameList[8],
                textWidth = fieldWidthList[8],
            )
            ElisaDivider(
                isHorizontal = false,
            )
            ElisaHeaderText(
                text = headerNameList[9],
                textWidth = fieldWidthList[9],
            )
        }
        ListReportTable(itemList, fieldWidthList)
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
                ElisaButton(
                    textButton = PRODUCT_LIST,
                    onButtonClick = onAddProductItemClick,
                )
                ElisaTextField(
                    text = customer,
                    label = CUSTOMER,
                    onValueChange = { customer = it }
                )
                ElisaButton(
                    textButton = ADDRESS,
                    onButtonClick = onAddAddressClick,
                )
                ElisaTextField(
                    text = dateDelivery,
                    label = DATE_DELIVERY,
                    onValueChange = { dateDelivery = it }
                )
                ElisaTextField(
                    text = dateDeliveryFact,
                    label = DATE_DELIVERY_FACT,
                    onValueChange = { dateDeliveryFact = it }
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