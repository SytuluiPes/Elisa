package data.model

import kotlin.random.Random

object SqliteDB {
    fun setHost(name: String) {}
    fun setDbName(name: String) {}
    fun setPort(port: Int) {}
    fun setLogin(login: String) {}
    fun setPassword(password: String) {}
    fun run(): Boolean = Random.nextBoolean()
}