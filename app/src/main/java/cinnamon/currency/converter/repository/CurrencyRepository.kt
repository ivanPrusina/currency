package cinnamon.currency.converter.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import cinnamon.currency.converter.data.network.ApiServiceFactory
import cinnamon.currency.converter.data.network.Currencies
import io.reactivex.Single

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers


class CurrencyRepository {

//    private val _currencies = MutableLiveData<List<Currencies>>()
//    val currencies: LiveData<List<Currencies>>
//        get() = _currencies


    fun getCurrencyApi() {
        val observableCharacter by lazy {
            ApiServiceFactory.CurrencyService().getCurrencies()
        }
        observableCharacter
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess = { response -> Log.d("response",response.toString()) },
                onError = { Log.d("response","not working")}
            )
    }

}