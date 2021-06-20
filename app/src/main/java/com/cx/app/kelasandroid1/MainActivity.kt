package com.cx.app.kelasandroid1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnIntentExplicit: Button? = null
    private var btnIntentImplicit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntentExplicit = findViewById(R.id.btnIntentExplicit)
        btnIntentImplicit = findViewById(R.id.btnIntentImplicit)
        btnIntentExplicit?.setOnClickListener(this)
        btnIntentImplicit?.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when (p0) {
            btnIntentExplicit ->
                startActivity(Intent(this, MainActivity2::class.java))
            btnIntentImplicit -> {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("http://cybernetix.or.id/")
                startActivity(intent)
            }
        }
    }

    private fun startActivity() {
        startActivity(Intent(this, MainActivity2::class.java))
    }

    private fun startActivityWithData(){
        Intent(this, MainActivity2::class.java).apply {
            putExtra("id", 0)
            putExtra("name", "Joni")
            startActivity(this)
        }
    }

    private fun openBrowser() {
        Intent().apply {
            action = Intent.ACTION_VIEW
            data = Uri.parse("http://cybernetix.or.id/")
            startActivity(this)
        }
    }

    private fun sendText(){
        Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, "Contoh intent implisit mengirim text")
            startActivity(this)
        }
    }
}