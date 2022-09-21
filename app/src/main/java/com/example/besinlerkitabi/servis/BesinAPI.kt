package com.example.besinlerkitabi.servis

import com.example.besinlerkitabi.model.Besin
import io.reactivex.Single
import retrofit2.http.GET

interface BesinAPI {
    // https://www.deneme.com/senacoban/besinler.json ,  bir örnek
    //BASE_URL ->https://www.deneme.com/  , bu kısım base_url örneğidir.

    @GET("atilsamancioglu/BTK20-JSONVeriSeti/master/besinler.json")   // hangi API sunucudan veri çekilecek bizden onu istiyor.
    fun getBesin():Single<List<Besin>>
}


    // https://raw.githubusercontent.com/atilsamancioglu/BTK20-JSONVeriSeti/master/besinler.json
    // BASE_URL-> https://raw.githubusercontent.com/
    // "atilsamancioglu/BTK20-JSONVeriSeti/master/besinler.json" get içinde bu
