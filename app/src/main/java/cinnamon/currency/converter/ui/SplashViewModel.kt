package cinnamon.currency.converter.ui

import androidx.lifecycle.ViewModel
import cinnamon.currency.converter.repository.CurrencyRepository

class SplashViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    val currencyRepository = CurrencyRepository()

    init {
        currencyRepository.getCurrencyApi()
    }
}
