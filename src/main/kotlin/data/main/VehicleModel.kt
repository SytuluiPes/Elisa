package data.main

import data.main.VehicleModel.RouteType.Cargo

data class VehicleModel(
    val fioDriver: String,
    var phoneDriver: String,
    val vehicleNumber: String,
    val vehicleModel: String,
    val routeType: RouteType = Cargo,
) {
    init { // 89604201122 -> 8-960-420-11-22 else 89604201122
        phoneDriver = if (phoneDriver.checkFormatPhoneNumber()) {
            "${phoneDriver.first()}" +
                    "-${phoneDriver.subSequence(1, 4)}" +
                    "-${phoneDriver.subSequence(4, 6)}" +
                    "-${phoneDriver.subSequence(6, 8)}" +
                    "-${phoneDriver.subSequence(8, 10)}"
        } else phoneDriver
    }

    sealed class RouteType {
        object Cargo : RouteType() {
            override fun toString(): String {
                return "Грузовой"
            }
        }

        object Documents : RouteType() {
            override fun toString(): String {
                return "Документы"
            }
        }

        data object None : RouteType()
    }
}

private fun String.checkFormatPhoneNumber(): Boolean {
    if (this.count() == 11) {
        for (char in this) {
            if (char.toString() !in listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")) {
                return false
            }
        }
        return true
    } else return false
}
