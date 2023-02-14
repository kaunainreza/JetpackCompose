package com.example.jetpackcompose

import android.content.res.Configuration
import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.support.v4.os.IResultReceiver.Default
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            Title()
        }

    }
}

@Composable
fun Title(){
    val context= LocalContext.current
  Text(
    text = "Coding", fontSize = 35.sp,
    fontFamily = FontFamily.Cursive,
    color = colorResource(id = R.color.purple_700),
      modifier = Modifier.clickable {
          Toast.makeText(context, "Title Clicked", Toast.LENGTH_SHORT).show()
          })

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
Surface(Modifier.fillMaxSize()) {
    Title()
}

}