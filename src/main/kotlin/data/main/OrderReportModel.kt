package data.main

import data.AddressModel
import data.ProductModel

data class OrderReportModel(
    val id: Long,
    val productList: List<ProductModel>,
    val customer: String,
    val addressModel: AddressModel,
    val dateDelivery: String,
    val dateDeliveryFact: String,
    val causeText: String,
)