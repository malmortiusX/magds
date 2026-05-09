package com.example.myapp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyApp() {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .padding(all = 15.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.background(Color.Blue)
        ) {
            Text(
                text = "Inicio",
                fontSize = 58.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 15.dp)
                    .background(Color.Red)
                    .padding(all = 15.dp)
                    .weight(weight = 1f)
            )

            Text(
                text = "Perfil",
                fontSize = 58.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 15.dp)
                    .background(Color.Red)
                    .padding(all = 15.dp)
                    .weight(weight = 1f)
            )
        }
        Spacer(modifier = Modifier.height(height = 16.dp))

        Image(
            painter = painterResource(id = R.drawable.italcol),
            contentDescription = "Mi imagen",
            modifier = Modifier.width(width = 300.dp)

        )

    }

}

@Preview(showSystemUi = true)
@Composable
fun MiPantallaDos() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
        ) {
            Image(
                painter = painterResource(id = R.drawable.checkimage),
                contentDescription = "Mi imagen",
                modifier = Modifier.width(width = 300.dp)

            )
        }
        Row() {
            Text(
                text = "All task completed",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row() {
            Text(
                text = "Nice Work!",
                fontSize = 16.sp,
                color = Color.Gray
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MiPantallaTres() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .weight(1f)
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(10.dp)
                    .weight(1f)
            ) {
                Text(text = "Text composable")
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sapien magna, tincidunt vitae augue venenatis, semper consequat magna. In hac habitasse platea dictumst. Vestibulum eleifend sit amet odio ut blandit. Curabitur posuere lacus mi, eget molestie ex rhoncus vitae. Duis egestas maximus rhoncus. In ullamcorper elementum odio sed convallis. Sed pharetra, leo ac interdum tincidunt, tellus risus fringilla diam, in vulputate nunc orci semper orci. Quisque varius accumsan metus sed imperdiet.\n" +
                            "\n"
                )
            }
            Column(
                Modifier
                    .background(color = Color.Yellow)
                    .padding(10.dp)
                    .weight(1f)
            ) {

                Text(text = "Text composable")
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sapien magna, tincidunt vitae augue venenatis, semper consequat magna. In hac habitasse platea dictumst. Vestibulum eleifend sit amet odio ut blandit. Curabitur posuere lacus mi, eget molestie ex rhoncus vitae. Duis egestas maximus rhoncus. In ullamcorper elementum odio sed convallis. Sed pharetra, leo ac interdum tincidunt, tellus risus fringilla diam, in vulputate nunc orci semper orci. Quisque varius accumsan metus sed imperdiet.\n" +
                            "\n"
                )
            }
        }
        Row(
            modifier = Modifier
                .padding(16.dp)
                .weight(1f)
        ) {
            Column(
                Modifier
                    .background(color = Color.Yellow)
                    .padding(10.dp)
                    .weight(1f)
            ) {

                Text(text = "Text composable")
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sapien magna, tincidunt vitae augue venenatis, semper consequat magna. In hac habitasse platea dictumst. Vestibulum eleifend sit amet odio ut blandit. Curabitur posuere lacus mi, eget molestie ex rhoncus vitae. Duis egestas maximus rhoncus. In ullamcorper elementum odio sed convallis. Sed pharetra, leo ac interdum tincidunt, tellus risus fringilla diam, in vulputate nunc orci semper orci. Quisque varius accumsan metus sed imperdiet.\n" +
                            "\n"
                )
            }
            Column(
                modifier = Modifier
                    .background(color = Color.Magenta)
                    .padding(10.dp)
                    .weight(1f)
            ) {

                Text(text = "Text composable")
                Text(
                    text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse sapien magna, tincidunt vitae augue venenatis, semper consequat magna. In hac habitasse platea dictumst. Vestibulum eleifend sit amet odio ut blandit. Curabitur posuere lacus mi, eget molestie ex rhoncus vitae. Duis egestas maximus rhoncus. In ullamcorper elementum odio sed convallis. Sed pharetra, leo ac interdum tincidunt, tellus risus fringilla diam, in vulputate nunc orci semper orci. Quisque varius accumsan metus sed imperdiet.\n" +
                            "\n"
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun MiPantallaCuatro() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {Text("Top App Bar")},
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer),
                navigationIcon = {
                    Icon(imageVector = Icons.Default.Add, contentDescription = null)
                }
            )

        },
        bottomBar = {
            NavigationBar() {
                NavigationBarItem(
                    selected = false,
                    onClick = {},
                    icon = {Icon(imageVector = Icons.Default.Home, contentDescription = "Home")},
                    label = { Text(text = "Home") }
                )


            }
        }
    ) {
        innerPadding ->
        Column(modifier = Modifier.padding(paddingValues = innerPadding)) {

        }
    }
}