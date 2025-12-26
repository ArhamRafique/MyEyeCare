package com.alpha.myeyecare.presentation.ui.home

import android.annotation.SuppressLint
import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RateReview
import androidx.compose.material.icons.filled.WaterDrop
import androidx.compose.material.icons.rounded.Visibility
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.alpha.myeyecare.common.constants.AppDestinations
import com.alpha.myeyecare.domain.model.ReminderAnalytics
import com.alpha.myeyecare.presentation.ui.CheckUserNotificationPermission
import com.alpha.myeyecare.presentation.ui.common.FeatureCard

@SuppressLint("ContextCastToActivity")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    shouldCheckPermission: Boolean,
    onGoToSuggestionsClicked: () -> Unit,
    updatePermissionStatus: () -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val analytics by viewModel.analytics.collectAsState()
    var showExitDialog by remember { mutableStateOf(false) }
    val activity = LocalContext.current as? Activity

    BackHandler {
        showExitDialog = true
    }

    if (showExitDialog) {
        ExitConfirmationDialog(
            onConfirmExit = {
                showExitDialog = false
                activity?.finish()
            },
            onDismiss = { showExitDialog = false }
        )
    }

    CheckUserNotificationPermission(
        fromReminderDetailsScreen = false,
        shouldCheckPermission = shouldCheckPermission,
        permissionGranted = {},
        onActionClick = updatePermissionStatus
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Health Reminders",
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = onGoToSuggestionsClicked,
                icon = {
                    Icon(
                        imageVector = Icons.Filled.RateReview,
                        contentDescription = "Suggestions"
                    )
                },
                text = { Text("Suggestion") }
            )
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "What would you like to set up?",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            FeatureCard(
                title = "Eye Care Reminder",
                description = "Protect your vision, take regular breaks.",
                icon = Icons.Rounded.Visibility,
                backgroundColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                onClick = {
                    navController.navigate(AppDestinations.EYE_CARE_REMINDER_SCREEN)
                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            FeatureCard(
                title = "Water Drink Reminder",
                description = "Stay hydrated throughout the day.",
                icon = Icons.Filled.WaterDrop,
                backgroundColor = MaterialTheme.colorScheme.tertiaryContainer,
                contentColor = MaterialTheme.colorScheme.onTertiaryContainer,
                onClick = {
                    navController.navigate(AppDestinations.WATER_REMINDER_SCREEN)
                }
            )

            Spacer(modifier = Modifier.height(32.dp))

            // ✅ ANALYTICS SECTION
            AnalyticsCard(analytics)

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "\"Take care of your body. It's the only place you have to live.\"",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.outline,
                modifier = Modifier.padding(bottom = 24.dp)
            )
        }
    }
}
@Composable
private fun AnalyticsItem(
    title: String,
    value: String,
    icon: ImageVector,
    color: Color
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = color,
            modifier = Modifier.size(28.dp)
        )

        Spacer(Modifier.height(6.dp))

        Text(
            text = value,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = title,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.outline
        )
    }
}

@Composable
fun AnalyticsCard(
    analytics: ReminderAnalytics
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            // 🔹 Header
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Insights,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primary
                )

                Spacer(Modifier.width(8.dp))

                Text(
                    text = "Weekly Progress",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(Modifier.height(16.dp))

            // 🔹 Stats Row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                AnalyticsItem(
                    title = "Completed",
                    value = analytics.completed.toString(),
                    icon = Icons.Default.CheckCircle,
                    color = Color(0xFF2E7D32) // green
                )

                AnalyticsItem(
                    title = "Missed",
                    value = analytics.missed.toString(),
                    icon = Icons.Default.Cancel,
                    color = Color(0xFFC62828) // red
                )

                AnalyticsItem(
                    title = "Success",
                    value = "${analytics.completionPercentage}%",
                    icon = Icons.Default.TrendingUp,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Composable
fun ExitConfirmationDialog(
    onConfirmExit: () -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Confirm Exit") },
        text = { Text("Are you sure you want to exit the app?") },
        confirmButton = {
            Button(onClick = onConfirmExit) {
                Text("Exit")
            }
        },
        dismissButton = {
            OutlinedButton(onClick = onDismiss) {
                Text("Cancel")
            }
        }
    )
}
