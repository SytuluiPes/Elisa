package ui.route.route

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.ProductModel
import data.main.RouteItemModel
import util.Constant
import util.ElisaColor

private val exampleRouteItemList = listOf(
    RouteItemModel(
        id = 1,
        address = "005976, Волгоградская область, город Красногорск, пр. Домодедовская, 15",
        productList = listOf(
            ProductModel(
                productName = "Кирпич М-150",
                unit = "Паллеты",
                count = 80
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 30
            ),
        ),
        phoneNumber = "+7-960-450-32-11"
    ),
    RouteItemModel(
        id = 2,
        address = "500625, Нижегородская область, город Клин, пл. Сталина, 29",
        productList = listOf(
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
        ),
        phoneNumber = "+7-222-450-22-11"
    ),
    RouteItemModel(
        id = 3,
        address = "669287, Вологодская область, город Коломна, наб. Чехова, 61",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 15 кг",
                unit = "Штуки",
                count = 5
            ),
        ),
        phoneNumber = "+1-3330-22-11"
    ),
    RouteItemModel(
        id = 1,
        address = "005976, Волгоградская область, город Красногорск, пр. Домодедовская, 15",
        productList = listOf(
            ProductModel(
                productName = "Кирпич М-150",
                unit = "Паллеты",
                count = 80
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 30
            ),
        ),
        phoneNumber = "+7-960-450-32-11"
    ),
    RouteItemModel(
        id = 2,
        address = "500625, Нижегородская область, город Клин, пл. Сталина, 29",
        productList = listOf(
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
        ),
        phoneNumber = "+7-222-450-22-11"
    ),
    RouteItemModel(
        id = 3,
        address = "669287, Вологодская область, город Коломна, наб. Чехова, 61",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 15 кг",
                unit = "Штуки",
                count = 5
            ),
        ),
        phoneNumber = "+1-3330-22-11"
    ),
    RouteItemModel(
        id = 1,
        address = "005976, Волгоградская область, город Красногорск, пр. Домодедовская, 15",
        productList = listOf(
            ProductModel(
                productName = "Кирпич М-150",
                unit = "Паллеты",
                count = 80
            ),
            ProductModel(
                productName = "Цемент мешок 50 кг",
                unit = "Штуки",
                count = 30
            ),
        ),
        phoneNumber = "+7-960-450-32-11"
    ),
    RouteItemModel(
        id = 2,
        address = "500625, Нижегородская область, город Клин, пл. Сталина, 29",
        productList = listOf(
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
        ),
        phoneNumber = "+7-222-450-22-11"
    ),
    RouteItemModel(
        id = 3,
        address = "669287, Вологодская область, город Коломна, наб. Чехова, 61",
        productList = listOf(
            ProductModel(
                productName = "Цемент мешок 15 кг",
                unit = "Штуки",
                count = 5
            ),
        ),
        phoneNumber = "+1-3330-22-11"
    )
)

@Composable
fun RouteListTable(
    itemList: List<RouteItemModel> = exampleRouteItemList,
    fieldWidthList: List<Dp>,
) {
    LazyColumn(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxHeight()
            .width(Constant.WINDOW_WIDTH - 20.dp)
            .border(
                width = 0.5.dp,
                color = Color.Black,
            ),
        userScrollEnabled = true,
    ) {
        itemList.forEachIndexed { index, item ->
            item {
                RouteItemList(
                    item = item,
                    color = if (index % 2 == 0)
                        Pair(ElisaColor.White, ElisaColor.LightBlue)
                    else
                        Pair(ElisaColor.LightBlue, ElisaColor.White),
                    fieldWidthList = fieldWidthList,
                )
            }
        }
    }
}