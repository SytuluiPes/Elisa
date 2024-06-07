package data.model

data class MonthFactoryItemModel(
    val id: Long,
    val article: String,
    val productName: String,
    val unit: String,
    val count: Int,
    val total: Long,
    val dateStart: String,
    val dateEnd: String,
    val factoryId: Int,
)