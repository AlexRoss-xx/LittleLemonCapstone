package com.example.littlelemoncapstone

interface Destinations {
    val route: String
}

object Onboarding : Destinations {
    override val route = "Onboarding"
}
