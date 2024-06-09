package data.model

data class ReportStorageModel(
    val id: Long,
    val article: String,
    val productName: String,
    val unit: String,
    val count: Int,
    val price: Long,
    val total: Long,
    val checkDate: String,
    val checkerFio: String,
)