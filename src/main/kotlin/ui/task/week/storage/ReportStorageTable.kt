package ui.task.week.storage

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.model.ReportStorageModel
import util.ElisaColor

private val exampleReportStorageItemList = listOf(
    ReportStorageModel(
        id = 1,
        article = "115221",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 86,
        price = 21000,
        total = 86 * 21000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115223",
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 11,
        price = 19000,
        total = 11 * 19000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115225",
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 80,
        price = 23000,
        total = 80 * 23000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 1,
        article = "115221",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 86,
        price = 21000,
        total = 86 * 21000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115223",
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 11,
        price = 19000,
        total = 11 * 19000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115225",
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 80,
        price = 23000,
        total = 80 * 23000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 1,
        article = "115221",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 86,
        price = 21000,
        total = 86 * 21000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115223",
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 11,
        price = 19000,
        total = 11 * 19000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115225",
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 80,
        price = 23000,
        total = 80 * 23000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 1,
        article = "115221",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 86,
        price = 21000,
        total = 86 * 21000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115223",
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 11,
        price = 19000,
        total = 11 * 19000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115225",
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 80,
        price = 23000,
        total = 80 * 23000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 1,
        article = "115221",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 86,
        price = 21000,
        total = 86 * 21000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115223",
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 11,
        price = 19000,
        total = 11 * 19000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115225",
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 80,
        price = 23000,
        total = 80 * 23000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 1,
        article = "115221",
        productName = "Кирпич М-150",
        unit = "паллеты",
        count = 86,
        price = 21000,
        total = 86 * 21000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115223",
        productName = "Кирпич М-125",
        unit = "паллеты",
        count = 11,
        price = 19000,
        total = 11 * 19000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
    ReportStorageModel(
        id = 2,
        article = "115225",
        productName = "Кирпич М-200",
        unit = "паллеты",
        count = 80,
        price = 23000,
        total = 80 * 23000,
        checkDate = "01.06.2024",
        checkerFio = "Петров Алексей Петрович"
    ),
)

@Composable
fun ReportStorageTable(
    isTask: Boolean = true,
    itemList: List<ReportStorageModel> = exampleReportStorageItemList,
    fieldWidthList: List<Dp>,
) {
    val modifier = if (isTask) Modifier.fillMaxHeight() else Modifier.height(350.dp)
    LazyColumn(
        modifier = modifier
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxWidth()
            .border(
                width = 0.5.dp,
                color = ElisaColor.DarkBlue,
            ),
        userScrollEnabled = true,
    ) {
        itemList.forEachIndexed { index, item ->
            item {
                ReportStorageItemList(
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