package com.kamal.textinputlayoutdemo

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {
    private var textInput: TextInputLayout? = null
    private var et2: TextInputEditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textInput = findViewById(R.id.textInput) as TextInputLayout

        val wordtoSpan = SpannableString("Hello world*")
        wordtoSpan.setSpan(
            ForegroundColorSpan(Color.BLUE), 11, 12,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        textInput!!.hint = wordtoSpan

        et2 = findViewById(R.id.et2) as TextInputEditText
        et2!!.hint = wordtoSpan


    }
}
