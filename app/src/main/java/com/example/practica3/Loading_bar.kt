package com.example.practica3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ImageResourceDemo() {
    val image: Painter = painterResource(id = R.drawable.background_image)
    Image(
        painter = image,
        contentDescription = "",
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Column(verticalArrangement = Arrangement.spacedBy(20.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            contentAlignment = Alignment.TopCenter
        )
        {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .height(281.dp)
                    .width(250.dp)
                    .padding(top = 98.dp),
                Alignment.TopCenter
            )
        }
        Box(contentAlignment = Alignment.Center)
        {
            Text(
                text = "STRONG\n   MAN",
                fontSize = 45.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Box(modifier = Modifier.padding(top = 150.dp))
        {CustomLinearProgressBar()}
    }
}
@Composable
private fun CustomLinearProgressBar(){
    Column(modifier = Modifier.fillMaxWidth()) {
        LinearProgressIndicator(
            progress = 0.7f,
            modifier = Modifier
                .fillMaxWidth()
                .height(15.dp)
                .padding(horizontal = 70.dp),
            backgroundColor = Color.White,
            color = Color(0xFF747474),
        )
    }
}


