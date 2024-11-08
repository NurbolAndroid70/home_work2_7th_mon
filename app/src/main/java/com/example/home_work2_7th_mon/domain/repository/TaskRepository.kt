package com.example.home_work2_7th_mon.domain.repository

import com.example.home_work2_7th_mon.data.model.TaskModel

interface TaskRepository {
    fun addTask(taskModel: TaskModel)
    fun update(taskModel: TaskModel)
    fun delete(taskModel: TaskModel)
    fun getById(id: Int): TaskModel
    fun getAll(): List<TaskModel>
}