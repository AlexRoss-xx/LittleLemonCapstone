package com.example.littlelemoncapstone

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.littlelemoncapstone.composables.Onboarding


@Composable
fun NavigationComposable(context: Context, navController: NavHostController) {
    NavHost(navController = navController,
        startDestination = determineStartDestination(context)
    ) {
        composable(Onboarding.route) {
            Onboarding(navController)
        }
    }
}

private fun determineStartDestination(context: Context): String {
        return Onboarding.route
}