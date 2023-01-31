package com.miHoYo.Gensh.aapapapppipipi

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

@Keep
data class GeoDevgtgtgtgt(
    @SerializedName("geo")
    val gtnkgtkgtgt: String,
    @SerializedName("view")
    val gtmgtgtjjtgigtj: String,
    @SerializedName("appsChecker")
    val gtjgtjgtjjgti: String,
)

interface ApiInterfaceggtgtgt {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun gttggjtjgt(): Response<CountryCodeJSgttggt>
}

interface HostInterfacegtgtgtgt {
    @GET("typo.json")
    suspend fun hhyhyhyhyhyhy(): Response<GeoDevgtgtgtgt>
}

class CountryRepogtgtgt(private val gtgtigtihgt: ApiInterfaceggtgtgt) {
    suspend fun getDat() = gtgtigtihgt.gttggjtjgt()
}
class DevRepogttggt(private val ggtgthigtihgt: HostInterfacegtgtgtgt) {
    suspend fun getDataDev() = ggtgthigtihgt.hhyhyhyhyhyhy()
}

@Keep
data class CountryCodeJSgttggt(
    @SerializedName("countryCode")
    val gtgtigthgtihgt: String,
)


