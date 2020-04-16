package com.gidon.mac.blocnote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addText(button:View){
        Log.i("Nicolas", "Test log info")
        val editTextValue = editText.text
        fullTextview.text = fullTextview.text.toString() + "\n$editTextValue"
        editText.text = null
    }
}
