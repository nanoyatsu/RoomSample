package com.nanoyatsu.learn.roomsample.room

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.nanoyatsu.learn.roomsample.RoomApplication
import com.nanoyatsu.learn.roomsample.room.dao.TaskDao
import com.nanoyatsu.learn.roomsample.room.entity.Task

@Database(entities = [Task::class], version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {
    abstract fun taskDao(): TaskDao

    companion object {
        private var INSTANCE: AppDataBase? = null

        @Synchronized
        fun getInstance(): AppDataBase {
            if (INSTANCE is AppDataBase) return INSTANCE!!
            INSTANCE = Room.databaseBuilder(RoomApplication.appContext, AppDataBase::class.java, "TODO_DB").build()
            return INSTANCE!!
        }
    }
}