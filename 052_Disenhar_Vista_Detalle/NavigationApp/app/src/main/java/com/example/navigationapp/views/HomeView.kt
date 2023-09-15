package com.example.navigationapp.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.navigationapp.components.ActionButton
import com.example.navigationapp.components.MainButton
import com.example.navigationapp.components.Space
import com.example.navigationapp.components.TitleBar
import com.example.navigationapp.components.TitleView

//==========DISEÑAR VISTA DETALLE==========

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView() {
    Scaffold(
        //Creando nuestro topBar
        topBar = {

            //Alineando el título de nuestro topBar al centro
            CenterAlignedTopAppBar(
                //Llamando a los atributos de TitleBar y asignándoselos a title
                title = { TitleBar(name = "Home View") }, //le pasamos el texto que aparecerá en pantalla

                //Añadiendo Color al fondo
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(

                    //Elegiendo el color de fondo
                    containerColor = Color.Red

                    //Ir a BarComponents.kt para crear nuestros componentes
                )
            )
        },

        //aquí continúa para poder implementar el Floating topBar
        floatingActionButton = {
            //Ir a BarComponents.kt a crear nuestro componente

            //Llamando a los atributos de ActionButton
            ActionButton()

        }//fin floatingActionButton

    ) {
        ContentHomeView()
    }//Fin Scaffold
}

@Composable
fun ContentHomeView() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        //Ir a BodyComponents.kt a crear nuestro componente

        //Aquí reemplazamos o escribimos nuestro TitleView & run
        TitleView(name = "Home View")
        Space()

        //Ir a BodyComponents.kt a crear otro componente

        //Implementando nuestro botón genérico & run
        MainButton(name = "Detail view", backColor = Color.Red , color = Color.White) {
            println("Soy botón generico")
        }
    }
}