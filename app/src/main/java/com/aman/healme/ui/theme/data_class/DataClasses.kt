package com.aman.healme.ui.theme.data_class

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.aman.healme.R
import com.aman.healme.ui.theme.screens.navigationdrawer.NavItem


data class ImageData(
    val imageUrl:String,
    val title: String
)
data class NavItem(
    val label : String,
    val icon : ImageVector

)

data class Doctor(
    val name: String,
    val imageResId: Int,
    val spec :String
)

val doctors = listOf(
    Doctor("Dr. John Doe", R.drawable.docimage01,"Heart Surgeon"),
    Doctor("Dr. Jane Smith", R.drawable.docimage01,"Heart Surgeon"),
    Doctor("Dr. Michael Johnson", R.drawable.docimage01,"Heart Surgeon"),
    Doctor("Dr. Emily Brown", R.drawable.docimage01,"Heart Surgeon"),
    Doctor("Dr. William Wilson", R.drawable.docimage01,"Heart Surgeon")
)

data class SymptomsImg(
    val sym:String,
    val imageResIds: Int
)
val symList = listOf(
    SymptomsImg("Cold", R.drawable.cold1),
    SymptomsImg("Headache", R.drawable.cold1),
    SymptomsImg("Digestion", R.drawable.cold1),
    SymptomsImg("Ear Pain", R.drawable.cold1),
    SymptomsImg("Stomach Cramp", R.drawable.cold1),
    SymptomsImg("Skin Infection", R.drawable.cold1)
)
val imageList = listOf(R.drawable.image1, R.drawable.image1, R.drawable.image1)

val navItemList = listOf(
    NavItem("Home", Icons.Default.Home),
    NavItem("Apointment", Icons.Default.DateRange),
    NavItem("Upload", Icons.AutoMirrored.Filled.List),
    NavItem("Account", Icons.Default.AccountCircle)
)