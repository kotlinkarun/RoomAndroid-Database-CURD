package com.demo.fragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.R
import com.demo.utiles.Utils.initFrag
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    private lateinit var context:AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context=this.activity as AppCompatActivity
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
      val view= inflater.inflate(R.layout.fragment_home, container, false)

        view.btn_add.setOnClickListener {
            initFrag(context,AddDataFragment())
        }

        view.btn_read.setOnClickListener {
            initFrag(context,ReadDataFragment())
        }

        view.btn_update.setOnClickListener {
            initFrag(context,UpdateDataFragment())
        }

        view.btn_delete.setOnClickListener {
            initFrag(context,DeleteDataFragment())
        }

        return view
    }




}
