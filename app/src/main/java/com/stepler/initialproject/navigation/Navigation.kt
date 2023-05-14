package com.stepler.initialproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stepler.samplefeature.presentation.MainScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationRoute.ROUTE_MAIN) {

        composable(NavigationRoute.ROUTE_MAIN) {
            MainScreen()
        }
    }
}