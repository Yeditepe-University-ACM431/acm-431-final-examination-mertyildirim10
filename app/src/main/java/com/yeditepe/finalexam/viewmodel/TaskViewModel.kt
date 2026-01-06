package com.yeditepe.finalexam.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task
import kotlin.text.get
import kotlin.text.set

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    var tasks = mutableStateListOf(
        Task(1, "Homework", false),
        Task(2, "Final Project", true)
    )
        private set

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val index = tasks.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val task = tasks[index]
            tasks[index] = task.copy(isCompleted = !task.isCompleted)
        }
    }
}

