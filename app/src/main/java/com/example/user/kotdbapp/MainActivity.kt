package com.example.user.kotdbapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addStd(v: View) {
        var obj = SchoolDB(this)
        var db = obj.writableDatabase
        db.execSQL("insert into std values(?,?,?)", arrayOf(editText.text.toString(), editText2.text.toString(), editText3.text.toString()))
        Toast.makeText(this, "Saved", Toast.LENGTH_LONG).show()
    }
}
