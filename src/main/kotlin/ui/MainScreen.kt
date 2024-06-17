package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import navigation.MainScreenDestination
import ui.common.ElisaDivider
import ui.common.ElisaHeader
import ui.common.buttons.ElisaBigItemButton
import ui.common.buttons.ElisaDirectoryButton

@OptIn(ExperimentalLayoutApi::class)
@NonRestartableComposable
@Composable
fun MainScreen(
    onItemClick: (MainScreenDestination) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFE8E8E8)),
        verticalArrangement = Arrangement.spacedBy(20.dp),
    ) {
        Spacer(Modifier.size(10.dp))
        ElisaHeader(
            text = "Главноe меню",
        )
        ElisaDivider()
        Row(
            modifier = Modifier
                .padding(vertical = 20.dp, horizontal = 50.dp)
                .height(350.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(100.dp),
        ) {
            Column(
                modifier = Modifier.width(650.dp),
            ) {
                ElisaHeader(text = "Задачи", isMain = false)
                Spacer(Modifier.size(20.dp))
                ElisaDivider(horizontalSize = 3.dp)
                Spacer(Modifier.size(50.dp))
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
            ElisaDivider(size = 3.dp, isHorizontal = false)
            Column(
                modifier = Modifier.width(550.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                ElisaHeader(text = "Справочники", isMain = false)
                ElisaDivider(horizontalSize = 3.dp)
                Spacer(Modifier.size(10.dp))
                ElisaDirectoryButton(
                    textButton = "Справочник продукции",
                    onButtonClick = { onItemClick(MainScreenDestination.AddProductScreen) }
                )
                ElisaDirectoryButton(
                    textButton = "Справочник адресов",
                    onButtonClick = { onItemClick(MainScreenDestination.AddAddressScreen) }
                )
                ElisaDirectoryButton(
                    textButton = "Справочник цехов",
                    onButtonClick = { onItemClick(MainScreenDestination.AddFactoryScreen) }
                )
            }
        }
    }
}