package com.miHoYo.Gensh.frgtgtgtgt

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class BeamModel(gtjgtjgtigt: Application): ViewModel() {
    val gtgtjtgjgti = gtjgtjgtigt.packageManager
    fun gtntgkgtkngt(frnrfhui: WebView): WebSettings{
       val rfgtjoj = frnrfhui.settings
        rfgtjoj.javaScriptEnabled = true
        rfgtjoj.useWideViewPort = true
        rfgtjoj.loadWithOverviewMode = true
        rfgtjoj.allowFileAccess = true
        rfgtjoj.domStorageEnabled = true
        rfgtjoj.userAgentString = rfgtjoj.userAgentString.replace("; wv", "")
        rfgtjoj.javaScriptCanOpenWindowsAutomatically = true
        rfgtjoj.setSupportMultipleWindows(false)
        rfgtjoj.displayZoomControls = false
        rfgtjoj.builtInZoomControls = true
        rfgtjoj.allowFileAccess = true
        rfgtjoj.allowContentAccess = true
        rfgtjoj.setSupportZoom(true)
        rfgtjoj.pluginState = WebSettings.PluginState.ON
        rfgtjoj.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        rfgtjoj.cacheMode = WebSettings.LOAD_DEFAULT
        rfgtjoj.allowContentAccess = true
        rfgtjoj.mediaPlaybackRequiresUserGesture = false
        return rfgtjoj
    }
    fun gtijojji(gthgtiuhgtugt: String) {
        OneSignal.setExternalUserId(
            gthgtiuhgtugt,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val ngtngtkntgjn = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $ngtngtkntgjn"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val frjorfrfjrfi =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $frjorfrfjrfi"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val frnkrfhhrfufrh = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $frnkrfhhrfufrh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun efrhjbrfbbfr(frrfhfiuhgttgu: String): Boolean {
        try {
            gtgtjtgjgti.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }
}