package com.alpha.myeyecare.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.alpha.myeyecare.data.local.entities.ReminderHistory
import kotlinx.coroutines.flow.Flow

@Dao
interface ReminderHistoryDao {

    @Insert
    suspend fun insert(history: ReminderHistory)

    @Query("""
        SELECT * FROM reminder_history 
        WHERE timestamp >= :fromTime
    """)
    fun getHistoryFrom(fromTime: Long): Flow<List<ReminderHistory>>
}
