package ui.common.exampleLists

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ExampleRowList() {
    LazyColumn(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
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