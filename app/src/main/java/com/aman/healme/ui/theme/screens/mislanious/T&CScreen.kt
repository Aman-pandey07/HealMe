package com.aman.healme.ui.theme.screens.mislanious

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TAndCScreen (navController: NavController){
        Scaffold(
            topBar = {
                     TopAppBar(title = {
                         Row(
                         modifier = Modifier.fillMaxWidth(),
                         horizontalArrangement = Arrangement.Center
                     ) {
                         Spacer(modifier = Modifier.weight(1f))
                         Text(text = "Terms & Conditions")
                         Spacer(modifier = Modifier.weight(1f))
                     }
                                       },
                         navigationIcon = {
                             IconButton(onClick = { /* Handle left button click */ }) {
                                 Icon(Icons.Default.ArrowBack, contentDescription = "Menu")
                             }
                         }

                         )
            },
        ){paddingValues->
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp), // Add padding for spacing
                    contentAlignment = Alignment.TopCenter // Align content to the center
                ) {
                    Column {
                        Text(
                            text = "Topic",
                            style = MaterialTheme.typography.titleMedium, // You can adjust the style as needed
                            textAlign = TextAlign.Center // Align text within the box
                        )
                        Text(text = "1) The topic should be related to any real-time event(RTE) happening or has happened across the world.")
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text = "2) The topic can be related to any field eg. politics, business, finance, sports etc. but must be fundamentally important to that respective field.")
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text = "3) The topic should must ask a relevant question related to the RTE as well as mention the RTE itself.")
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text = "4)The question asked must be multi-dimensional and broad enough to include various perspectives.")
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text = "5)Similar questions on the same RTE will be disapproved.")
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text = "6)Character limit for topic is 200 characters.")
                        Spacer(modifier = Modifier.padding(10.dp))
                        Text(
                            text = "Article/Video/Podcast",
                            style = MaterialTheme.typography.titleMedium, // You can adjust the style as needed
                            textAlign = TextAlign.Center
                        )
                        Text(text ="1) Video must support the given opinion at hand." )
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text ="2) Video must be formulated in a way so as to directly answer the question in the topic." )
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text ="3) Abstracts must be coherent and have a flow from Abstract 1 to Abstract 6." )
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text ="4) Video & Podcast must be logical and coherent." )
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text ="5) Repetitive information from Abstract 1 to 6 must be kept minimal." )
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text ="6) Content in Abstracts/Video/Podcast must be strictly non-plagiarized." )
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text ="7) Take care of minimal grammatical errors while formulating abstracts." )
                        Divider(color = Color.Black, thickness = 1.dp, modifier = Modifier.padding(vertical = 8.dp))
                        Text(text ="8) Character limit for an abstract is 400 characters. Time limit for Video/Podcast is 15 mins." )




                    }


                }

            }

        }
}

