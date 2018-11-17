package com.example.vmisu.projet

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MagicBall() : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_magicball, container, false)
    }


}
data class MagicCircle(val maxX: Float, val maxY: Float){
    var cx:Float = 50F
    var cy:Float = 50F
    var rad:Float = 40F
    var delta = 10
    var dx = delta
    var dy = delta



    fun move() {

        if(cx < 0F){
            dx = delta
        }
        if(cx > maxX){
            dx = -delta
        }
        if(cy < 0F){
            dy = delta
        }
        if(cy > maxY){
            dy = -delta
        }

        cx += dx
        cy += dy
    }


}