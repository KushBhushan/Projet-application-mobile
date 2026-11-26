package com.example.movieapp.ui.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun SearchScreen(
    onMovieClick: (Int) -> Unit
) {
    Text(text = "Search Movies")
}