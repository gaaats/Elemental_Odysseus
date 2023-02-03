package com.miHoYo.Gensh.ffffrrraa

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miHoYo.Gensh.R
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.codeCodegtgt
import com.miHoYo.Gensh.gtjtjijigt.HIUHFhrrfhfrhufr.bngjgthgthtghgt
import com.miHoYo.Gensh.jgthigihgt.HIUfhrfhhfrhrfhrhfurf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SecSecMainFragment : Fragment() {
    private fun gthigthgtih() {
        findNavController().navigate(R.id.action_secSecMainFragment_to_priiiiiFFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sec_sec_main, container, false)
    }

    val gtgtgtgt by activityViewModel<HIUfhrfhhfrhrfhrhfurf>(named("MainModel"))
    lateinit var countryDevgtgtgt: String
    lateinit var wvgtgttggt: String
    lateinit var appsgttggtgt: String
    private lateinit var mContextgtgtgt: Context

    val sharePgtgtgt: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgtgt = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gtgtgtgt.mainId.observe(viewLifecycleOwner) {
            if (it != null) {
                val maingtgtgt = it.toString()
                sharePgtgtgt.edit().putString("mainId", maingtgtgt).apply()
            }
        }

        gtgtgtgt.gtythyhyhy.observe(viewLifecycleOwner) {
            if (it != null) {

                countryDevgtgtgt = it.gtnkgtkgtgt
                appsgttggtgt = it.gtjgtjgtjjgti
                wvgtgttggt = it.gtmgtgtjjtgigtj

                sharePgtgtgt.edit().putString(codeCodegtgt, countryDevgtgtgt).apply()
                sharePgtgtgt.edit().putString(HIUHFhrrfhfrhufr.nhyjiohyiohy5, appsgttggtgt).apply()
                sharePgtgtgt.edit().putString(bngjgthgthtghgt, wvgtgttggt).apply()

                hrfhirfhhrf()
            }
        }
    }

    private fun hrfhirfhhrf() {
        ghtghihtihgt()
    }

    private fun ghtghihtihgt() {
        gthigthgtih()
    }


}