package data

import data.VehicleModel.RouteType.Cargo

data class VehicleModel(
    val fioDriver: String,
    var phoneDriver: String,
    val vehicleNumber: String,
    val vehicleModel: String,
    val routeType: RouteType = Cargo,
) {
    init { // 89604201122 -> 8-960-420-11-22
        phoneDriver = "${phoneDriver.first()}" +
                "-${phoneDriver.subSequence(1, 4)}" +
                "-${phoneDriver.subSequence(4, 6)}" +
                "-${phoneDriver.subSequence(6, 8)}" +
                "-${phoneDriver.subSequence(8, 10)}"
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

        object None : RouteType()
    }
}
