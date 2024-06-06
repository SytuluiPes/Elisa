package data.model

import data.AddressModel
import data.ProductModel

data class MonthScheduleItemModel(
    val id: Long,
    val customer: String,
    val address: AddressModel,
    val phoneNumber: String,
    val productList: List<ProductModel>,
    val dateDelivery: String,
    val typeDelivery: String? = null,
)