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
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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

//@Preview(showBackground = true, showSystemUi = true)
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

//@Preview(showSystemUi = true)
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

//@Preview(showSystemUi = true)
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
//@Preview
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

@Preview(showBackground = true)
@Composable
fun MiPantallaCinco() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.weight(1f).padding(all = 5.dp)
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color.Blue)
                    .padding(10.dp)
            ) {
                Text(text = "Encabezado")
            }
        }
        Row(
            modifier = Modifier.weight(1f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
                    .padding(10.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .background(color = Color.Green)
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(
                        modifier = Modifier.background(color = Color.Yellow)
                            .padding(all = 10.dp)
                    ) {
                        Text(text = "Item 1")
                    }
                    Column(
                        modifier = Modifier.background(color = Color(0xFFFFA500))
                            .padding(all = 10.dp)
                    ) {
                        Text(text = "Item 2")
                    }
                    Column(
                        modifier = Modifier.background(color = Color.Magenta)
                            .padding(all = 10.dp)
                    ) {
                        Text(text = "Item 3")
                    }
                }
            }
        }
        Row(
            modifier = Modifier.weight(1f).padding(all = 5.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Column(
                modifier = Modifier
                    .background(color = Color.Red)
                    .padding(10.dp)
            ) {
                Text(text = "Pie de página")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MiPantallaSeis() {
    Column(
        modifier = Modifier.fillMaxSize().padding(all = 10.dp)
    ) {
        Row(
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.height(200.dp)
                    .padding(horizontal = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.italcol),
                    contentDescription = "Juan Pérez",
                    modifier = Modifier.width(width = 150.dp).clip(RoundedCornerShape(50.dp))
                )
                Text(text = "Juan Pérez", fontWeight = FontWeight.Bold, fontSize = 30.sp)
                Text(text = "Desarrollador Android apasionado por la tecnología y el diseño", textAlign = TextAlign.Center, fontSize = 15.sp)
            }
        }
        Row(
            modifier = Modifier.padding(vertical = 10.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row() {
                    Text(text = "150", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Row() {
                    Text(text = "Post", fontWeight = FontWeight.Light)
                }
            }
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row() {
                    Text(text = "2.3K", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Row() {
                    Text(text = "Seguidores", fontWeight = FontWeight.Light)
                }
            }
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row() {
                    Text(text = "980", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                }
                Row() {
                    Text(text = "Likes", fontWeight = FontWeight.Light)
                }
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(top = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                Button({}, modifier = Modifier.width(170.dp)) {
                    Text("Seguir")
                }
            }
            Column() {
                OutlinedButton({}, modifier = Modifier.width(170.dp)) {
                    Text("Mensaje")
                } }
        }
        Row(
        ) {
            Column(
            ) {
                Text(text = "Intereses", fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(top = 30.dp, bottom = 10.dp) )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        FilledTonalButton(onClick = {}) {
                            Text("Ciclismo")
                        }
                    }
                    Column() {
                        FilledTonalButton(onClick = {}) {
                            Text("Programación")
                        }
                    }
                    Column() {
                        FilledTonalButton(onClick = {}) {
                            Text("UI/UX")
                        }
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column() {
                        FilledTonalButton(onClick = {}) {
                            Text("Música")
                        }
                    }
                    Column() {
                        FilledTonalButton(onClick = {}) {
                            Text("Viajes")
                        }
                    }
                    Column() {
                        FilledTonalButton(onClick = {}) {
                            Text("Gaming")
                        }
                    }
                }
            }
        }
        Row() {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(text = "Proyectos Recientes", fontWeight = FontWeight.Bold, fontSize = 20.sp, modifier = Modifier.padding(top = 30.dp, bottom = 10.dp) )

                Row(
                    modifier = Modifier.background(color = Color.Gray)
                ) {
                    Column() {
                        Image(
                            painter = painterResource(id = R.drawable.italcol),
                            contentDescription = "Juan Pérez",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(150.dp)
                                .aspectRatio(1f)
                        )
                    }
                    Column(
                        modifier = Modifier.height(150.dp)
                            .padding(all = 10.dp),
                        verticalArrangement = Arrangement.SpaceAround
                    ) {
                        Row() {
                            Text(text = "App de Ciclismo", fontWeight = FontWeight.Bold, fontSize = 15.sp)
                        }
                        Row() {
                            Text(text = "Aplicación para rastrear rutas de ciclismo con mapas y estadísticas.")
                        }
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Column(
                                horizontalAlignment = Alignment.End,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Button({}) {
                                    Text("Ver más")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}