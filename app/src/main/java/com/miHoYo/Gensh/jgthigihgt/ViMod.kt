package com.miHoYo.Gensh.jgthigihgt

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AFInAppEventParameterName
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.miHoYo.Gensh.aapapapppipipi.CountryCodeJSgttggt
import com.miHoYo.Gensh.aapapapppipipi.CountryRepogtgtgt
import com.miHoYo.Gensh.aapapapppipipi.DevRepogttggt
import com.miHoYo.Gensh.aapapapppipipi.GeoDevgtgtgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.aaaaappspspspgtgt
import io.branch.referral.util.BRANCH_STANDARD_EVENT
import io.branch.referral.util.BranchEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ViMod(


    private val mainRepositorygtgtgthyh: CountryRepogtgtgt,
    private val gtgtgthyhy: DevRepogttggt,
    private val gtgtgtgt: SharedPreferences,
    val applicationgttghyhy: Application
) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            gthuigthgt()
        }
        viewModelScope.launch(Dispatchers.Main) {
            hgithgtuhgt()
        }
    }

    private val gthgtiugt = MutableLiveData<CountryCodeJSgttggt>()
    val countryCodegtgtgt: LiveData<CountryCodeJSgttggt>
        get() = gthgtiugt

    private val tgggtgt = MutableLiveData<GeoDevgtgtgtgt>()
    val gtythyhyhy: LiveData<GeoDevgtgtgtgt>
        get() = tgggtgt

    private val gtjtgjoigtjgt = MutableLiveData<String>()
    val appsData: LiveData<String>
        get() = gtjtgjoigtjgt

    private val _mainIdgttggthy = MutableLiveData<String?>()
    val mainId: LiveData<String?>
        get() = _mainIdgttggthy


    suspend fun hgithgtuhgt() {
        gthgtiugt.postValue(mainRepositorygtgtgthyh.getDat().body())
        gttgtgtgt()
    }

    suspend fun gttgtgtgt() {
        tgggtgt.postValue(gtgtgthyhy.getDataDev().body())
    }

    fun gtthyhyhy(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(aaaaappspspspgtgt, conversionDataListenergttghyhy, applicationgttghyhy)
        AppsFlyerLib.getInstance().start(cont)
    }

    fun gttghyhyhy(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val deepData = data.targetUri?.host.toString()
                gtgtgtgt.edit().putString("deepSt", deepData).apply()
            }
        }
    }

    private val conversionDataListenergttghyhy = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            gtjtgjoigtjgt.postValue(dataGotten)

            when (data?.get(AFInAppEventParameterName.AF_CHANNEL).toString()) {
                "ACI_Search" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.ACHIEVE_LEVEL).setDescription("ACI_Search")
                        .logEvent(applicationgttghyhy.applicationContext)

                }
                "ACI_Youtube" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.SHARE).setDescription("ACI_Youtube")
                        .logEvent(applicationgttghyhy.applicationContext)


                }
                "ACI_Display" -> {
                    BranchEvent(BRANCH_STANDARD_EVENT.RATE).setDescription("ACI_Display")
                        .logEvent(applicationgttghyhy.applicationContext)

                }

                else -> {


                    BranchEvent(BRANCH_STANDARD_EVENT.VIEW_AD).setDescription("NoChannel")
                        .logEvent(applicationgttghyhy.applicationContext)
                    Log.d("Branch Check", "I'm here, branch bitch! No source though")
                }

            }

        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun gthuigthgt() {
        val advertisingIdClient = AdvertisingIdClient(applicationgttghyhy)
        advertisingIdClient.start()
        val idUserAdvertising = advertisingIdClient.info.id.toString()
        _mainIdgttggthy.postValue(idUserAdvertising)
    }

}