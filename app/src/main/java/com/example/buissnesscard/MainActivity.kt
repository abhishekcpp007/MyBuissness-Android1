package com.example.buissnesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.RowScopeInstance.weight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.buissnesscard.ui.theme.BuissnessCardTheme
import com.example.buissnesscard.ui.theme.PurpleGrey40

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuissnessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard("SDV Construction")
                }
            }
        }
    }
}





@Composable
fun BusinessCard(name: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(PurpleGrey40)
    ) {

                Column(
                    verticalArrangement = Arrangement.Center,
                   // horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .weight(4f)

                                .fillMaxSize()


                ) {
                    Image(painter = painterResource(id = R.drawable.logo), contentDescription ="sdv" )
                    Text(text ="SDV Construction",
                    fontWeight = FontWeight.Bold,
                        fontSize = 40.sp,
                    )
                    Text(text = "SDV Android app", fontSize = 20.sp, fontStyle = FontStyle.Italic, textAlign = TextAlign.Center)


                      }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1f)
                .fillMaxSize()
        ) {
            Column {
                Row(modifier =Modifier.padding(vertical=8.dp)

                ){
                    Icon(imageVector = Icons.Rounded.Phone, contentDescription = "Phone",
                    tint =Color.Green)
                    Spacer(modifier = Modifier.width(28.dp))
                    Text(text = "9026049600")

                }
                Row(modifier =Modifier.padding(vertical=8.dp)

                ){
                   // modifier =Modifier.padding.(vertical = 8.dp)
                    Icon(imageVector = Icons.Rounded.Share, contentDescription = "Phone",
                        tint =Color.Green)
                    Spacer(modifier = Modifier.width(28.dp))
                    Text(text = "@SDVconstruction")


                }
                Row(modifier =Modifier.padding(vertical=8.dp)

                ){
                    // modifier =Modifier.padding.(vertical = 8.dp)
                    Icon(imageVector = Icons.Rounded.Email, contentDescription = "Phone",
                        tint =Color.Green)
                    Spacer(modifier = Modifier.width(28.dp))
                    Text(text = "@SDVconstruction")


                }




            }
            
        }
                }
            }




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BuissnessCardTheme {
       BusinessCard ("SDV Construction")
    }
}