package com.example.nearby.ui.screen.market_details

sealed class MarketDetailsUiEvent {
    data class OnFetchRules(val marketId: String) : MarketDetailsUiEvent()
    data class OnFetchCoupon(val _qrCodeContent: String) : MarketDetailsUiEvent()
    data object OnResetCoupon : MarketDetailsUiEvent()
}