package data

data class ProductModel(
    val productName: String,
    val unit: String,
    val count: Long,
    val total: Long = 0,
)