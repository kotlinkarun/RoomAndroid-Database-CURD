package com.demo

import android.arch.persistence.room.Room
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.demo.database.MyAppDatabase
import com.demo.fragments.HomeFragment
import com.demo.utiles.Utils

class MainActivity : AppCompatActivity() {


    companion object {
        var myAppDatabase:MyAppDatabase?=null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myAppDatabase=Room.databaseBuilder(applicationContext,
                MyAppDatabase::class.java, "userdb").allowMainThreadQueries().build()

        Utils.initFrag(this,HomeFragment())

    }
}
