package com.example.home_work2_7th_mon.presentation.fragments.list

import androidx.lifecycle.ViewModel
import com.example.home_work2_7th_mon.data.model.TaskModel
import com.example.home_work2_7th_mon.domain.usecase.TaskUseCase

class TaskViewModel(private val taskUseCase: TaskUseCase) :ViewModel(){
    fun getAll()=taskUseCase.getAll()
    fun delete(taskModel: TaskModel) = taskUseCase.delete(taskModel)
}