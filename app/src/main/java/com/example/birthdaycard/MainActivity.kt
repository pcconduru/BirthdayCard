package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    GreetingImage(
                        mensagem = stringResource(R.string.happy_birthday_text),
                        de = stringResource(R.string.signature_text),
                        modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardTheme {
        GreetingText(mensagem = stringResource(R.string.happy_birthday_text), de = stringResource(R.string.signature_text))
        GreetingImage(mensagem = stringResource(R.string.happy_birthday_text), de = stringResource(R.string.signature_text))
    }
}
@Composable
fun GreetingText(mensagem: String, de: String, modifier: Modifier = Modifier){
    Column(verticalArrangement = Arrangement.Center, modifier = modifier) {
        Text(
            text = mensagem,
            fontSize = 75.sp,
            lineHeight = 90.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = de,
            fontSize = 30.sp,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )
    }
}
@Composable
fun GreetingImage(mensagem: String, de: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        GreetingText(
            mensagem = stringResource(R.string.happy_birthday_text),
            de = stringResource(R.string.signature_text),
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}