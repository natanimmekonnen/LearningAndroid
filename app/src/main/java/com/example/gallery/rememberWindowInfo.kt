package com.example.gallery
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun RememberWindowInfo(): WindowInfo
{
val configuration= LocalConfiguration.current
    return WindowInfo(
        screenWidthInfo = when{
            configuration.screenWidthDp < 600 -> WindowInfo.windowType.Compact
            configuration.screenWidthDp <840 -> WindowInfo.windowType.Medium
            else ->     WindowInfo.windowType.Expanded

        },
        screenHeightInfo = when{
            configuration.screenHeightDp < 480 -> WindowInfo.windowType.Compact
            configuration.screenHeightDp <900 -> WindowInfo.windowType.Medium
            else ->     WindowInfo.windowType.Expanded

        },
        screenWidth = configuration.screenWidthDp.dp,
        screenHeight = configuration.screenHeightDp.dp
    )

}

data class WindowInfo(
    val screenWidthInfo :windowType,
    val screenHeightInfo : windowType,
    val screenWidth: Dp,
    val screenHeight: Dp
)
{
    sealed class windowType
    {
        object Compact: windowType()
        object Medium : windowType()
        object Expanded: windowType()
    }

}

