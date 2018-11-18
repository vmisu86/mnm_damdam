package com.example.vmisu.projet

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_number_picker.*
import kotlinx.android.synthetic.main.fragment_number_picker.view.*

class NumberPicker : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_number_picker, container, false)



        view!!.number_picker.minValue= 0
        view!!.number_picker.maxValue= 10

        view!!.number_picker.wrapSelectorWheel = true

        view!!.number_picker.setOnValueChangedListener { numberPicker,oldValue,newValue  -> text_view.text = "Numéro:  $newValue" }
       // return inflater.inflate(R.layout.fragment_number_picker, container, false)
        return view
    }


}