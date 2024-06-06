package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ui.common.ElisaDivider
import ui.common.ElisaHeaderText

@Composable
fun HeaderTable(
    headerNameList: List<String>,
    fieldWidthList: List<Dp>,
) {
    Row(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, top = 10.dp)
            .height(60.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
            .background(Color(0xFF464859)),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        repeat(headerNameList.size) { index ->
            ElisaHeaderText(
                text = headerNameList[index],
                textWidth = fieldWidthList[index],
            )
            if (index - headerNameList.size != 1) {
                ElisaDivider(
                    isHorizontal = false,
                )
            }
        }
    }
}