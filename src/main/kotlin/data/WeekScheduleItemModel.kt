package data

data class WeekScheduleItemModel(
    val id: Long,
    val customer: String,
    val address: AddressModel,
    val phoneNumber: String,
    val productList: List<ProductModel>,
    val dateDelivery: String,
    val typeDelivery: String,

    )
