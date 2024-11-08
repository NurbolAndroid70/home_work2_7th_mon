package com.example.home_work2_7th_mon.data.repository

import com.example.home_work2_7th_mon.data.local.TaskDAO
import com.example.home_work2_7th_mon.data.model.TaskModel
import com.example.home_work2_7th_mon.domain.repository.TaskRepository

class Repository(private val dao: TaskDAO):TaskRepository {
    override fun addTask(taskModel: TaskModel) {
        dao.addTask(taskModel)
    }

    override fun update(taskModel: TaskModel) {
        dao.updateTask(taskModel)
    }

    override fun delete(taskModel: TaskModel) {
        dao.deleteTask(taskModel)
    }

    override fun getById(id: Int): TaskModel = dao.getNoteById(id)

    override fun getAll(): List<TaskModel> =
       dao.getAll()

}