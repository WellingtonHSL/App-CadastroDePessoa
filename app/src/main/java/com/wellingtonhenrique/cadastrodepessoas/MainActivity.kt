package com.wellingtonhenrique.cadastrodepessoas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editName: EditText
    private lateinit var editEmail: EditText
    private lateinit var editPhone: EditText
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.edit_name)
        editEmail = findViewById(R.id.edit_email)
        editPhone = findViewById(R.id.edit_phone)
        btnRegister = findViewById(R.id.btn_register)

        btnRegister.setOnClickListener {

            val intent = Intent(this, RegistrationFormActivity::class.java)
            val name = editName.text.toString()
            val email = editEmail.text.toString()
            val phone = editPhone.text.toString()

            if ( name.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty()) {
                intent.putExtra("name", name.toString())
                intent.putExtra("email", email.toString())
                intent.putExtra("phone", phone.toString())

                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}