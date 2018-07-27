package com.demo.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.MainActivity
import com.demo.R
import com.demo.entity.User
import kotlinx.android.synthetic.main.fragment_read_data.view.*


class ReadDataFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view= inflater.inflate(R.layout.fragment_read_data, container, false)

        val data= MainActivity.myAppDatabase!!.myDao().showAll()

        var result=""
        for(m:User in data){

            val id=m.id
            val name=m.name
            val email=m.email
            result+=" Id: $id \n Name: $name \n Email: $email \n \n"
        }

        view.tv.text=result
        return view
    }

}



