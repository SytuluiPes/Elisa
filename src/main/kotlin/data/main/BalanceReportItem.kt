package data.main

data class BalanceReportItem(
    val id: Long,
    val productName: String,
    val unit: String,
    val count: Int,
    val price: Long,
    val total: Long,
    val checkDate: String,
    val checkerFio: String,
)