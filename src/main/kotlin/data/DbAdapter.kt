package data

import androidx.sqlite.SQLiteConnection
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import androidx.sqlite.execSQL
import androidx.sqlite.use

object DbAdapter {
    private var databaseConnection: SQLiteConnection = BundledSQLiteDriver().open("elisaTest.db")

    private const val AVAILABLE_CAR = "available_car"
    private const val WEEK_SCHEDULE = "week_schedule"
    private const val MONTH_SCHEDULE = "month_schedule"
    private const val ROUTE = "routes"
    private const val ORDER = "orders"
    private const val ADDRESS = "addresses"
    private const val PRODUCT = "products"
    private const val STOCK = "products_stock"
    private const val FACTORY = "factories"
    private const val PRODUCT_PLAN = "month_product_plan"
    private const val REPORT = "reports"
    private const val MONTH_REPORT = "month_report"

    private const val AVAILABLE_CAR_PK = "available_car_id"
    private const val WEEK_SCHEDULE_PK = "week_schedule_id"
    private const val MONTH_SCHEDULE_PK = "month_schedule_id"
    private const val ROUTE_PK = "route_id"
    private const val ORDER_PK = "order_id"
    private const val ADDRESS_PK = "address_id"
    private const val PRODUCT_PK = "product_id"
    private const val STOCK_PK = "product_stock_id"
    private const val FACTORY_PK = "factory_id"
    private const val PRODUCT_PLAN_PK = "plan_id"
    private const val REPORT_PK = "report_id"
    private const val MONTH_REPORT_PK = "month_report_id"

    fun init() {
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $AVAILABLE_CAR (
            |available_car_id INTEGER PRIMARY KEY AUTOINCREMENT,
            |car_id TEXT,
            |driver_fio TEXT,
            |model TEXT,
            |type_delivery TEXT,
            |phone TEXT)
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $WEEK_SCHEDULE (
            |week_schedule_id INTEGER PRIMARY KEY AUTOINCREMENT,
            |order_id INTEGER,
            |FOREIGN KEY (order_id) REFERENCES $ORDER ($ORDER_PK))
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $ROUTE (
            |$ROUTE_PK INTEGER PRIMARY KEY AUTOINCREMENT,
            |car_id INTEGER,
            |week_schedule_id INTEGER,
            |FOREIGN KEY (car_id) REFERENCES $AVAILABLE_CAR ($AVAILABLE_CAR_PK),
            |FOREIGN KEY (week_schedule_id) REFERENCES $WEEK_SCHEDULE ($WEEK_SCHEDULE_PK))
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $MONTH_SCHEDULE (
            |$MONTH_SCHEDULE_PK INTEGER PRIMARY KEY AUTOINCREMENT,
            |order_id INTEGER,
            |FOREIGN KEY (order_id) REFERENCES $ORDER ($ORDER_PK))
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $ADDRESS (
            |$ADDRESS_PK INTEGER PRIMARY KEY AUTOINCREMENT,
            |index_number TEXT,
            |region TEXT,
            |town TEXT,
            |street TEXT,
            |house INTEGER)
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $PRODUCT (
            |$PRODUCT_PK INTEGER PRIMARY KEY AUTOINCREMENT,
            |article TEXT,
            |product_name TEXT,
            |unit TEXT,
            |cost_price TEXT)
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $ORDER (
            |$ORDER_PK INTEGER PRIMARY KEY AUTOINCREMENT,
            |customer TEXT,
            |address_id INTEGER,
            |phone_number TEXT,
            |product_id INTEGER,
            |value INTEGER,
            |date_delivery TEXT,
            |type_delivery TEXT,
            |FOREIGN KEY (address_id) REFERENCES $ADDRESS ($ADDRESS_PK),
            |FOREIGN KEY (product_id) REFERENCES $PRODUCT ($PRODUCT_PK))
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $STOCK (
            |$STOCK_PK INTEGER PRIMARY KEY AUTOINCREMENT,
            |product_id TEXT,
            |value INTEGER,
            |total REAL,
            |date_check TEXT,
            |fio_check TEXT,
            |FOREIGN KEY (product_id) REFERENCES $STOCK ($STOCK_PK))
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $FACTORY (
            |$FACTORY_PK INTEGER PRIMARY KEY AUTOINCREMENT,
            |name TEXT)
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $PRODUCT_PLAN (
            |$PRODUCT_PLAN_PK INTEGER PRIMARY KEY AUTOINCREMENT,
            |product_id INTEGER,
            |value INTEGER,
            |factory_id INTEGER,
            |FOREIGN KEY (factory_id) REFERENCES $FACTORY ($FACTORY_PK),
            |FOREIGN KEY (product_id) REFERENCES $PRODUCT ($PRODUCT_PK))
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $REPORT (
            |$REPORT_PK INTEGER PRIMARY KEY AUTOINCREMENT,
            |order_id INTEGER,
            |date_Delivery TEXT,
            |report TEXT,
            |FOREIGN KEY (order_id) REFERENCES $ORDER ($ORDER_PK))
            """.trimMargin()
        )
        databaseConnection.execSQL(
            """
            |CREATE TABLE IF NOT EXISTS $MONTH_REPORT (
            |$MONTH_REPORT_PK INTEGER PRIMARY KEY AUTOINCREMENT,
            |report_id INTEGER,
            |total_sum REAL,
            |order_count INTEGER,
            |FOREIGN KEY (report_id) REFERENCES $REPORT ($REPORT_PK))
            """.trimMargin()
        )

        databaseConnection.prepare(
            """
            | INSERT OR IGNORE INTO $AVAILABLE_CAR (
        |car_id, driver_fio, model, type_delivery, phone)
        |VALUES(?, ?, ?, ?, ?)
        """.trimMargin()
        ).use { stmt ->
            stmt.bindText(index = 1, value = "333")
            stmt.bindText(index = 2, value = "Ковалев Артем Петрович")
            stmt.bindText(index = 3, value = "АВТОВАЗ 2199")
            stmt.bindText(index = 4, value = "Грузовой")
            stmt.bindText(index = 5, value = "+7-903-464-13-31")
            stmt.step()
        }
        databaseConnection.prepare(
            """
        |INSERT OR IGNORE INTO $WEEK_SCHEDULE(
            | week_schedule_id, product_name, value, unit, order_id, type_delivery)
        |VALUES(?, ?, ?, ?, ?, ?)
        """.trimMargin()
        ).use { stmt ->
            stmt.bindText(index = 1, value = "1")
            stmt.bindText(index = 2, value = "Кирпич М-150")
            stmt.bindText(index = 3, value = "25")
            stmt.bindText(index = 4, value = "паллеты")
            stmt.bindText(index = 5, value = "13511")
            stmt.bindText(index = 6, value = "Грузовой")
            stmt.step()
        }
        databaseConnection.prepare(
            """
        |INSERT OR IGNORE INTO $ROUTE(
            | route_id, car_id, week_schedule_id)
        |VALUES(?, ?, ?)
        """.trimMargin()
        ).use { stmt ->
            stmt.bindText(index = 1, value = "1")
            stmt.bindText(index = 2, value = "333")
            stmt.bindText(index = 3, value = "1")
            stmt.step()
        }
        databaseConnection.prepare("SELECT * FROM $ROUTE").use { stmt ->
            while (stmt.step()) {
                for (i in 0 until stmt.getColumnCount()) {
                    println(stmt.getText(i))
                }
            }
        }
    }
}