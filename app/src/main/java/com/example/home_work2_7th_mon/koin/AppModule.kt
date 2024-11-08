package com.example.home_work2_7th_mon.koin

import androidx.room.Room
import com.example.home_work2_7th_mon.data.local.AppDatabase
import com.example.home_work2_7th_mon.data.repository.Repository
import com.example.home_work2_7th_mon.domain.repository.TaskRepository
import com.example.home_work2_7th_mon.domain.usecase.TaskUseCase
import com.example.home_work2_7th_mon.presentation.fragments.addTask.AddViewModel
import com.example.home_work2_7th_mon.presentation.fragments.detail.DitailViewModel
import com.example.home_work2_7th_mon.presentation.fragments.list.TaskViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(androidContext(), AppDatabase::class.java,"app-database").build()
    }

    single { get<AppDatabase>().taskDao() }
}

val viewModelModule = module {
    viewModel { AddViewModel(get()) }
    viewModel { TaskViewModel(get()) }
    viewModel { DitailViewModel(get()) }
}

val  useCaseModule = module {
    single {TaskUseCase(get())}
}
val repositoryModule = module {
    single{ Repository(get()) }
    single<TaskRepository> { Repository(get()) }
}

val appModule = listOf(databaseModule, viewModelModule, useCaseModule, repositoryModule)