//package com.example.vmisu.projet
//
//import android.content.Intent
//import android.net.Uri
//import android.support.v7.app.AppCompatActivity
//import android.os.Bundle
//import android.os.IBinder
//import android.support.design.widget.NavigationView
//import android.support.v4.app.Fragment
//import android.support.v4.view.GravityCompat
//import android.support.v7.app.ActionBarDrawerToggle
//import android.view.Menu
//import android.view.MenuItem
//import android.widget.Toast
//import com.example.vmisu.projet.tool.replace
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.activity_send.*
//import kotlinx.android.synthetic.main.app_bar_main.*
//import kotlinx.android.synthetic.main.content_send.*
//import java.lang.Exception
//
//class Send_new : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_send)
//
//
//        val toggle = ActionBarDrawerToggle(
//            this, drawer_layout_send, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
//        )
//
//
//        drawer_layout_send.addDrawerListener(toggle)
//        toggle.syncState()
//
//        nav_view_send.setNavigationItemSelectedListener(this)
//
//        // btn click to get input and call sendEmail methode
//        sendEmailBtn.setOnClickListener{
//            var recipient = recipientEt.text.toString().trim()
//            var subject = subjectEt.text.toString().trim()
//            var message = messageEt.text.toString()
//
//            //methode call for email intent with these inputs as parameters
//            sendEmail(recipient,subject,message)
//        }
//    }
//
//    private fun sendEmail(recipient: String, subject: String, message: String){
//        //Action_Send action to lunch an email
//        val mIntent = Intent(Intent.ACTION_SEND)
//        mIntent.data = Uri.parse("mailto:")
//        mIntent.type = "text/plain"
//        mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
//        mIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
//        mIntent.putExtra(Intent.EXTRA_TEXT,message)
//
//        try{
//            startActivity(Intent.createChooser(mIntent,"Choose Email Client..."))
//        }catch (e:Exception){
//            Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
//        }
//
//    }
//
//    override fun onBackPressed() {
//        if (drawer_layout_send.isDrawerOpen(GravityCompat.START)) {
//            drawer_layout_send.closeDrawer(GravityCompat.START)
//        } else {
//            super.onBackPressed()
//        }
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.main, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        when (item.itemId) {
//            R.id.action_settings -> return true
//            else -> return super.onOptionsItemSelected(item)
//        }
//    }
//
//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        // Handle navigation view item clicks here.
//        when (item.itemId) {
//            R.id.nav_cours -> {
//                replace(Cours())
//            }
//            R.id.nav_architecture -> {
//                replace(Architecture())
//            }
//            R.id.nav_magicBall -> {
//                replace(MagicBall())
//            }
//            R.id.nav_liste -> {
//                replace(List())
//            }
//            R.id.nav_fragment -> {
//                replace(Fragment())
//            }
//            R.id.nav_send -> {
//                val send = Intent(this, Send_new::class.java)
//                startActivity(send)
//            }
//        }
//
//        drawer_layout_send.closeDrawer(GravityCompat.START)
//        return true
//    }
//}
