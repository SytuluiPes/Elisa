package ui.route.route

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import navigation.RouteSheetDestination
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.ElisaHeaderText
import ui.common.buttons.ElisaSmallItemButton
import util.Constant
import util.Constant.AVAILABLE_CAR
import util.Constant.ROUTE_TASK
import util.Constant.WEEK_TASK
import util.ElisaColor

@Composable
fun RouteSheetListScreen(
    onBackClick: () -> Unit,
    onItemClick: (RouteSheetDestination) -> Unit,
) {
    val fieldWidthList = listOf(80.dp, 450.dp, 290.dp, 180.dp, 100.dp, 260.dp)
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFE8E8E8)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        Spacer(Modifier.size(15.dp))
        ElisaHeader(
            text = ROUTE_TASK,
            isMain = false,
        )
        Spacer(Modifier.size(10.dp))
        ElisaDivider()
        Spacer(Modifier.size(5.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(600.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier
                    .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                    .height(60.dp)
                    .width(Constant.WINDOW_WIDTH - 20.dp)
                    .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                    .background(ElisaColor.DarkBlue),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                ElisaHeaderText(
                    text = "№ п/п",
                    textWidth = fieldWidthList[0],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = "Место назначения",
                    textWidth = fieldWidthList[1],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = "Наименование продукции",
                    textWidth = fieldWidthList[2],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = "Ед. изм.",
                    textWidth = fieldWidthList[3],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = "Кол-во",
                    textWidth = fieldWidthList[4],
                )
                ElisaDivider(
                    isHorizontal = false,
                )
                ElisaHeaderText(
                    text = "Контактный телефон заказчика",
                    textWidth = fieldWidthList[5],
                )
            }
            RouteListTable(fieldWidthList = fieldWidthList)
        }
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceAround,
            ) {
                ElisaSmallItemButton(
                    textButton = WEEK_TASK,
                    onButtonClick = { onItemClick(RouteSheetDestination.WeekScheduleListScreen) },
                )
                ElisaSmallItemButton(
                    textButton = AVAILABLE_CAR,
                    onButtonClick = { onItemClick(RouteSheetDestination.AvailableVehicleListScreen) },
                )
                ElisaSmallItemButton(
                    textButton = "Решение задачи",
                )
                ElisaSmallItemButton(
                    textButton = "Печать",
                )
                ElisaSmallItemButton(
                    textButton = "Закрыть",
                    onButtonClick = onBackClick,
                )
            }
        }
    }