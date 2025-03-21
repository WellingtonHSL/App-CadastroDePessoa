package com.wellingtonhenrique.cadastrodepessoas

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegistrationFormActivity : AppCompatActivity() {

    private lateinit var textName: TextView
    private lateinit var textEmail: TextView
    private lateinit var textPhone: TextView
    private lateinit var btnBack: Button
    private lateinit var btnConfirm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_form)

        textName = findViewById(R.id.text_name)
        textEmail = findViewById(R.id.text_email)
        textPhone = findViewById(R.id.text_phone)
        btnBack = findViewById(R.id.btn_back)
        btnConfirm = findViewById(R.id.btn_confirm)

        val bundle = intent.extras
        if (bundle != null) {
            val name = bundle.getString("name")
            val email = bundle.getString("email")
            val phone = bundle.getString("phone")

            textName.text = "Nome: $name"
            textEmail.text = "Email: $email"
            textPhone.text = "Telefone: $phone"
        }
    }
}