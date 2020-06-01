package cinnamon.currency.converter.data.network

import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("v2")
    fun getCurrencies(): Single<List<Currencies>>

}