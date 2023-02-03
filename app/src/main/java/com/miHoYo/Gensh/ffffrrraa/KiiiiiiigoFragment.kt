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
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.vfbhbfryurfgrfrf
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.nhyjiohyiohy5
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.gtntgngtnjgtnj
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.codeCodegtgt
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.gtgthtghgthugt
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.instIdgttg
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.rjgtjogtjjgtjtgjjgt
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.gtitghugt
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.bgngtjgtjgtjigt
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.nammgttg
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.onegtgt
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.bnyojijhyjjhyhy
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.vbfbfrrfhrfhfrhfrfr
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.gthgthugtuugthugt
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.vbfbbrfgfrggrffr
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.subSixgttghy
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.trolologttggt
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.bngjgthgthtghgt
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
        val gjgtojgt = shareP.getString(gtgthtghgthugt, null)
        val gthgtigthgthgt = bnyojijhyjjhyhy
        val gtojigtjtgjgtjigtj = Build.VERSION.RELEASE
        val cdvdetfedfedffedfed = shareP.getString(bgngtjgtjgtjigt, null)
        val gthutguhugthgtgtgt = shareP.getString("appCamp", null)
        val bngngughgthugt = shareP.getString("mainId", null)
        val gtgtgt: String? = shareP.getString(instIdgttg, null)
        val bgnbnbgnbguhbghg = shareP.getString("deepSt", null)
        val hjoihhfrfrgfrrg = shareP.getString(codeCodegtgt, null)
        val hihfhgtgthgt = shareP.getString(nhyjiohyiohy5, null)
        val vbffrygfrrfgrfg = shareP.getString(bngjgthgthtghgt, null)


        val fhrirfurfuhrf = Intent(activity, ViViviviivivActivity2::class.java)
        val vfbfryrfgfrgfgrgfrrfrf = Intent(activity, GaGaGaGaGaActivity2::class.java)

        val afIdhyhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(mContext)
        rfhihfrhrfhfrhrfhihrf()

        shareP.edit().putString(gtntgngtnjgtnj, afIdhyhyhy).apply()

        val gngnufhhth = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$gthutguhugthgtgtgt&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$subSixgttghy$nammgttg"
        val cdvedtdeffdeed = "$vbffrygfrrfgrfg$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$gtgtgt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$subSixgttghy$nammgttg"
        val vbyrfgrfrfg = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$bgnbnbgnbguhbghg&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$subSixgttghy$trolologttggt"
        val bmgjhyjhyjojihy = "$vbffrygfrrfgrfg$vbfbbrfgfrggrffr$bgnbnbgnbguhbghg&$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$gtgtgt&$gthgthugtuugthugt$gthgtigthgthgt&$vbfbfrrfhrfhfrhfrfr$gtojigtjtgjgtjigtj&$subSixgttghy$trolologttggt"

        when(hihfhgtgthgt) {
            "1" ->
                if(gthutguhugthgtgtgt!!.contains(rjgtjogtjjgtjtgjjgt)) {
                    shareP.edit().putString(gtitghugt, gngnufhhth).apply()
                    shareP.edit().putString("WebInt", "campaign").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else if (bgnbnbgnbguhbghg!=null||hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    shareP.edit().putString(gtitghugt, vbyrfgrfrfg).apply()
                    shareP.edit().putString("WebInt", "deepLink").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    activity?.finish()
                }
            "0" ->
                if(bgnbnbgnbguhbghg!=null) {
                    shareP.edit().putString(gtitghugt, bmgjhyjhyjojihy).apply()
                    shareP.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else if (hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    shareP.edit().putString(gtitghugt, cdvedtdeffdeed).apply()
                    shareP.edit().putString("WebInt", "geo").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    activity?.finish()
                }
        }
    }

    private fun rfhihfrhrfhfrhrfhihrf() {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
    }
}
