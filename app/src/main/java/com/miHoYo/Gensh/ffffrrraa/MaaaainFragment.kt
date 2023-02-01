package com.miHoYo.Gensh.ffffrrraa

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.miHoYo.Gensh.R
import com.miHoYo.Gensh.jgthigihgt.ViMod
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class MaaaainFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maaaain, container, false)
    }

    private lateinit var hyhyhyhy: Context


    val hyhyhyhyhy by activityViewModel<ViMod>(named("MainModel"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyhyhyhy=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hyhyhyhyhy.gttghyhyhy(hyhyhyhy)

        rhhfrhfrhrfgyfrygfrg()

    }

    private fun rhhfrhfrhrfgyfrygfrg() {
        ghgthigtitihgt()
    }

    private fun ghgthigtitihgt() {
        hgtihgthigthgt()
    }

    private fun hgtihgthigthgt() {
        findNavController().navigate(R.id.action_maaaainFragment_to_conCOnCOnFragment)
    }
}