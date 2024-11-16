package com.example.praktikum5.ui.theme.view



import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerButtons
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum5.model.DataJK



@Composable
fun FormulirView(
    modifier: Modifier = Modifier,
    pilihanJK:List<String>,
    onClickButton: (MutableList<String>)->Unit
){
    var nama by remember { mutableStateOf("") }
    var NIM by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("")  }
    var noHP by remember { mutableStateOf("")  }
    var alamat by remember { mutableStateOf("")  }
    var jenisK by remember { mutableStateOf("") }
    var listData : MutableList<String> = mutableListOf(nama, jenisK, alamat,NIM,email,noHP)





    Column ( modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Biodata",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp)
        Spacer(modifier = Modifier.padding(20.dp))

        TextField(
            value = nama,
            onValueChange =  {nama = it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text("Nama")
            },
            placeholder = {
                Text("Masukan Nama Anda")
            }
        )
        Spacer(modifier = Modifier .padding(20.dp))

        TextField(
            modifier =  Modifier
                .fillMaxWidth()
                .padding(5.dp),
            value = NIM,
            onValueChange = {NIM = it},
            label = {Text ("Nim")
                    },
        )
        Row {
            pilihanJK.forEach { selectedJK ->
                Row (verticalAlignment = Alignment.CenterVertically){
                    RadioButton(selected = jenisK == selectedJK,
                        onClick = {
                            jenisK = selectedJK

                        })
                    Text(selectedJK)
                }

            }
        }

        TextField(
            value = email,
            onValueChange =  {email = it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text("email")
            },
            placeholder = {
                Text("Masukan Email")
            }
        )
        TextField(
            value = noHP,
            onValueChange =  {noHP = it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text("Nomor HP")
            },
            placeholder = {
                Text("Masukan NoHP ")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

        )
        TextField(
            value = alamat,
            onValueChange =  {alamat = it},
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            label = {
                Text("Alamat")
            },
            placeholder = {
                Text("Masukan Alamat")
            }
        )
        Button(onClick = {
            onClickButton(listData)

        },
            modifier = Modifier.padding(vertical = 10.dp)) {
            Text ("Submmit")

        }


    }
}



