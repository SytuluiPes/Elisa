package ui.common.exampleLists

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import data.VehicleModel

@Composable
fun ExampleColumnList(
    itemList: List<VehicleModel> = emptyList(),
) {
    LazyColumn(
        modifier = Modifier
            .padding(10.dp)
            .height(400.dp)
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = Color.Black,
            )
            .background(color = Color.Gray),
        userScrollEnabled = true,
    ) {
        itemList.forEachIndexed { index, item ->
            item {
                ExampleItemList(
                    item = item,
                    color = if (index % 2 == 0)
                        Pair(Color(0xFFFFFFFF), Color(0xFFF0F3FF))
                    else
                        Pair(Color(0xFFF0F3FF), Color(0xFFFFFFFF)),
                )
            }
        }
    }
}