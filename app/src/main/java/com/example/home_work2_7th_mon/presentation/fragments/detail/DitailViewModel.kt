package com.example.home_work2_7th_mon.presentation.fragments.detail

import androidx.lifecycle.ViewModel
import com.example.home_work2_7th_mon.domain.usecase.TaskUseCase

class DitailViewModel(private val taskUseCase: TaskUseCase):ViewModel() {
    fun getById(id:Int)=taskUseCase.getById(id)
}