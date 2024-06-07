package ui.task.month.monthFactory

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.model.MonthFactoryItemModel
import util.ElisaColor

private val exampleMonthFactoryItemList = listOf(
    MonthFactoryItemModel(
        id = 1,
        article = "321455",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 320,
        total = 8500230,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 2,
        article = "323122",
        productName = "Кирпич М-175",
        unit = "паллеты",
        count = 162,
        total = 5502500,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 1,
        article = "321455",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 320,
        total = 8500230,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 2,
        article = "323122",
        productName = "Кирпич М-175",
        unit = "паллеты",
        count = 162,
        total = 5502500,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 1,
        article = "321455",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 320,
        total = 8500230,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 2,
        article = "323122",
        productName = "Кирпич М-175",
        unit = "паллеты",
        count = 162,
        total = 5502500,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 1,
        article = "321455",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 320,
        total = 8500230,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 2,
        article = "323122",
        productName = "Кирпич М-175",
        unit = "паллеты",
        count = 162,
        total = 5502500,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 1,
        article = "321455",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 320,
        total = 8500230,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 2,
        article = "323122",
        productName = "Кирпич М-175",
        unit = "паллеты",
        count = 162,
        total = 5502500,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 1,
        article = "321455",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 320,
        total = 8500230,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 2,
        article = "323122",
        productName = "Кирпич М-175",
        unit = "паллеты",
        count = 162,
        total = 5502500,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 1,
        article = "321455",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 320,
        total = 8500230,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 2,
        article = "323122",
        productName = "Кирпич М-175",
        unit = "паллеты",
        count = 162,
        total = 5502500,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 1,
        article = "321455",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 320,
        total = 8500230,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 2,
        article = "323122",
        productName = "Кирпич М-175",
        unit = "паллеты",
        count = 162,
        total = 5502500,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 1,
        article = "321455",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 320,
        total = 8500230,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
    MonthFactoryItemModel(
        id = 2,
        article = "323122",
        productName = "Кирпич М-175",
        unit = "паллеты",
        count = 162,
        total = 5502500,
        dateStart = "21.03.2024",
        dateEnd = "20.04.2024",
        factoryId = 1,
    ),
)

@Composable
fun MonthFactoryTable(
    itemList: List<MonthFactoryItemModel> = exampleMonthFactoryItemList,
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
                MonthFactoryItemList(
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