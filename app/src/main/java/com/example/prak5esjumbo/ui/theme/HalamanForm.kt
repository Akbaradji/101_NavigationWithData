package com.example.prak5esjumbo.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak5esjumbo.R
import com.example.prak5esjumbo.ui.theme.Prak5EsjumboTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    onSubmitButtonClick: (MutableList<String>) -> Unit,
    onCancelButtonClick: () -> Unit
){
    var namaTxt by rememberSaveable {
        mutableStateOf("")
    }

    var alamatTxt by rememberSaveable {
        mutableStateOf("")
    }

    var telponTxt by rememberSaveable {
        mutableStateOf("")
    }

    var listDataTxt : MutableList<String> = mutableListOf(namaTxt, alamatTxt, telponTxt)

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ){

        OutlinedTextField(value = namaTxt, onValueChange = {
            namaTxt = it
        }, label = {
            Text(text = "Nama Pelanggan")
        },
            placeholder = { Text(text = "Masukkan Nama Pelanggan")}
        )
        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(value = telponTxt, onValueChange = {
            telponTxt = it
        }, label = {
            Text(text = "NoTlp. Pelanggan")
        },
            placeholder = { Text(text = "Masukkan NoTlp. Pelanggan")}
        )
        Spacer(modifier = Modifier.padding(16.dp))

        OutlinedTextField(value = alamatTxt, onValueChange = {
            alamatTxt = it
        }, label = {
            Text(text = "Alamat Pelanggan")
        },
            placeholder = { Text(text = "Masukkan Alamat Pelanggan")}
        )

    }
}

@Preview(showBackground = true)
@Composable
fun HalamanHome() {
    Prak5EsjumboTheme() {
        HalamanForm(onSubmitButtonClick= {}, onCancelButtonClick =  {})
    }
}