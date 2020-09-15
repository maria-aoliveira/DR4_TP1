package com.example.maria_eduarda_dr4_tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        val lista = getExternalFilesDir(null)!!.list()
        listaFile.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lista!!.toList())
    }
}
