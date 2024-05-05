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
                "-${phoneDriver.subSequence(1, 3)}" +
                "-${phoneDriver.subSequence(4, 6)}" +
                "-${phoneDriver.subSequence(7, 8)}" +
                "-${phoneDriver.subSequence(9, 10)}"
    }

    enum class RouteType {
        Cargo {
            override fun toString(): String {
                return "Грузовой"
            }
        },
        Documents {
            override fun toString(): String {
                return "Документы"
            }
        };
    }
}
