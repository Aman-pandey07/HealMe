package com.aman.healme.ui.theme.screens

sealed class Screens(val screen: String) {
    data object Home:Screens("home")
    data object Appointment:Screens("appointment")
    data object Upload:Screens("upload")
    data object Account:Screens("account")
}