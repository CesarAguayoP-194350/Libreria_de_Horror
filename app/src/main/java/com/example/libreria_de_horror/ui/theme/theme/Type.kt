package com.example.libreria_de_horror.ui.theme.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
// nueva tipografia
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.googlefonts.Font as GoogleFontResource
import androidx.compose.ui.text.googlefonts.FontFamily as GoogleFontFamily

// Configura la fuente desde Google Fonts
private val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

// Nombre exacto de la fuente (como aparece en Google Fonts)
private val bbhSansBartle = GoogleFont("BBH Sans Bartle")

val BBHSansBartleFontFamily = GoogleFontFamily(
    googleFont = bbhSansBartle,
    fontProvider = provider
)

// Define la tipografía de tu app
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = BBHSansBartleFontFamily,
        fontSize = 16.sp
    ),
    titleLarge = TextStyle(
        fontFamily = BBHSansBartleFontFamily,
        fontSize = 22.sp
    ),
    labelSmall = TextStyle(
        fontFamily = BBHSansBartleFontFamily,
        fontSize = 12.sp
    )
)

// Set of Material typography styles to start with
/*val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
     Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)*/