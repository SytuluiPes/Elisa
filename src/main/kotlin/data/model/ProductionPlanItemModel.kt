package data.model

data class ProductionPlanItemModel(
    val id: String,
    val productName: String,
    val unit: String,
    val count: Int,
    val startDate: String,
    val endDate: String,
    val costPrice: Long,
    val factoryId: Int,
)