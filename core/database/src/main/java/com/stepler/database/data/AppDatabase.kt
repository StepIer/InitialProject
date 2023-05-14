package com.stepler.database.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.stepler.database.data.model.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}