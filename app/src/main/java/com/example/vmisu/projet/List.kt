package com.example.vmisu.projet

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.fragment_list.view.*
import org.jetbrains.anko.find


class List : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_list, container, false)
        val recyclerView = view!!.find(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(view!!.context, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("Michel", "Lp-dam, Nice"))
        users.add(User("Nicolas", "Lp-dam, Sophia"))
        users.add(User("Matthieu", "Lp-dam, Nice"))
        users.add(User("Random", "Licence-Pro, Sophia"))
        users.add(User("Android", "Licence-Pro, Sophia"))
        users.add(User("Kotlin", "Licence-Pro, Sophia"))

        val adapter = CustomAdapter(users)


        view!!.recyclerView.adapter = adapter


        // Inflate the layout for this fragment
        return view
    }


}