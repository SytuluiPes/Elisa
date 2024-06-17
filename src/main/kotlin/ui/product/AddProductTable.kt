package ui.product

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.ProductModel
import util.ElisaColor

private val exampleAddProductItemList = listOf(
    ProductModel(
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 21,
        price = 120000,
        costPrice = 45000,
    ),
    ProductModel(
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 30,
        price = 180000,
        costPrice = 55000,
    ),
    ProductModel(
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 18,
        price = 95000,
        costPrice = 62000,
    ),
    ProductModel(
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 21,
        price = 120000,
        costPrice = 45000,
    ),
    ProductModel(
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 30,
        price = 180000,
        costPrice = 55000,
    ),
    ProductModel(
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 18,
        price = 95000,
        costPrice = 62000,
    ),
    ProductModel(
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 21,
        price = 120000,
        costPrice = 45000,
    ),
    ProductModel(
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 30,
        price = 180000,
        costPrice = 55000,
    ),
    ProductModel(
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 18,
        price = 95000,
        costPrice = 62000,
    ),
    ProductModel(
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 21,
        price = 120000,
        costPrice = 45000,
    ),
    ProductModel(
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 30,
        price = 180000,
        costPrice = 55000,
    ),
    ProductModel(
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 18,
        price = 95000,
        costPrice = 62000,
    ),
    ProductModel(
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 21,
        price = 120000,
        costPrice = 45000,
    ),
    ProductModel(
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 30,
        price = 180000,
        costPrice = 55000,
    ),
    ProductModel(
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 18,
        price = 95000,
        costPrice = 62000,
    ),
    ProductModel(
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 21,
        price = 120000,
        costPrice = 45000,
    ),
    ProductModel(
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 30,
        price = 180000,
        costPrice = 55000,
    ),
    ProductModel(
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 18,
        price = 95000,
        costPrice = 62000,
    ),
    ProductModel(
        productName = "Кирпич М-100",
        unit = "паллеты",
        count = 21,
        price = 120000,
        costPrice = 45000,
    ),
    ProductModel(
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 30,
        price = 180000,
        costPrice = 55000,
    ),
    ProductModel(
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 18,
        price = 95000,
        costPrice = 62000,
    ),
    ProductModel(
        productName = "Кирпич полнотелый М-150",
        unit = "паллеты",
        count = 0,
        price = 0,
        costPrice = 0,
    )
)

@Composable
fun AddProductTable(
    itemList: List<ProductModel> = exampleAddProductItemList,
    fieldWidthList: List<Dp>,
) {
    LazyColumn(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
            .height(350.dp)
            .fillMaxWidth()
            .border(
                width = 0.5.dp,
                color = ElisaColor.DarkBlue,
            ),
        userScrollEnabled = true,
    ) {
        itemList.forEachIndexed { index, item ->
            item {
                AddProductItemList(
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