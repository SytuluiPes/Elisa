package ui.factory

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ui.HeaderTable
import ui.common.ElisaTextField
import ui.common.buttons.FooterButtons
import util.Constant
import util.Constant.ADDRESS_LIST
import util.Constant.FACTORY_NAME
import util.Constant.INDEX
import util.ElisaColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AddFactoryScreen(
    onBackClick: () -> Unit,
) {
    var name by remember { mutableStateOf("") }

    val fieldWidthList = listOf(200.dp, 1060.dp)
    Column(
        modifier = Modifier
            .size(width = Constant.WINDOW_WIDTH - 20.dp, height = Constant.WINDOW_HEIGHT)
            .background(ElisaColor.MainBackground)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.size(5.dp))
        Text(
            text = ADDRESS_LIST,
            fontWeight = FontWeight.W400,
            fontSize = 24.sp,
        )
        Spacer(Modifier.size(2.dp))
        HeaderTable(
            headerNameList = listOf(INDEX, FACTORY_NAME),
            fieldWidthList = fieldWidthList,
        )
        AddFactoryTable(fieldWidthList = fieldWidthList)
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            FlowRow(
                modifier = Modifier
                    .height(160.dp)
                    .width(1000.dp)
                    .border(BorderStroke(0.5.dp, color = ElisaColor.Black), RoundedCornerShape(20))
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalArrangement = Arrangement.SpaceAround,
                maxItemsInEachRow = 3,
            ) {
                ElisaTextField(
                    text = name,
                    label = FACTORY_NAME,
                    onValueChange = { name = it }
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