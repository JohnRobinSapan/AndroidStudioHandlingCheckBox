package com.example.handlingcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var toast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBoxTerms.setOnCheckedChangeListener { compoundButton, b ->

            if (checkBoxTerms.isChecked) {
               showToast("Agree")
            } else {
                showToast("Disagree")
            }
        }
    }

    private fun showToast(text: String) {
        if (toast != null) {
            toast?.cancel()
        }
        toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        toast?.setGravity(Gravity.TOP, 0, 200)
        toast?.show()
    }
}
