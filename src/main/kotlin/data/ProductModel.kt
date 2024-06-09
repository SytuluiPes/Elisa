package data

data class ProductModel(
    val productName: String,
    val unit: String,
    val count: Long,
    val price: Long = 0,
    val total: Long = price * count,
    val costPrice: Long = 0,
)