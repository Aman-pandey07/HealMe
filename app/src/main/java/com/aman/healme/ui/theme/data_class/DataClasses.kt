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
    Doctor("Dr. William Wilson", R.drawable.docimage01,"Heart Surgeon"),

    //Cardiologist
    Doctor("Dr. William Wilson", R.drawable.docimage01, "Cardiologist"),
    Doctor("Dr. Emily Carter", R.drawable.docimage01, "Cardiologist"),
    Doctor("Dr. David Lee", R.drawable.docimage01, "Cardiologist"),
    Doctor("Dr. Sarah Kim", R.drawable.docimage01, "Cardiologist"),
    Doctor("Dr. Michael Brown", R.drawable.docimage01, "Cardiologist"),
    Doctor("Dr. Olivia Johnson", R.drawable.docimage01, "Cardiologist"),

    //Orthopedic Surgeon
    Doctor("Dr. Ethan Miller", R.drawable.docimage01, "Orthopedic Surgeon"),
    Doctor("Dr. Sophia Davis", R.drawable.docimage01, "Orthopedic Surgeon"),
    Doctor("Dr. Benjamin Harris", R.drawable.docimage01, "Orthopedic Surgeon"),
    Doctor("Dr. Ava Anderson", R.drawable.docimage01, "Orthopedic Surgeon"),

    //Pediatrics
    Doctor("Dr. Noah Thomas", R.drawable.docimage01, "Pediatrician"),
    Doctor("Dr. Lily Martinez", R.drawable.docimage01, "Pediatrician"),
    Doctor("Dr. Lucas Garcia", R.drawable.docimage01, "Pediatrician"),
    Doctor("Dr. Amelia Hernandez", R.drawable.docimage01, "Pediatrician"),

    //Dermatology
    Doctor("Dr. Caleb Patel", R.drawable.docimage01, "Dermatologist"),
    Doctor("Dr. Zoey Rogers", R.drawable.docimage01, "Dermatologist"),

    //Neurologist
    Doctor("Dr. Elijah Cook", R.drawable.docimage01, "Neurologist"),
    Doctor("Dr. Scarlett Perez", R.drawable.docimage01, "Neurologist"),
    Doctor("Dr. Owen Baker", R.drawable.docimage01, "Neurologist"),

    //Ophthalmologist
    Doctor("Dr. Chloe Hall", R.drawable.docimage01, "Ophthalmologist"),
    Doctor("Dr. Wyatt Allen", R.drawable.docimage01, "Ophthalmologist"),







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