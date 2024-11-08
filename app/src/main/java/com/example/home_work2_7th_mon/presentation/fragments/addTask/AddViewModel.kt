package com.example.home_work2_7th_mon.presentation.fragments.addTask

import androidx.lifecycle.ViewModel
import com.example.home_work2_7th_mon.data.model.TaskModel
import com.example.home_work2_7th_mon.domain.usecase.TaskUseCase

class AddViewModel(private val taskUseCase: TaskUseCase):ViewModel() {
    fun addTask(taskModel: TaskModel) = taskUseCase.addTask(taskModel)
    fun updateTask(taskModel: TaskModel) = taskUseCase.update(taskModel)
}