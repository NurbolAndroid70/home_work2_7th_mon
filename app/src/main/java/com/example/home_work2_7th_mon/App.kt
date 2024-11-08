package com.example.home_work2_7th_mon

import android.app.Application
import androidx.room.Room
import com.example.home_work2_7th_mon.data.local.AppDatabase
import com.example.home_work2_7th_mon.koin.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App:Application() {



    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@App)
            modules(appModule)
        }
    }

    //Комментарий

}