package com.example.navigas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.example.navigas.navigation.NavigasiUtama
import com.example.navigas.ui.theme.NavigasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigasTheme {
                Surface {
                    NavigasiUtama()
                }
            }
        }
    }
}
