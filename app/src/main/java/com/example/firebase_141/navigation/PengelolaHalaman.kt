package com.example.firebase_141.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.firebase_141.ui.pages.HomeScreen
import com.example.firebase_141.ui.pages.InsertMhsView
import java.lang.reflect.Modifier

@Composable
fun PengelolaHalaman (
    modifier: Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost (
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ){
        composable(route = DestinasiHome.route) {
            HomeScreen (
                navigateToltemEntry = { navController.navigate(DestinasiInsert.route) }
            )
        }
        composable(route = DestinasiInsert.route) {
            InsertMhsView(
                onBack = { navController.popBackStack() },
                onNavigate = {
                    navController.navigate(DestinasiHome.route) }
            )
        }
    }
}