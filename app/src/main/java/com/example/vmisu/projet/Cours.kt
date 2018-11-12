package com.example.vmisu.projet

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.vmisu.projet.cours.*
import org.jetbrains.anko.find


class Cours : Fragment(),  View.OnClickListener {


        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            // Inflate the layout for this fragment



            val view: View = inflater!!.inflate(R.layout.fragment_cours, container, false)
            //find CardView by Id
            val cours_1: CardView = view.find(R.id.cours_1)
            val cours_2: CardView = view.find(R.id.cours_2)
            val cours_3: CardView = view.find(R.id.cours_3)
            val cours_4: CardView = view.find(R.id.cours_4)
            val cours_5: CardView = view.find(R.id.cours_5)
            val cours_6: CardView = view.find(R.id.cours_6)

            //setClickListener
            cours_1.setOnClickListener(this)
            cours_2.setOnClickListener(this)
            cours_3.setOnClickListener(this)
            cours_4.setOnClickListener(this)
            cours_5.setOnClickListener(this)
            cours_6.setOnClickListener(this)

            // Return the fragment view/layout
            return view


        }


    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cours_1 -> {
                // Create new fragment and transaction
                val newFragment = Cours_1()
                val transaction = fragmentManager!!.beginTransaction()

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack if needed
                transaction.replace(R.id.content, newFragment)
                transaction.addToBackStack(null)

                // Commit the transaction
                transaction.commit()
            }
            R.id.cours_2 -> {
                // Create new fragment and transaction
                val newFragment = Cours_2()
                val transaction = fragmentManager!!.beginTransaction()

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack if needed
                transaction.replace(R.id.content, newFragment)
                transaction.addToBackStack(null)

                // Commit the transaction
                transaction.commit()
            }
            R.id.cours_3 -> {
                // Create new fragment and transaction
                val newFragment = Cours_3()
                val transaction = fragmentManager!!.beginTransaction()

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack if needed
                transaction.replace(R.id.content, newFragment)
                transaction.addToBackStack(null)

                // Commit the transaction
                transaction.commit()
            }
            R.id.cours_4 -> {
                // Create new fragment and transaction
                val newFragment = Cours_4()
                val transaction = fragmentManager!!.beginTransaction()

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack if needed
                transaction.replace(R.id.content, newFragment)
                transaction.addToBackStack(null)

                // Commit the transaction
                transaction.commit()
            }
            R.id.cours_5 -> {
                // Create new fragment and transaction
                val newFragment = Cours_5()
                val transaction = fragmentManager!!.beginTransaction()

                // Replace whatever is in the fragment_container view with this fragment,
                // and add the transaction to the back stack if needed
                transaction.replace(R.id.content, newFragment)
                transaction.addToBackStack(null)

                // Commit the transaction
                transaction.commit()
            }
            R.id.cours_6 -> {
                // Create new fragment and transaction
                val newFragment = Cours_6()
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
