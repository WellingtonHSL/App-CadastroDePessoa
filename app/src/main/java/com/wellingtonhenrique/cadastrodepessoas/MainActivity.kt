package com.wellingtonhenrique.cadastrodepessoas

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var editName: EditText
    private lateinit var editAge: EditText
    private lateinit var editAddress: EditText
    private lateinit var editEmail: EditText
    private lateinit var editPhone: EditText
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.tool_bar)
        setSupportActionBar(toolbar)

        editName = findViewById(R.id.edit_name)
        editAge = findViewById(R.id.edit_age)
        editAddress = findViewById(R.id.edit_address)
        editEmail = findViewById(R.id.edit_email)
        editPhone = findViewById(R.id.edit_phone)
        btnRegister = findViewById(R.id.btn_register)

        btnRegister.setOnClickListener {

            val intent = Intent(this, RegistrationFormActivity::class.java)
            val name = editName.text.toString()
            val age = editAge.text.toString()
            val address = editAddress.text.toString()
            val email = editEmail.text.toString()
            val phone = editPhone.text.toString()

            if ( name.isNotEmpty() && email.isNotEmpty() && phone.isNotEmpty()) {
                intent.putExtra("name", name.toString())
                intent.putExtra("age", age.toString())
                intent.putExtra("address", address.toString())
                intent.putExtra("email", email.toString())
                intent.putExtra("phone", phone.toString())

                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Inflando o menu na ActionBar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // Lidando com o clique no ícone de perfil
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_profile -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}