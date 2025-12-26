package com.alpha.myeyecare.domain.useCases

import com.alpha.myeyecare.data.local.entities.ReminderStatus
import com.alpha.myeyecare.domain.model.ReminderAnalytics   // ✅ ONLY THIS
import com.alpha.myeyecare.domain.repository.ReminderRepository
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetWeeklyAnalyticsUseCase @Inject constructor(
    private val repository: ReminderRepository
) {

    operator fun invoke(): Flow<ReminderAnalytics> {
        return repository.getWeeklyHistory().map { history ->
            val completed = history.count {
                it.status == ReminderStatus.COMPLETED
            }
            val missed = history.count {
                it.status == ReminderStatus.MISSED
            }

            ReminderAnalytics(
                completed = completed,
                missed = missed
            )
        }
    }
}
