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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
AllCombined()
                }
            }
        }
    }
}

@Composable
fun AllCombined(modifier: Modifier= Modifier)
{
    var moveAround by remember{ mutableStateOf(1) }
when(moveAround) {
   1-> Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(80.dp))
        Surface(
            shadowElevation = 6.dp,
            color = Color(0xffffefdd),
            modifier = Modifier.padding(20.dp)
        ) {

            ImageDisplay(image = R.drawable._168c8608_43f4_4124_8095_33ac54eedb1f)
        }
        Spacer(modifier = Modifier.size(50.dp))
        DescriptionOfArt(
            color = Color(0xffffefdd),
            description = R.string.grey_brown_girlie_engoying_life,
            date = R.string.bing_ai_2024
        )

       // ButtonDisplay(modifier = Modifier,Color(0xffffefdd))

       Row(modifier = Modifier
           .fillMaxWidth()
           .padding(16.dp), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.Center)
       {
//           Button(
//               onClick = {  },
//               colors = ButtonDefaults.buttonColors(
//                   containerColor = Color(0xffffefdd),
//                   contentColor = Color.Black
//               ),
//               modifier = Modifier
//                   .width(160.dp)
//                   .height(38.dp),
//           ) {
//               Text(
//                   text = stringResource(R.string.previous),
//                   fontSize = 18.sp
//               )
//
//           }
           Button(
               onClick = { moveAround=2 },
               colors = ButtonDefaults.buttonColors(
                   containerColor = Color(0xffffefdd),
                   contentColor = Color.Black
               ),
               modifier = Modifier
                   .width(160.dp)
                   .height(38.dp)
           ) {
               Text(
                   text = "Next",
                   fontSize = 18.sp
               )

           }
       }
    }
    2->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.size(80.dp))
            Surface(
                shadowElevation = 6.dp,
                color = Color(0xffFFD1DC),
                modifier = Modifier.padding(20.dp)
            ) {

                ImageDisplay(image = R.drawable._52200572_e7ba_47fe_9148_d7a19510c407)
            }
            Spacer(modifier = Modifier.size(50.dp))
            DescriptionOfArt(
                color = Color(0xffFFD1DC),
                description = R.string.pink_queen_doing_her_own_thang,
                date = R.string.bing_ai_2023

            )

           // ButtonDisplay(modifier = Modifier, color = Color(0xffFFD1DC))

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.spacedBy(25.dp))
            {
                Button(
                    onClick = { moveAround=1 },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffFFD1DC),
                        contentColor = Color.Black
                    ),
                    modifier = Modifier
                        .width(160.dp)
                        .height(38.dp),
                ) {
                    Text(
                        text = stringResource(R.string.previous),
                        fontSize = 18.sp
                    )

                }
                Button(
                    onClick = {  moveAround=3 },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffFFD1DC),
                        contentColor = Color.Black
                    ),
                    modifier = Modifier
                        .width(160.dp)
                        .height(38.dp)
                ) {
                    Text(
                        text = "Next",
                        fontSize = 18.sp
                    )

                }
            }
        }
    3-> Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(80.dp))
        Surface(
            shadowElevation = 6.dp,
            color = Color(	0xffb2cbde),
            modifier = Modifier.padding(20.dp)
        ) {

            ImageDisplay(image = R.drawable._631a8a7b_b9a5_4e73_ac0b_4f2d6c624ffc)
        }
        Spacer(modifier = Modifier.size(50.dp))
        DescriptionOfArt(
            color = Color(0xffb2cbde),
            description = R.string.brown_pookie_acting_all_cute_and_zah,
            date = R.string.bing_ai_2022

        )

        // ButtonDisplay(modifier = Modifier, color = Color(0xffFFD1DC))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.spacedBy(25.dp))
        {
            Button(
                onClick = {moveAround=2 },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffb2cbde),
                    contentColor = Color.Black
                ),
                modifier = Modifier
                    .width(160.dp)
                    .height(38.dp),
            ) {
                Text(
                    text = stringResource(R.string.previous),
                    fontSize = 18.sp
                )

            }
            Button(
                onClick = {  moveAround=4 },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffb2cbde),
                    contentColor = Color.Black
                ),
                modifier = Modifier
                    .width(160.dp)
                    .height(38.dp)
            ) {
                Text(
                    text = "Next",
                    fontSize = 18.sp
                )

            }

        }
    }
    4->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = modifier.fillMaxSize()
        ) {
            Spacer(modifier = Modifier.size(80.dp))
            Surface(
                shadowElevation = 6.dp,
                color = Color(	0xffb2fba5),
                modifier = Modifier.padding(20.dp)
            ) {

                ImageDisplay(image = R.drawable._cdd06340_8118_4eea_b28f_f5976c6623c3)
            }
            Spacer(modifier = Modifier.size(50.dp))
            DescriptionOfArt(
                color = Color(0xffb2fba5),
                description = R.string.perfect_looking_cow,
                date = R.string.bing_ai_2020

            )

            // ButtonDisplay(modifier = Modifier, color = Color(0xffFFD1DC))

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.Center)
            {
                Button(
                    onClick = {moveAround=3 },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffb2fba5),
                        contentColor = Color.Black
                    ),
                    modifier = Modifier
                        .width(160.dp)
                        .height(38.dp),
                ) {
                    Text(
                        text = stringResource(R.string.previous),
                        fontSize = 18.sp
                    )

                }
//                Button(
//                    onClick = {  moveAround=3 },
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = Color(0xffb2fba5),
//                        contentColor = Color.Black
//                    ),
//                    modifier = Modifier
//                        .width(160.dp)
//                        .height(38.dp)
//                ) {
//                    Text(
//                        text = "Next",
//                        fontSize = 18.sp
//                    )
//
//                }

            }
        }
        //b2fba5
}

}


@Composable
fun ImageDisplay(modifier:Modifier=Modifier, @DrawableRes image: Int)
{
    Column( horizontalAlignment =Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center,
    )
    {
        Image(
            painter= painterResource(id = image),
            null,
            modifier = Modifier
                .height(380.dp)
                .padding(25.dp)

        )


    }

}

@Composable
fun DescriptionOfArt(modifier:Modifier=Modifier,   @StringRes description: Int, @StringRes date: Int, color:Color)
{
    Column( verticalArrangement = Arrangement.Center,
        modifier = modifier
            .background(color)
            .height(100.dp)
            .width(350.dp)
            .padding(25.dp)
            ){
        Text(text = stringResource(description),
            fontFamily = FontFamily.SansSerif,
            fontSize = 20.sp
        )
        Text(text= stringResource(date),
            fontWeight = FontWeight.SemiBold,
            fontSize = 12.sp)


    }

}
@Composable
fun ButtonDisplay(modifier:Modifier=Modifier, color: Color)
{


        }


@Preview(showBackground = true)
@Composable
fun ImageDisplayPreview()
{
    GalleryTheme {

        AllCombined()
    }

}