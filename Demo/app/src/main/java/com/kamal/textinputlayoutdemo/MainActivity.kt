package com.kamal.textinputlayoutdemo

import android.graphics.Color
import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
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

        val wordtoSpan = SpannableString(Html.fromHtml("H<sup>*</sup>"))
        wordtoSpan.setSpan(
            ForegroundColorSpan(Color.RED), 1, 2,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        textInput!!.hint = ""

        et2 = findViewById(R.id.et2) as TextInputEditText
       et2!!.hint = wordtoSpan

        et2!!.setOnFocusChangeListener(){ view: View, b: Boolean ->

            if(b){
                et2!!.hint = ""
                textInput!!.hint = wordtoSpan
            }
        }


    }


}
