package com.example.navigas.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

data class Formulir(
    val nama: String,
    val kelamin: String,
    val status: String,
    val alamat: String
)
@Composable
fun Formulir(navController: NavController, onSubmit: (Peserta) -> Unit) {
    var nama by remember { mutableStateOf("") }
    var kelamin by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6F2FF))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(
                    Brush.verticalGradient(
                        listOf(Color(0xFFB388FF), Color(0xFF9575CD))
                    )
                ),
            contentAlignment = Alignment.Center
    }
    ) {
        Text(
            text = "Formulir Pendaftaran",
            color = Color.White,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
    }
    Spacer(modifier = Modifier.height(16.dp))

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .shadow(6.dp, RoundedCornerShape(20.dp)),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            Text("NAMA LENGKAP", fontWeight = FontWeight.Bold, fontSize = 14.sp)
            OutlinedTextField(
                value = nama,
                onValueChange = { nama = it },
                placeholder = { Text("Isian nama lengkap") },
                modifier = Modifier.fillMaxWidth()
            )
            Text("JENIS KELAMIN", fontWeight = FontWeight.Bold, fontSize = 14.sp)
            Column {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = kelamin == "Laki-laki", onClick = { kelamin = "Laki-laki" })
                    Text("Laki-laki")
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = kelamin == "Perempuan", onClick = { kelamin = "Perempuan" })
                    Text("Perempuan")
                }
            }
            Text("STATUS PERKAWINAN", fontWeight = FontWeight.Bold, fontSize = 14.sp)
            Column {
                listOf("Janda", "Lajang", "Duda").forEach {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(selected = status == it, onClick = { status = it })
                        Text(it)
                    }
                }
            }
            Text("ALAMAT", fontWeight = FontWeight.Bold, fontSize = 14.sp)
            OutlinedTextField(
                value = alamat,
                onValueChange = { alamat = it },
                placeholder = { Text("Alamat") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {
                    val peserta = Peserta(nama, kelamin, status, alamat)
                    onSubmit(peserta)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                contentPadding = PaddingValues(),
                shape = RoundedCornerShape(12.dp)
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.horizontalGradient(
                                listOf(Color(0xFF7E57C2), Color(0xFF6200EE))
                            ),
                            shape = RoundedCornerShape(12.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "Submit",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}








