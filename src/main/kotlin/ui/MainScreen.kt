package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import navigation.MainScreenDestination
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.buttons.ElisaBigItemButton

@OptIn(ExperimentalLayoutApi::class)
@NonRestartableComposable
@Composable
fun MainScreen(
    onItemClick: (MainScreenDestination) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFE8E8E8)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ) {
        Spacer(Modifier.size(10.dp))
        ElisaHeader(
            text = "Главноe меню",
        )
        ElisaDivider()
        Spacer(Modifier.size(20.dp))
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(50.dp),
            verticalArrangement = Arrangement.spacedBy(50.dp),
            maxItemsInEachRow = 2,

            ) {
            ElisaBigItemButton(
                textButton = "Формирование маршрутного листа движения транспортного средства",
                onButtonClick = { onItemClick(MainScreenDestination.RouteSheetListScreen) },
            )
            ElisaBigItemButton(
                textButton = "Формирование месячного плана отгрузки готовой продукции",
                onButtonClick = { onItemClick(MainScreenDestination.MonthScheduleScreen) },
            )
            ElisaBigItemButton(
                textButton = "Составление недельного графика поставки готовой продукции",
                onButtonClick = { onItemClick(MainScreenDestination.WeekScheduleScreen) },
            )
            ElisaBigItemButton(
                textButton = "Составление отчета о выполнении месячного плана отгрузки готовой продукции",
                onButtonClick = { onItemClick(MainScreenDestination.ReportSheetListScreen) },
            )
        }
    }
}