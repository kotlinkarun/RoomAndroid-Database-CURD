package com.demo.utiles

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.demo.R


object Utils{



    //fragment
     fun initFrag(activity:AppCompatActivity,f: Fragment){
        activity.supportFragmentManager.beginTransaction()
                .replace(R.id.fram,f)
                .addToBackStack(null)
                .commit()
    }





}