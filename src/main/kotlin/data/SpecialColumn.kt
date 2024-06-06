package data

sealed interface SpecialColumn {

    data object Empty : SpecialColumn

    data class Exist(
        val startColumnIndex: Int,
        val countColumn: Int,
    ) : SpecialColumn

}
