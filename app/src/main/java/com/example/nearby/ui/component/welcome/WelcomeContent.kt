package com.example.nearby.ui.component.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nearby.R
import com.example.nearby.ui.theme.Typography

@Composable
fun WelcomeContent(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(text = "Veja como funciona", style = Typography.bodyLarge)
        WelcomeHowItWorkTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Encontre estabecimentos",
            subtitle = "Veja estabelecimentos perto de você que são parceiros do Nearby",
            iconRes = R.drawable.ic_map_pin
        )
        WelcomeHowItWorkTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Ative o cupom com QR Code",
            subtitle = "Escanei p codigo no estabelecimento para usar o beneficio",
            iconRes = R.drawable.ic_qrcode
        )
        WelcomeHowItWorkTip(
            modifier = Modifier.fillMaxWidth(),
            title = "Garanta vantagens perto de você",
            subtitle = "Ative cupons onde estiver, em diferentes tipos de estabelecimentos",
            iconRes = R.drawable.ic_ticket
        )
    }
}