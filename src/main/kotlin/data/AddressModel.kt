package data

data class AddressModel(
    val index: String,
    val region: String,
    val town: String,
    val street: String,
    val house: Int,
) {
    fun asString(): String =
        "$index, $region, $town, $street, $house"
}
