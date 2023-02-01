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
import com.miHoYo.Gensh.gtjtjijigt.Util.geoCogtgtgt
import com.miHoYo.Gensh.jgthigihgt.ViMod
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class ConCOnCOnFragment : Fragment() {

    private fun gthigthihhigthigt() {
        frrfhfrhihfhrfh()
    }

    private fun frrfhfrhihfhrfh() {
        findNavController().navigate(R.id.action_conCOnCOnFragment_to_secSecMainFragment)
    }

    private lateinit var gtjgtigtjgtj: Context


    val gtjgtjogtjgti: SharedPreferences by inject(named("SharedPreferences"))
    val gtjiogtjgtjijgt by activityViewModel<ViMod>(named("MainModel"))

    lateinit var country: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_con_c_on_c_on, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtjgtigtjgtj = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        higthigtihgthgthgthgt()
    }

    private fun higthigtihgthgthgthgt() {
        gtjiogtjgtjijgt.countryCodegtgtgt.observe(viewLifecycleOwner) {
            if (it != null) {
                country = it.gtgtigthgtihgt
                gtjgtjogtjgti.edit().putString(geoCogtgtgt, country).apply()
                gthigthihhigthigt()
            }
        }
    }


}