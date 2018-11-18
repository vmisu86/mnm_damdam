package com.example.vmisu.projet

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_send.*
import java.lang.Exception

class Send : AppCompatActivity(){

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send)

        supportActionBar!!.title = "Back"
        supportActionBar!!.setDefaultDisplayHomeAsUpEnabled(true)

        // btn click to get input and call sendEmail methode
        sendEmailBtn.setOnClickListener{
            var recipient = recipientEt.text.toString().trim()
            var subject = subjectEt.text.toString().trim()
            var message = messageEt.text.toString()

            //methode call for email intent with these inputs as parameters
            sendEmail(recipient,subject,message)

        }
    }

    private fun sendEmail(recipient: String, subject: String, message: String){
        //Action_Send action to lunch an email
        val mIntent = Intent(Intent.ACTION_SEND)
        mIntent.data = Uri.parse("mailto:")
        mIntent.type = "text/plain"
        mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(recipient))
        mIntent.putExtra(Intent.EXTRA_SUBJECT, subject)
        mIntent.putExtra(Intent.EXTRA_TEXT,message)

        try{
            startActivity(Intent.createChooser(mIntent,"Choose Email Client..."))
        }catch (e:Exception){
            Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
        }

    }

}
