package com.example.movieapp.ui.screens


import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen(
    onMovieClick: (Int) -> Unit
) {
    Text(text = "Discover Movies")
}