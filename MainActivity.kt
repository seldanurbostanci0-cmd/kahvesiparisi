package com.example.kahvesiparisi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 1. Önce tasarımı ekrana yüklüyoruz
        setContentView(R.layout.activity_main)

        // Telefonun çentik ayarı (Sistem kodu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 2. Tasarımdaki parçaları kod dünyasına tanıtıyoruz
        val btnSiparis = findViewById<Button>(R.id.button)
        val cbSutlu = findViewById<CheckBox>(R.id.checkBox)
        val cbSekerli = findViewById<CheckBox>(R.id.checkBox2)
        val cbSade = findViewById<CheckBox>(R.id.checkBox3)

        // 3. Pembe butona basıldığında çalışacak kısım
        btnSiparis.setOnClickListener {
            // Tıklandığı an doğrudan kahve seçim ekranına (secondActivity) geçiyoruz
            val intent = Intent(this, secondActivity::class.java)
            startActivity(intent)
        }
    }
}