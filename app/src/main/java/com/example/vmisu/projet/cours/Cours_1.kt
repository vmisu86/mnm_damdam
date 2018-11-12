package com.example.vmisu.projet.cours


import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.vmisu.projet.Cours

import com.example.vmisu.projet.R
import org.jetbrains.anko.find


/**
 * A simple [Fragment] subclass.
 * Use the [Cours_1.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class Cours_1 : Fragment(),   View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_cours_1, container, false)

        val view: View = inflater!!.inflate(R.layout.fragment_cours_1, container, false)

        val fab_btn: FloatingActionButton = view.find(R.id.fab)

        fab_btn.setOnClickListener (this)

        return view
    }

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

}
