package com.example.navigas.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navigas.R

@Composable
fun HalamanUtama(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Selamat Datang",
            fontSize = 30.sp,
            color = Color(0xFF800080),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier.size(200.dp)
        )
        spacer(modifier = Modifier.height(20.dp))

        Text(
            "Muhammad Shidqul Iman",
            fontSize = 20.sp,
            color = Color(0xFF6A1B9A),
            fontWeight = FontWeight.Medium
        )

        Text(
            "20230140233",
            fontSize = 16.sp,
            color = Color.DarkGray
        )
