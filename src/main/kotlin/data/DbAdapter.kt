package data

import androidx.sqlite.driver.bundled.BundledSQLiteDriver

object DbAdapter {
    private val databaseConnection = BundledSQLiteDriver().open("fas.db")
}