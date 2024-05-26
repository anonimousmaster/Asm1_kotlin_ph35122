package com.example.text_styletext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TTThanhToan : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CheckoutScreen()
        }
    }
}

@Composable
fun CheckoutScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text("Shipping Address", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = "Bruno Fernandes",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth()
            )
        }

        Column {
            Text("Payment", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = "Hello",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth()
            )
        }

        Column {
            Text("Delivery method", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            Spacer(modifier = Modifier.height(8.dp))
            TextField(
                value = "Anh ở đây nhé",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth()
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text("Order:", fontSize = 16.sp)
                Text("Delivery:", fontSize = 16.sp)
                Text("Total:", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            Column(
                horizontalAlignment = Alignment.End
            ) {
                Text("$ 95.00", fontSize = 16.sp)
                Text("$ 5.00", fontSize = 16.sp)
                Text("$ 100.00", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
        }

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text("SUBMIT ORDER")
        }
    }
}