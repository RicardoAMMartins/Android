package com.example.a1aplicacao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a1aplicacao.ui.theme._1ºAplicacaoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _1ºAplicacaoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
/*
    Row {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
        Image(painter = painterResource(id = R.drawable.), contentDescription = null)

    }
    //var variable:String ="ASd";
*/
    Row {
        Column {
            Text(text = "Ricardo Martins")//isto é tudo Strings
            Text(text = "19/10/2023")
        }
        Image(
            painter = painterResource(id = R.drawable.croissant_imagem) ,//chmar imagem
            contentDescription ="Logotipo",
            modifier = Modifier.clip(CircleShape).size(48.dp).background(Color.Black).border(
                BorderStroke(5.dp,Color.Red)//tipo de forma,tamanho,background color e border
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _1ºAplicacaoTheme {
        Greeting("Android")
    }
}