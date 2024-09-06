package uk.ac.aber.dcs.cs31620.faa.ui.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import uk.ac.aber.dcs.cs31620.faa.ui.components.MainPageNavigationBar
import uk.ac.aber.dcs.cs31620.faa.ui.components.MainPageTopAppBar
import uk.ac.aber.dcs.cs31620.faa.ui.components.TopLevelScaffold
import uk.ac.aber.dcs.cs31620.faa.ui.theme.FAATheme
/**
 * Represents the home screen. For this version we only have a
 * top app bar, navigation bar and empty content.
 * @author Chris Loftus
 */
@Composable
fun HomeScreen(navController: NavHostController){
    TopLevelScaffold(
        navController = navController
    ) { innerPadding ->
        Surface(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Text(text = "Home Screen",
                modifier = Modifier.padding(start = 8.dp))
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    val navController = rememberNavController()
    FAATheme(dynamicColor = false) {
        HomeScreen(navController)
    }
}
