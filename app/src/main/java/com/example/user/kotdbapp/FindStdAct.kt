package com.example.user.kotdbapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_find_std.*

class FindStdAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_std)
    }

    fun findStd(v: View) {
        var obj = SchoolDB(this)
        var db = obj.readableDatabase
        var cur = db.rawQuery("select * from std where id=?", arrayOf(editText4.text.toString()))
        Toast.makeText(this, cur.count.toString(), Toast.LENGTH_LONG).show()

        if (cur.count == 0) {
            Toast.makeText(this, "ID not found", Toast.LENGTH_LONG).show()
            editText5.setText("")
            editText6.setText("")
        } else {
            cur.moveToFirst()
            editText5.setText(cur.getString(cur.getColumnIndex("name")))
            editText6.setText(cur.getString(cur.getColumnIndex("marks")))
        }

    }
}
