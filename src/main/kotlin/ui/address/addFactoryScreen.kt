package ui.address

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
import util.Constant.HOUSE
import util.Constant.INDEX
import util.Constant.REGION
import util.Constant.STREET
import util.Constant.TOWN
import util.ElisaColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun AddAddressScreen(
    onBackClick: () -> Unit,
) {
    var index by remember { mutableStateOf("") }
    var region by remember { mutableStateOf("") }
    var town by remember { mutableStateOf("") }
    var street by remember { mutableStateOf("") }
    var house by remember { mutableStateOf("") }

    val fieldWidthList = listOf(200.dp, 300.dp, 300.dp, 300.dp, 160.dp)
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
            headerNameList = listOf(INDEX, REGION, TOWN, STREET, HOUSE),
            fieldWidthList = fieldWidthList,
        )
        AddAddressTable(fieldWidthList = fieldWidthList)
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
                    text = index,
                    label = INDEX,
                    onValueChange = { index = it }
                )
                ElisaTextField(
                    text = region,
                    label = REGION,
                    onValueChange = { region = it }
                )
                ElisaTextField(
                    text = town,
                    label = TOWN,
                    onValueChange = { town = it }
                )
                ElisaTextField(
                    text = street,
                    label = STREET,
                    onValueChange = { street = it }
                )
                ElisaTextField(
                    text = house,
                    label = HOUSE,
                    onValueChange = { house = it }
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