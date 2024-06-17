package ui.factory

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.FactoryModel
import util.ElisaColor

private val exampleFactoryList = listOf(
    FactoryModel(1, "Цех подготовки грунта"),
    FactoryModel(2, "Цех формирования смеси"),
    FactoryModel(3, "Цех обжига кирпича"),
    FactoryModel(1, "Цех подготовки грунта"),
    FactoryModel(2, "Цех формирования смеси"),
    FactoryModel(3, "Цех обжига кирпича"),
    FactoryModel(1, "Цех подготовки грунта"),
    FactoryModel(2, "Цех формирования смеси"),
    FactoryModel(3, "Цех обжига кирпича"),
    FactoryModel(1, "Цех подготовки грунта"),
    FactoryModel(2, "Цех формирования смеси"),
    FactoryModel(3, "Цех обжига кирпича"),
    FactoryModel(1, "Цех подготовки грунта"),
    FactoryModel(2, "Цех формирования смеси"),
    FactoryModel(3, "Цех обжига кирпича"),
    FactoryModel(1, "Цех подготовки грунта"),
    FactoryModel(2, "Цех формирования смеси"),
    FactoryModel(3, "Цех обжига кирпича"),
    FactoryModel(1, "Цех подготовки грунта"),
    FactoryModel(2, "Цех формирования смеси"),
    FactoryModel(3, "Цех обжига кирпича"),
)

@Composable
fun AddFactoryTable(
    itemList: List<FactoryModel> = exampleFactoryList,
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
                AddFactoryItemList(
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