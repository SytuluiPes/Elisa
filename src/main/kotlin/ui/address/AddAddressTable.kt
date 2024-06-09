package ui.address

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import data.AddressModel
import util.ElisaColor

private val exampleAddressList = listOf(
    AddressModel(
        index = "346550",
        region = "Ростовская обл.",
        town = "р.п. Усть-Донецкий",
        street = "ул. Строителей",
        house = 66,
    ),
    AddressModel(
        index = "127880",
        region = "Московская обл.",
        town = "г. Сергиев Посад",
        street = "пр. Мира",
        house = 107,
    ),
    AddressModel(
        index = "138121",
        region = "",
        town = "г. Москва",
        street = "ул. Пестеля",
        house = 4,
    ),
    AddressModel(
        index = "346550",
        region = "Ростовская обл.",
        town = "р.п. Усть-Донецкий",
        street = "ул. Строителей",
        house = 66,
    ),
    AddressModel(
        index = "127880",
        region = "Московская обл.",
        town = "г. Сергиев Посад",
        street = "пр. Мира",
        house = 107,
    ),
    AddressModel(
        index = "138121",
        region = "",
        town = "г. Москва",
        street = "ул. Пестеля",
        house = 4,
    ),
    AddressModel(
        index = "346550",
        region = "Ростовская обл.",
        town = "р.п. Усть-Донецкий",
        street = "ул. Строителей",
        house = 66,
    ),
    AddressModel(
        index = "127880",
        region = "Московская обл.",
        town = "г. Сергиев Посад",
        street = "пр. Мира",
        house = 107,
    ),
    AddressModel(
        index = "138121",
        region = "",
        town = "г. Москва",
        street = "ул. Пестеля",
        house = 4,
    ),
    AddressModel(
        index = "346550",
        region = "Ростовская обл.",
        town = "р.п. Усть-Донецкий",
        street = "ул. Строителей",
        house = 66,
    ),
    AddressModel(
        index = "127880",
        region = "Московская обл.",
        town = "г. Сергиев Посад",
        street = "пр. Мира",
        house = 107,
    ),
    AddressModel(
        index = "138121",
        region = "",
        town = "г. Москва",
        street = "ул. Пестеля",
        house = 4,
    ),
    AddressModel(
        index = "346550",
        region = "Ростовская обл.",
        town = "р.п. Усть-Донецкий",
        street = "ул. Строителей",
        house = 66,
    ),
    AddressModel(
        index = "127880",
        region = "Московская обл.",
        town = "г. Сергиев Посад",
        street = "пр. Мира",
        house = 107,
    ),
    AddressModel(
        index = "138121",
        region = "",
        town = "г. Москва",
        street = "ул. Пестеля",
        house = 4,
    ),
    AddressModel(
        index = "346550",
        region = "Ростовская обл.",
        town = "р.п. Усть-Донецкий",
        street = "ул. Строителей",
        house = 66,
    ),
    AddressModel(
        index = "127880",
        region = "Московская обл.",
        town = "г. Сергиев Посад",
        street = "пр. Мира",
        house = 107,
    ),
    AddressModel(
        index = "138121",
        region = "",
        town = "г. Москва",
        street = "ул. Пестеля",
        house = 4,
    ),
    AddressModel(
        index = "346550",
        region = "Ростовская обл.",
        town = "р.п. Усть-Донецкий",
        street = "ул. Строителей",
        house = 66,
    ),
    AddressModel(
        index = "127880",
        region = "Московская обл.",
        town = "г. Сергиев Посад",
        street = "пр. Мира",
        house = 107,
    ),
    AddressModel(
        index = "138121",
        region = "",
        town = "г. Москва",
        street = "ул. Пестеля",
        house = 4,
    ),
    AddressModel(
        index = "346550",
        region = "Ростовская обл.",
        town = "р.п. Усть-Донецкий",
        street = "ул. Строителей",
        house = 66,
    ),
    AddressModel(
        index = "127880",
        region = "Московская обл.",
        town = "г. Сергиев Посад",
        street = "пр. Мира",
        house = 107,
    ),
    AddressModel(
        index = "138121",
        region = "",
        town = "г. Москва",
        street = "ул. Пестеля",
        house = 4,
    ),
)

@Composable
fun AddAddressTable(
    itemList: List<AddressModel> = exampleAddressList,
    fieldWidthList: List<Dp>,
) {
    LazyColumn(
        modifier = Modifier
            .padding(start = 10.dp, end = 10.dp, bottom = 10.dp)
            .height(350.dp)
            .fillMaxWidth()
            .border(
                width = 0.5.dp,
                color = ElisaColor.DarkBlue,
            ),
        userScrollEnabled = true,
    ) {
        itemList.forEachIndexed { index, item ->
            item {
                AddAddressItemList(
                    item = item,
                    color = if (index % 2 == 0)
                        Pair(ElisaColor.White, ElisaColor.LightBlue)
                    else
                        Pair(ElisaColor.LightBlue, ElisaColor.White),
                    fieldWidthList = fieldWidthList,
                )
            }
        }
    }
}