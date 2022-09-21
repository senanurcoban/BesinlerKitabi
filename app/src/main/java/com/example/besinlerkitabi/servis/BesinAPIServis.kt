package com.example.besinlerkitabi.servis

import com.example.besinlerkitabi.model.Besin
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class BesinAPIServis {

    // https://www.deneme.com/senacoban/besinler.json ,  bir örnek
    //BASE_URL ->https://www.deneme.com/  , bu kısım base_url örneğidir.

    private val BASE_URL="https://raw.githubusercontent.com/"
    private val api=Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(BesinAPI::class.java)


       fun getData():Single<List<Besin>>{
          return api.getBesin()
       }

// https://raw.githubusercontent.com/atilsamancioglu/BTK20-JSONVeriSeti/master/besinler.json
    // BASE_URL-> https://raw.githubusercontent.com/
}