package com.example.home_work2_7th_mon.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.home_work2_7th_mon.data.model.TaskModel

@Database(entities = [TaskModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDAO
}