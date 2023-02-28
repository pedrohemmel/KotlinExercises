package com.example.exercicioskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class DialogNameAndLastName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_name_and_last_name)

        val txtName: EditText = findViewById(R.id.txtName)
        val txtLastName: EditText = findViewById(R.id.txtLastName)
        val btnShowNameAndLastName: Button = findViewById(R.id.btnShowNameAndLastName)

        btnShowNameAndLastName.setOnClickListener {
            showDialogWithNameAndLastName("Your entire name is...", "${txtName.text.toString()} ${txtLastName.text.toString()}")
        }
    }
    //Functions here
    fun showDialogWithNameAndLastName(title: String, msg: String) {
        AlertDialog.Builder(this)
            .setTitle("${title}")
            .setMessage("${msg}")
            .setPositiveButton("Okay", null)
            .create()
            .show()
    }
}