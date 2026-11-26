package com.example.movieapp.ui.navigation

import androidx.annotation.StringRes
import com.example.movieapp.R

enum class MovieAppScreen(@StringRes val title: Int) {
    Home(title = R.string.home),
    Search(title = R.string.search),
    Details(title = R.string.movie_details),
    Profile(title = R.string.profile)
}