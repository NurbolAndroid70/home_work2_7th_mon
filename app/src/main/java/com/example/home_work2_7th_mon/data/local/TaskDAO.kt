package com.example.home_work2_7th_mon.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.home_work2_7th_mon.data.model.TaskModel
@Dao
interface TaskDAO {

    @Query("SELECT * FROM task")
    fun getAll(): List<TaskModel>

    @Query("SELECT * FROM task WHERE id = :id")
    fun getNoteById(id: Int): TaskModel

    @Insert
    fun addTask(taskModel: TaskModel)

    @Delete
    fun deleteTask(taskModel: TaskModel)

    @Update
    fun updateTask(taskModel: TaskModel)
}