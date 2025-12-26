package com.alpha.myeyecare.domain.repository

import com.alpha.myeyecare.data.local.entities.ReminderHistory
import com.alpha.myeyecare.data.local.entities.ReminderStatus
import com.alpha.myeyecare.domain.model.ReminderDetails
import kotlinx.coroutines.flow.Flow

interface ReminderRepository {

    fun getReminderDetails(id: String): Flow<ReminderDetails>

    fun isReminderEnable(reminder: ReminderDetails): Flow<Boolean>

    suspend fun insertReminderIntoLocal(reminder: ReminderDetails)

    suspend fun logReminderStatus(
        reminderId: Long,
        status: ReminderStatus
    )

    fun getWeeklyHistory(): Flow<List<ReminderHistory>>
}
