package com.example.geretathune

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.geretathune.ui.theme.GereTaThuneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GereTaThuneTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Application title
        Text(
            text = "Gère Ta Thune",
            style = androidx.compose.material3.MaterialTheme.typography.headlineLarge
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Button to add a new expense
        Button(onClick = { /* Action to add a new expense */ }) {
            Text("Ajouter une nouvelle dépense")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Button to view past expenses
        Button(onClick = { /* Action to view past expenses */ }) {
            Text("Voir les dépenses passées")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Button to view statistics
        Button(onClick = { /* Action to view statistics */ }) {
            Text("Voir les statistiques")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Optional button for settings
        Button(onClick = { /* Action to open settings */ }) {
            Text("Paramètres de l'application")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    GereTaThuneTheme {
        HomeScreen()
    }
}
