package com.example.praktikum5.ui.theme.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.praktikum5.model.Mahasiswa

@Composable
fun TampilMahasiswaView(
    mhs:Mahasiswa

){
    Column(modifier = Modifier.fillMaxSize()){
        TampilData(
            Judul = "Nama",
            Isinya = mhs.nama
        )
        TampilData(
            Judul = "gender",
            Isinya = mhs.gender
        )
        TampilData(
            Judul = "Nim",
            Isinya = mhs.NIM
        )
        TampilData(
            Judul = "No HP",
            Isinya = mhs.noHP
        )
        TampilData(
            Judul = "Email",
            Isinya = mhs.email
        )

        TampilData(
            Judul = "Alamat",
            Isinya = mhs.alamat
        )


    }
}
@Composable
fun TampilData(
    Judul: String,
    Isinya: String
){
    Row(modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween){
        Text(Judul,modifier = Modifier.weight(0.8f))
        Text(" : ", modifier = Modifier.weight(0.8f))
        Text(Isinya, modifier = Modifier.weight(2f))
    }
}