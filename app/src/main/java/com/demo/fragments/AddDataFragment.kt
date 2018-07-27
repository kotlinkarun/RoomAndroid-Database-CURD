package com.demo.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.demo.MainActivity.Companion.myAppDatabase

import com.demo.R
import com.demo.entity.User
import com.demo.utiles.Utils
import kotlinx.android.synthetic.main.fragment_add_data.view.*


class AddDataFragment : Fragment() {

    private lateinit var context: AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context=this.activity as AppCompatActivity
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view= inflater.inflate(R.layout.fragment_add_data, container, false)
        val edit_name=view.edit_name
        val edit_email=view.edit_email
        view.btn_save.setOnClickListener{
            val user= User().apply {
                id=(Math.random()*1000).toInt()
                name=edit_name.text.toString()
                email=edit_email.text.toString()
            }
            myAppDatabase!!.myDao().addUser(user)
            Toast.makeText(activity,"Add successfully",Toast.LENGTH_SHORT).show()

            edit_name.text.clear()
            edit_email.text.clear()

            Utils.initFrag(context, ReadDataFragment())
        }


        return view
    }



}



