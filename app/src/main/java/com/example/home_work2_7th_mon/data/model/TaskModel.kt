package com.example.home_work2_7th_mon.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class TaskModel(
    @PrimaryKey(autoGenerate = true)
    val id :Int,
    val title:String
)
