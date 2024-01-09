package com.example.hello_ielts.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.hello_ielts.R
import com.example.hello_ielts.databinding.ActivityWellcomeBinding

class WellcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWellcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_wellcome)

    }
}