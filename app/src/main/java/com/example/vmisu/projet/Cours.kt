package com.example.vmisu.projet

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.text.TextUtils.replace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_cours.*
import com.example.vmisu.projet.tool.replace


class Cours : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        cours_1?.setOnClickListener {
            Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show()
        }

        return inflater.inflate(R.layout.fragment_cours, container, false)


    }


}