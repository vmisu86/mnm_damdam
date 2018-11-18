package com.example.vmisu.projet

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.find
import org.jetbrains.anko.info


class Architecture : Fragment(), AnkoLogger,  View.OnClickListener{
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.fab -> {
                //Toast.makeText(getActivity(), "Clicked on cours 5!", Toast.LENGTH_SHORT).show()

                // Create new fragment and transaction
                val newFragment = Cours()
                val transaction = fragmentManager!!.beginTransaction()

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack if needed
                transaction.replace(R.id.content, newFragment)
                transaction.addToBackStack(null)

                // Commit the transaction
                transaction.commit()
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_architecture, container, false)

        val fab_btn: FloatingActionButton = view.find(R.id.fab)

        fab_btn.setOnClickListener (this)

        return view

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