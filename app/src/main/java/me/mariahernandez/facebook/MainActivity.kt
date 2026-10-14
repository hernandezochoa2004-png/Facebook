package me.mariahernandez.facebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import me.mariahernandez.facebook.ui.theme.FacebookTheme
import androidx.navigation.compose.composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            // Nav Controller
            val myNavController = rememberNavController()

            // Nav Host start destination (Necesita esas 3 cosas)
            NavHost(
                navController = myNavController,
                startDestination = "Login",
                modifier = Modifier.fillMaxSize() ) {

                composable (route="login") {FacebookLoginScreen(myNavController) }

                composable(route="Register") {FacebookRegisterScreen()}
            }


        }
    }
}

