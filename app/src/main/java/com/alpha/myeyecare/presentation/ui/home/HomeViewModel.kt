package com.alpha.myeyecare.presentation.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alpha.myeyecare.domain.useCases.GetWeeklyAnalyticsUseCase
import com.alpha.myeyecare.domain.model.ReminderAnalytics
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn

@HiltViewModel
class HomeViewModel @Inject constructor(
    getWeeklyAnalyticsUseCase: GetWeeklyAnalyticsUseCase
) : ViewModel() {

    val analytics = getWeeklyAnalyticsUseCase()
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5_000),
            ReminderAnalytics(0, 0)
        )
}
