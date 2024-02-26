package com.example.gallery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gallery.ui.theme.GalleryTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GalleryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun AllCombined(modifier: Modifier= Modifier.fillMaxSize())
{
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = modifier.wrapContentSize()) {
        ImageDisplay(image= R.drawable._168c8608_43f4_4124_8095_33ac54eedb1f)
        DescriptionOfArt(description = R.string.grey_brown_girlie_engoying_life, date =R.string.bing_ai_2024 )
        ButtonDisplay()
    }

}


@Composable
fun ImageDisplay(modifier:Modifier=Modifier, @DrawableRes image: Int)
{
    Column( horizontalAlignment =Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center,
        modifier = modifier.background(Color( 0xffffefdd))
    )
    {
        Image(
            painter= painterResource(id = image),
            null,
            modifier = Modifier
                .padding(30.dp)
              //  .border( width = 2.dp,shape= RoundedCornerShape(20.dp), color =Color(0xffffefdd) )

        )


    }

}

@Composable
fun DescriptionOfArt(modifier:Modifier=Modifier,   @StringRes description: Int, @StringRes date: Int)
{
    Column( verticalArrangement = Arrangement.Bottom,
        modifier = modifier.background(Color( 0xffffefdd))
            .fillMaxHeight(0.8f)){
        Text(text = stringResource(description),
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.SemiBold
        )
        Text(text= stringResource(date),
            fontSize = 12.sp)


    }

}
@Composable
fun ButtonDisplay(modifier:Modifier=Modifier)
{
    Column(  modifier = modifier.fillMaxHeight(0.9f), verticalArrangement = Arrangement.Bottom) {
        Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly)
        {
            Button(
                onClick = { /*TODO*/ },
                colors =  ButtonDefaults.buttonColors(containerColor = Color( 0xffffefdd), contentColor = Color.Black),
                modifier = Modifier
                    .width(120.dp)
                    .height(38.dp),
            ) {
                Text(
                    text = stringResource(R.string.previous),
                    fontSize = 18.sp
                )

            }
            Button(onClick = { /*TODO*/ },
                colors =  ButtonDefaults.buttonColors(containerColor = Color( 0xffffefdd), contentColor = Color.Black),
                modifier = Modifier
                .width(120.dp)
                .height(38.dp)) {
                Text(
                    text = "Next",
                    fontSize = 18.sp
                )

            }

        }
    }

}
@Preview(showBackground = true)
@Composable
fun ImageDisplayPreview()
{
    GalleryTheme {
//        ImageDisplay(image= R.drawable._168c8608_43f4_4124_8095_33ac54eedb1f)
    //    DescriptionOfArt(description = R.string.grey_brown_girlie_engoying_life, date =R.string.bing_ai_2024 )
      //  ButtonDisplay( )
        AllCombined()
    }

}