package org.iwaki.labor

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.iwaki.labor.screen.HomeScreen
import org.iwaki.labor.screen.ProfileScreen

@Suppress("FunctionName")
@Composable
fun AppRoutes() {
    val navigationController = rememberNavController()

    NavHost(navController = navigationController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                onProfileClick = { userId ->
                    navigationController.navigate("profile/$userId")
                },
            )
        }

        composable("profile/{userId}") { backStackEntry ->
            val userId = backStackEntry.arguments?.getString("userId")
            ProfileScreen(userId = userId)
        }
    }
}
