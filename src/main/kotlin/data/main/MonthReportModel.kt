package data.main

data class MonthReportModel(
    val id: Int,
    val productName: String,
    val unit: String,
    val count: Int,
    val total: Long,
    val orderCount: Int,
)
