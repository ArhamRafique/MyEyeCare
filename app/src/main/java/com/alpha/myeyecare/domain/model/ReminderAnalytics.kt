package com.alpha.myeyecare.domain.model

data class ReminderAnalytics(
    val completed: Int,
    val missed: Int
) {
    val total: Int
        get() = completed + missed

    val completionPercentage: Int
        get() = if (total == 0) 0 else (completed * 100) / total
}