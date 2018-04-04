package com.example.user.kotdbapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SchoolDB(con:Context) : SQLiteOpenHelper(con,"school.db",null,1)
{
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("create table std(id integer,name text,marks integer);")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
