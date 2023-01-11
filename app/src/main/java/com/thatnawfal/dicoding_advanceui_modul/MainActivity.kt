package com.thatnawfal.dicoding_advanceui_modul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.thatnawfal.dicoding_advanceui_modul.customui.MyButton
import com.thatnawfal.dicoding_advanceui_modul.customui.MyEditText
import com.thatnawfal.dicoding_advanceui_modul.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            binding.btnSubmit.isEnabled = !binding.btnSubmit.isEnabled
        }

        setMyButtonEnable()
        editTextChanging()
    }

    private fun editTextChanging() {
        binding.myEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                setMyButtonEnable()
            }

            override fun afterTextChanged(p0: Editable?) {

            }

        })
    }

    private fun setMyButtonEnable() {
        val result = binding.myEditText.text
        binding.btnSubmit.isEnabled = result != null && result.toString().isNotEmpty()
    }
}