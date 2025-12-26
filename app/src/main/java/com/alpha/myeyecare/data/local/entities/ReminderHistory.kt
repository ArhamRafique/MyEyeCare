package com.alpha.myeyecare.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reminder_history")
data class ReminderHistory(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val reminderId: Long,
    val status: ReminderStatus,
    val timestamp: Long
)

enum class ReminderStatus {
    COMPLETED,
    MISSED
}
