package ui.route

data class TableRouteModel(
    val title: String,
    val width: Int,
    val onValueChange: (String) -> Unit,
)
