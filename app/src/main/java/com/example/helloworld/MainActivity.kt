package com.example.helloworld


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.helloworld.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

var texte = ""
var nombres = []
val nombre = View.OnClickListener { view ->
    Log.i("DebugCalculatrice", (view as Button).text.tonombre())
    texte += (view as Button).text.tonombre()
    binding.textView.text = texte
}
val nombre = View.OnClickListener { view ->
    Log.i("DebugCalculatrice", (view as Button).text.tonombre())
    texte += (view as Button).text.tonombre()
    binding.textView.text = texte
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btn9 : Button = findViewById(R.id.button9)

        binding.button0.setOnClickListener(nombre)
        binding.button1.setOnClickListener(nombre)
        binding.button2.setOnClickListener(nombre)
        binding.button3.setOnClickListener(nombre)
        binding.button4.setOnClickListener(nombre)
        binding.button5.setOnClickListener(nombre)
        binding.button6.setOnClickListener(nombre)
        binding.button7.setOnClickListener(nombre)
        binding.button8.setOnClickListener(nombre)
        binding.button9.setOnClickListener(nombre)
        binding.buttonpoint.setOnClickListener(nombre)
        binding.buttonplus.setOnClickListener(opera)
        binding.buttonmoins.setOnClickListener(opera)
        binding.buttondiv.setOnClickListener(opera)
        binding.buttonfois.setOnClickListener(opera)

    }
}