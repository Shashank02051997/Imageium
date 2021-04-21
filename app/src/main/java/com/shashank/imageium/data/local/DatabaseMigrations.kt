package com.shashank.imageium.data.local

object DatabaseMigrations {
    const val DB_VERSION = 1

    /*val MIGRATIONS: Array<Migration>
        get() = arrayOf<Migration>(
            migration12()
        )

    private fun migration12(): Migration = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("ALTER TABLE ${Post.TABLE_NAME} ADD COLUMN body TEXT")
        }
    }*/
}
