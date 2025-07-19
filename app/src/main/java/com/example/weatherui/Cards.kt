package com.example.weatherui

import androidx.compose.material3.Card
import androidx.compose.ui.res.painterResource

data class Cards(val time: String,val img: Int,val tem: String)

val List = listOf<Cards>(
    Cards("7 am", R.drawable.p,"25°"),
    Cards("8 am", R.drawable.cdcs,"27°"),
    Cards("9 am", R.drawable.ccccc,"29°"),
    Cards("10 am", R.drawable.ds,"55°"),
    Cards("11 am", R.drawable.ccccc,"22°"),
    Cards("12 am", R.drawable.p,"21°"),

)
