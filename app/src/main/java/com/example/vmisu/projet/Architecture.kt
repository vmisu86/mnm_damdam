package com.example.vmisu.projet

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info

class Architecture : Fragment(), AnkoLogger {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_architecture, container, false)
        info("ON CREATE")
    }

    override fun onStart() {
        super.onStart()
        info("ON START")
    }

    override fun onResume() {
        super.onResume()
        info("ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        info("ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        info("ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        info("ON DESTROY")
    }
}