package com.example.home_work2_7th_mon.domain.usecase

import com.example.home_work2_7th_mon.data.model.TaskModel
import com.example.home_work2_7th_mon.domain.repository.TaskRepository

class TaskUseCase(private val repository: TaskRepository) {

    fun addTask(taskModel: TaskModel) = repository.addTask(taskModel)

    fun update(taskModel: TaskModel) = repository.update(taskModel)

    fun delete(taskModel: TaskModel) = repository.delete(taskModel)

    fun getById(id: Int) = repository.getById(id)

    fun getAll() = repository.getAll()
}