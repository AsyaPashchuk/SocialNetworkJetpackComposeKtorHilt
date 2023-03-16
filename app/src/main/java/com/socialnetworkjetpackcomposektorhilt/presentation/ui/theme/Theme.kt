package com.socialnetworkjetpackcomposektorhilt.presentation.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = GreenAccent,
    background = DarkGrey,
    onBackground = TextWhite,
    onPrimary = DarkGrey,
    surface = MediumGrey,
    onSurface = LightGrey

)

@Composable
fun SocialNetworkJetpackComposeKtorHiltTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}