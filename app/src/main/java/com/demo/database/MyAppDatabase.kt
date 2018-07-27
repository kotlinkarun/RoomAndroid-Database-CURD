package com.demo.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.demo.dao.MyDao
import com.demo.entity.User


@Database(entities=[(User::class)],version = 1, exportSchema = true)
abstract class MyAppDatabase: RoomDatabase() {
    abstract fun myDao(): MyDao
}