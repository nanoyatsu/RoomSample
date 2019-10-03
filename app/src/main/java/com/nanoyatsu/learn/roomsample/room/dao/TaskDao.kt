package com.nanoyatsu.learn.roomsample.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.nanoyatsu.learn.roomsample.room.entity.Task

@Dao
interface TaskDao {
    @Query("SELECT * FROM Task")
    fun getAll():List<Task>

    @Query("SELECT * FROM Task WHERE completed = :completed")
    fun getCompleted(completed:Boolean):List<Task>

    @Insert
    fun insert(vararg tasks: Task)
//    fun delete()
}