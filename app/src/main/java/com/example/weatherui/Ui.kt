package com.example.weatherui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Ui(modifier: Modifier = Modifier) {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = null,
            contentScale = ContentScale.Crop, // fills the screen while cropping
            modifier = Modifier.fillMaxSize()
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxSize(),

            ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {

                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = { Text("Enter Name", color = Color.White) },
                    modifier = Modifier
                        .padding(16.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color.White,
                        unfocusedBorderColor = Color.White,
                        cursorColor = Color.White,
                        focusedLabelColor = Color.White,
                        unfocusedLabelColor = Color.White,
                        focusedTextColor = Color.White,
                        unfocusedTextColor = Color.White
                    ),
                    shape = RoundedCornerShape(16.dp)
                )

                IconButton({}) {
                    Icon(
                        Icons.Default.Search,
                        null,
                        tint = Color.White,
                        modifier = Modifier.size(40.dp)

                        )
                }
            }

            Text(
                "Mostly Cloudy",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )

            Image(
                painter = painterResource(id = R.drawable.p),
                null
            )

            Text(
                "Mon June 17 | 10:00 AM",
                fontSize = 18.sp,
                fontWeight = FontWeight.W500,
                color = Color.White
            )

            Text(
                "25°",
                fontSize = 60.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(
                "H:27  L:18",
                fontSize = 18.sp,
                fontWeight = FontWeight.W400,
                color = Color.White
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = Color(0xFF1A237E))


            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ccccc),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)

                        )
                        Text(
                            "22%",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier.padding(top = 5.dp)
                        )
                        Text(
                            "Rain",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.White,
                            modifier = Modifier.padding(top = 5.dp)
                        )

                    }

                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ds),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                        Text(
                            "18%",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier.padding(top = 5.dp)

                        )
                        Text(
                            "Humidity",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.White,
                            modifier = Modifier.padding(top = 5.dp)
                        )

                    }

                    Column(
                        modifier = Modifier.padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.cdcs),
                            contentDescription = null,
                            modifier = Modifier.size(50.dp)
                        )
                        Text(
                            "12 Km/h",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier.padding(top = 5.dp)

                        )
                        Text(
                            "Wind Speed",
                            fontSize = 15.sp,
                            fontWeight = FontWeight.W400,
                            color = Color.White,
                            modifier = Modifier.padding(top = 5.dp)
                        )

                    }
                }
            }


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,

                ) {

                Text(
                    "Today",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Yellow,
                    modifier = Modifier.padding(top = 5.dp)
                )

                Text(
                    "Next 7 Days >",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.padding(top = 5.dp)
                )

            }

            LazyRow { items(List) { it -> CardsUi(it) } }


        }
    }

}


@Composable
fun CardsUi(cards: Cards) {

    Box(
        modifier = Modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color = Color(0xFF1A237E))
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(16.dp)
        ) {


            Text(
                text = cards.time,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White,
                modifier = Modifier.padding(top = 5.dp)
            )

            Image(
                painter = painterResource(id = cards.img),
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )

            Text(
                cards.tem,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(top = 5.dp)
            )

        }

    }

}

@Preview
@Composable
private fun Uii() {
    Ui()
}