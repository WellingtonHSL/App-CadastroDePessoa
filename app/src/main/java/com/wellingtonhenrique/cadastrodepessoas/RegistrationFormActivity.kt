package com.wellingtonhenrique.cadastrodepessoas

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistrationFormActivity : AppCompatActivity() {

    private lateinit var textName: TextView
    private lateinit var textAge: TextView
    private lateinit var textAddress: TextView
    private lateinit var textEmail: TextView
    private lateinit var textPhone: TextView
    private lateinit var btnBack: Button
    private lateinit var btnConfirm: Button

    private val TAG = "lifeCycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_form)
        Log.d(TAG, "onCrate - Registration Data")

        textName = findViewById(R.id.text_name)
        textAge = findViewById(R.id.text_age)
        textAddress = findViewById(R.id.text_address)
        textEmail = findViewById(R.id.text_email)
        textPhone = findViewById(R.id.text_phone)
        btnBack = findViewById(R.id.btn_back)
        btnConfirm = findViewById(R.id.btn_confirm)

        val bundle = intent.extras
        if (bundle != null) {
            val name = bundle.getString("name")
            val age = bundle.getString("age")
            val address = bundle.getString("address")
            val email = bundle.getString("email")
            val phone = bundle.getString("phone")

            textName.text = name
            textAge.text = age
            textAddress.text = address
            textEmail.text = email
            textPhone.text = phone
        }

        btnConfirm.setOnClickListener {
            setResult(RESULT_OK)
            Toast.makeText(this, getString(R.string.toast_success) , Toast.LENGTH_SHORT).show()
            finish()
        }

        btnBack.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }
    }

    override  fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart - Registration Data")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume - Registration Data")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause - Registration Data")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop - Registration Data")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart - Registration Data")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy - Registration Data")
    }
}