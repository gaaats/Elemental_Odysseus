package com.miHoYo.Gensh.uuutttiils

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.miHoYo.Gensh.aapapapppipipi.ApiInterfaceggtgtgt
import com.miHoYo.Gensh.aapapapppipipi.JOIFJirjrfjjrfjirf
import com.miHoYo.Gensh.aapapapppipipi.IUHFhrhhrfuhhrf
import com.miHoYo.Gensh.aapapapppipipi.HostInterfacegtgtgtgt
import com.miHoYo.Gensh.frgtgtgtgt.Gygfrgygrfrfrf
import com.miHoYo.Gensh.jgthigihgt.HIUfhrfhhfrhrfhrhfurf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


val viewModelModulegtgtgtgt = module {
    viewModel (named("MainModel")){
        HIUfhrfhhfrhrfhrhfurf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Gygfrgygrfrfrf(get())
    }
}

val appModulegtgtgtgt = module {

    single  <HostInterfacegtgtgtgt> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HostInterfacegtgtgtgt::class.java)
    }

    single <ApiInterfaceggtgtgt> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(ApiInterfaceggtgtgt::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://elementalodysseus.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        JOIFJirjrfjjrfjirf(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        IUHFhrhhrfuhhrf(get(named("HostInter")))
    }
    single{
        provideGsongtgtgtgt()
    }
    single (named("SharedPreferences")) {
        provideSharedPrefgtgtgtgt(androidApplication())
    }
}

fun provideSharedPrefgtgtgtgt(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun provideGsongtgtgtgt(): Gson {
    return GsonBuilder().create()
}

