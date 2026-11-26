package com.example.movieapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

import com.example.movieapp.ui.screens.HomeScreen
import com.example.movieapp.ui.screens.SearchScreen
import com.example.movieapp.ui.screens.MovieDetailsScreen
import com.example.movieapp.ui.screens.ProfileScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = MovieAppScreen.Home.name
    ) {

        composable(route = MovieAppScreen.Home.name) {
            HomeScreen()
        }

        composable(MovieAppScreen.Search.name) {
            SearchScreen(
                onMovieClick = { id ->
                    navController.navigate(
                        "${MovieAppScreen.Details.name}/$id"
                    )
                }
            )
        }

        composable(
            route = "${MovieAppScreen.Details.name}/{movieId}",
            arguments = listOf(
                navArgument("movieId") {
                    type = NavType.IntType
                }
            )
        ) { entry ->

            val movieId =
                entry.arguments?.getInt("movieId") ?: 0

            MovieDetailsScreen(movieId = movieId)
        }

        composable(MovieAppScreen.Profile.name) {
            ProfileScreen()
        }
    }
}