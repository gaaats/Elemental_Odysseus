package com.miHoYo.Gensh.ffffrrraa

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.miHoYo.Gensh.R
import com.miHoYo.Gensh.ggggaaaam.GaGaGaGaGaActivity2
import com.miHoYo.Gensh.gtjtjijigt.Util.ad_idgtgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.appsgtgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.aps_idgtgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.codeCodegtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.geoCogtgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.instIdgttg
import com.miHoYo.Gensh.gtjtjijigt.Util.keyVAlgtgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.linkaagtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.myIdgtgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.nammgttg
import com.miHoYo.Gensh.gtjtjijigt.Util.onegtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.paaaaaacckckckgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.subFivegtgttg
import com.miHoYo.Gensh.gtjtjijigt.Util.subFourgtgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.subOnegtgtgt
import com.miHoYo.Gensh.gtjtjijigt.Util.subSixgttghy
import com.miHoYo.Gensh.gtjtjijigt.Util.trolologttggt
import com.miHoYo.Gensh.gtjtjijigt.Util.urlMaingttg
import com.miHoYo.Gensh.veeeevvv.ViViviviivivActivity2
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class KiiiiiiigoFragment : Fragment() {
    private lateinit var mContext: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_kiiiiiiigo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gjgtojgt = shareP.getString(geoCogtgtgt, null)
        val appCampgttg = shareP.getString("appCamp", null)
        val mainIdgtgtgt = shareP.getString("mainId", null)
        val packgtgtgt = paaaaaacckckckgtgt
        val buildVersgtgtgt = Build.VERSION.RELEASE
        val myTrIdgtgtgt = shareP.getString(myIdgtgtgt, null)
        val gtgtgt: String? = shareP.getString(instIdgttg, null)
        val deepStgtgt = shareP.getString("deepSt", null)
        val countryDevgttg = shareP.getString(codeCodegtgt, null)
        val appsgtgtgt = shareP.getString(appsgtgtgt, null)
        val wvgtgt = shareP.getString(urlMaingttg, null)


        val gtgthyujjuuj = Intent(activity, ViViviviivivActivity2::class.java)
        val intentGamehyhyhy = Intent(activity, GaGaGaGaGaActivity2::class.java)

        val afIdhyhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(mContext)
        rfhihfrhrfhfrhrfhihrf()

        shareP.edit().putString(aps_idgtgtgt, afIdhyhyhy).apply()

        val linkAppsgttgtg = "$wvgtgt$subOnegtgtgt$appCampgttg&$onegtgt$afIdhyhyhy&$ad_idgtgtgt$mainIdgtgtgt&$subFourgtgtgt$packgtgtgt&$subFivegtgttg$buildVersgtgtgt&$subSixgttghy$nammgttg"
        val linkMTgtgt = "$wvgtgt$onegtgt$myTrIdgtgtgt&$ad_idgtgtgt$gtgtgt&$subFourgtgtgt$packgtgtgt&$subFivegtgttg$buildVersgtgtgt&$subSixgttghy$nammgttg"
        val linkFBgtgt = "$wvgtgt$subOnegtgtgt$deepStgtgt&$onegtgt$afIdhyhyhy&$ad_idgtgtgt$mainIdgtgtgt&$subFourgtgtgt$packgtgtgt&$subFivegtgttg$buildVersgtgtgt&$subSixgttghy$trolologttggt"
        val linkFBNullAppsgthyyhhy = "$wvgtgt$subOnegtgtgt$deepStgtgt&$onegtgt$myTrIdgtgtgt&$ad_idgtgtgt$gtgtgt&$subFourgtgtgt$packgtgtgt&$subFivegtgttg$buildVersgtgtgt&$subSixgttghy$trolologttggt"

        when(appsgtgtgt) {
            "1" ->
                if(appCampgttg!!.contains(keyVAlgtgtgt)) {
                    shareP.edit().putString(linkaagtgt, linkAppsgttgtg).apply()
                    shareP.edit().putString("WebInt", "campaign").apply()
                    startActivity(gtgthyujjuuj)
                    activity?.finish()
                } else if (deepStgtgt!=null||countryDevgttg!!.contains(gjgtojgt.toString())) {
                    shareP.edit().putString(linkaagtgt, linkFBgtgt).apply()
                    shareP.edit().putString("WebInt", "deepLink").apply()
                    startActivity(gtgthyujjuuj)
                    activity?.finish()
                } else {
                    startActivity(intentGamehyhyhy)
                    activity?.finish()
                }
            "0" ->
                if(deepStgtgt!=null) {
                    shareP.edit().putString(linkaagtgt, linkFBNullAppsgthyyhhy).apply()
                    shareP.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(gtgthyujjuuj)
                    activity?.finish()
                } else if (countryDevgttg!!.contains(gjgtojgt.toString())) {
                    shareP.edit().putString(linkaagtgt, linkMTgtgt).apply()
                    shareP.edit().putString("WebInt", "geo").apply()
                    startActivity(gtgthyujjuuj)
                    activity?.finish()
                } else {
                    startActivity(intentGamehyhyhy)
                    activity?.finish()
                }
        }
    }

    private fun rfhihfrhrfhfrhrfhihrf() {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
    }
}
