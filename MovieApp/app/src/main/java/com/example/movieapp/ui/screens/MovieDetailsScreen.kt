package com.example.movieapp.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun MovieDetailsScreen(
    movieId: Int
) {
    Text(text = "Movie Details: $movieId")
}