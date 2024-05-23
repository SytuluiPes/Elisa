package data

import androidx.sqlite.SQLiteConnection
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import androidx.sqlite.execSQL
import androidx.sqlite.use

object DbAdapter {
    private var databaseConnection: SQLiteConnection = BundledSQLiteDriver().open("elisaTest.db")

    private const val AVAILABLE_CAR = "available_car"
    private const val WEEK_SCHEDULE = "week_schedule"

    fun init() {
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $AVAILABLE_CAR (
            |available_car_id INTEGER PRIMARY KEY AUTOINCREMENT,
            |car_id TEXT,
            |driver_fio TEXT,
            |model TEXT,
            |type_delivery TEXT,
            |phone TEXT);
            |CREATE TABLE IF NOT EXISTS $WEEK_SCHEDULE (
            |week_schedule_id INTEGER PRIMARY KEY AUTOINCREMENT,
            |product_name TEXT,
            |value INTEGER,
            |unit TEXT,
            |month_schedule_id INTEGER,
            |type_delivery TEXT);
        """.trimMargin()
        )
        databaseConnection.prepare(
            """
                |INSERT OR IGNORE INTO $AVAILABLE_CAR (
                |car_id, driver_fio, model, type_delivery, phone) 
                |VALUES (?, ?, ?, ?, ?)
            """.trimMargin()
        ).use { stmt ->
            stmt.bindText(index = 1, value = "A641MA")
            stmt.bindText(index = 2, value = "Ковалев Артем Петрович")
            stmt.bindText(index = 3, value = "АВТОВАЗ 2199")
            stmt.bindText(index = 4, value = "Грузовой")
            stmt.bindText(index = 5, value = "+7-903-464-13-31")
            stmt.step()
        }
        databaseConnection.prepare("SELECT * FROM $AVAILABLE_CAR").use { stmt ->
            while (stmt.step()) {
                for (i in 0 until stmt.getColumnCount()) {
                    println(stmt.getText(i))
                }
            }
        }

        databaseConnection.prepare(
            """
                |INSERT OR IGNORE INTO $WEEK_SCHEDULE (
                |product_name, value, unit, month_schedule_id, type_delivery) 
                |VALUES (?, ?, ?, ?, ?)
            """.trimMargin()
        ).use { stmt ->
            stmt.bindText(index = 1, value = "Арматура")
            stmt.bindText(index = 2, value = "12")
            stmt.bindText(index = 3, value = "кг")
            stmt.bindInt(index = 4, value = 1)
            stmt.bindText(index = 5, value = "Грузовой")
            stmt.step()
        }
        databaseConnection.prepare("SELECT * FROM $WEEK_SCHEDULE").use { stmt ->
            while (stmt.step()) {
                for (i in 0 until stmt.getColumnCount()) {
                    println(stmt.getText(i))
                }
            }
        }
    }
}