package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BirthdayCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    GreetingText(
                        mensagem = "Feliz Aniversário!!",
                        de = "De: Paulo",
                        para = "Para: Usuário",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardTheme {
        GreetingText(mensagem = "Feliz Aniversário!!", de = "De: Paulo", para = "Para: Usuário")
    }
}
@Composable
fun GreetingText(mensagem: String, de: String, para: String, modifier: Modifier = Modifier){
    Column(verticalArrangement = Arrangement.Center, modifier = modifier) {
        Text(
            text = de,
            fontSize = 30.sp
        )
        Text(
            text = mensagem,
            fontSize = 75.sp,
            lineHeight = 90.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = para,
            fontSize = 30.sp,
            modifier = Modifier.align(alignment = Alignment.End)
        )
    }
}