package data.model

import data.ProductModel

data class RouteItemModel(
    val id: Long,
    val address: String,
    val productList: List<ProductModel>,
    val phoneNumber: String,
)
