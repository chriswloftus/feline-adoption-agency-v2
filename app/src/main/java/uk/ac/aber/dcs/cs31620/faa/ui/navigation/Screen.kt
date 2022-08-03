package uk.ac.aber.dcs.cs31620.faa.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Cats : Screen("cats")
}

val screens = listOf(
    Screen.Home,
    Screen.Cats
)