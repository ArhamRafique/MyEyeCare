package com.alpha.myeyecare.data.repository

import com.alpha.myeyecare.common.utils.getTitleForReminder
import com.alpha.myeyecare.common.utils.toReminder
import com.alpha.myeyecare.common.utils.toReminderDetails
import com.alpha.myeyecare.data.local.dao.ReminderDao
import com.alpha.myeyecare.data.local.dao.ReminderHistoryDao
import com.alpha.myeyecare.data.local.entities.ReminderHistory
import com.alpha.myeyecare.data.local.entities.ReminderStatus
import com.alpha.myeyecare.domain.model.ReminderDetails
import com.alpha.myeyecare.domain.repository.ReminderRepository
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ReminderRepositoryImpl @Inject constructor(
    private val reminderDao: ReminderDao,
    private val historyDao: ReminderHistoryDao

) : ReminderRepository {
    override fun getReminderDetails(id: String): Flow<ReminderDetails> = flow {
        val reminder = reminderDao.getReminderDetails(id)
        emit(
            reminder?.toReminderDetails() ?: ReminderDetails(
                type = id,
                title = id.getTitleForReminder()
            )
        )
    }

    override fun isReminderEnable(reminder: ReminderDetails): Flow<Boolean> = flow {
        emit(reminderDao.isReminderEnable(reminder.type))
    }

    override suspend fun insertReminderIntoLocal(reminder: ReminderDetails) {
        reminderDao.insertReminderDetails(reminder.toReminder())
    }

    override suspend fun logReminderStatus(
        reminderId: Long,
        status: ReminderStatus
    ) {
        historyDao.insert(
            ReminderHistory(
                reminderId = reminderId,
                status = status,
                timestamp = System.currentTimeMillis()
            )
        )
    }

    override fun getWeeklyHistory(): Flow<List<ReminderHistory>> {
        val weekAgo = System.currentTimeMillis() - (7 * 24 * 60 * 60 * 1000)
        return historyDao.getHistoryFrom(weekAgo)
    }
}
