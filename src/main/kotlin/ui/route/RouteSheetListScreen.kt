package ui.route

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import navigation.RouteSheetDestination
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.buttons.ElisaSmallItemButton
import ui.common.exampleLists.ExampleRowList

@Composable
fun RouteSheetListScreen(
    onBackClick: () -> Unit,
    onItemClick: (RouteSheetDestination) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFE8E8E8)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Spacer(Modifier.size(15.dp))
        ElisaHeader(
            text = "Маршрутный лист движения транспортного средства",
            isMain = false,
        )
        Spacer(Modifier.size(10.dp))
        ElisaDivider()
        Spacer(Modifier.size(5.dp))
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            ExampleRowList()
            Column(
                modifier = Modifier.width(200.dp).fillMaxHeight().padding(top = 10.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                ElisaSmallItemButton(
                    textButton = "Недельный график поставки готовой продукции",
                    onButtonClick = { onItemClick(RouteSheetDestination.WeekScheduleListScreen) },
                )
                ElisaSmallItemButton(
                    textButton = "Перечень доступных транспортных средств",
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
}