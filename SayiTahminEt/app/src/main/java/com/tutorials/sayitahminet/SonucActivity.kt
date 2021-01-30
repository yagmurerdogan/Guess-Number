package com.tutorials.sayitahminet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sonuc.*

class SonucActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)

        val sonuc = intent.getBooleanExtra("sonuc",false)
        if(sonuc) {
            textViewSonuc.text = "KAZANDINIZ"
            imageViewSonuc.setImageResource(R.drawable.mutlu_resim)
        }else {
            textViewSonuc.text = "KAYBETTİNİZ"
            imageViewSonuc.setImageResource(R.drawable.uzgun_resim)
        }

        buttonTekrar.setOnClickListener {
            val intent = Intent(this@SonucActivity,TahminActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}