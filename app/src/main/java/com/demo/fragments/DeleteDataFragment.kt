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
import kotlinx.android.synthetic.main.fragment_delete_data.view.*


class DeleteDataFragment : Fragment() {

    private lateinit var context:AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        context=this.activity as AppCompatActivity
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view= inflater.inflate(R.layout.fragment_delete_data, container, false)
        val edit_usreId=view.edit_usreId

        view.btn_delete.setOnClickListener{
            val user= User().apply {
                id=edit_usreId.text.toString().toInt()
            }
            myAppDatabase!!.myDao().deletByID(user)
            Toast.makeText(activity,"Delete successfully",Toast.LENGTH_SHORT).show()

            edit_usreId.text.clear()

            Utils.initFrag(context, ReadDataFragment())

        }
        return view
    }



}



