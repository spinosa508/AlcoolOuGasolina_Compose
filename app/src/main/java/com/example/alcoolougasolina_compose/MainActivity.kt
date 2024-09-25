package com.example.alcoolougasolina_compose

import android.annotation.SuppressLint
import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alcoolougasolina_compose.ui.theme.AlcoolOuGasolina_ComposeTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fun sendValues(alcool: String, gasolina: String){

        }
        
        enableEdgeToEdge()
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(colorResource(id = R.color.dark_orange))
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxHeight(0.8f)
                        .fillMaxWidth(0.8f)
                        .background(
                            colorResource(id = R.color.teal_200),
                            shape = RoundedCornerShape(30.dp)
                        )
                        .border(
                            border = BorderStroke(
                                width = 1.dp,
                                colorResource(id = R.color.teal_700)
                            ),
                            shape = RoundedCornerShape(30.dp)
                        )
 
                ){
                    Icone()
                    Text(text = "Álcool ou Gasolina", Modifier.padding(16.dp), colorResource(id = R.color.dark_orange), fontSize = 25.sp)
                    SimpleFilledTextFieldSample()
                    Button(onClick = { /*TODO*/ }) {

                    }
                    Switch(checked = true, onCheckedChange = null)
                    }

                }
            }
        }
    }



@Composable
fun SimpleFilledTextFieldSample() {
    var alcool by remember { mutableStateOf("") }
    var gasolina by remember { mutableStateOf("") }

    OutlinedTextField(
        value = alcool,
        onValueChange = { alcool = it },
        label = { Text("Álcool")},
        modifier = Modifier.padding(16.dp)
    )
    OutlinedTextField(
        value = gasolina,
        onValueChange = { gasolina = it },
        label = { Text("Gasolina")},
        modifier = Modifier.padding(16.dp)
    )


}



@Composable
fun Icone(){
    Image(painter = painterResource(id = R.drawable._bombadegas), contentDescription = "", modifier = Modifier.size(100.dp))
}

