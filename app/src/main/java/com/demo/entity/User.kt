package com.demo.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "users")
data class User(
    @PrimaryKey
    var id:Int?=0,

    @ColumnInfo(name="full_name")
    var name:String?=null,

    @ColumnInfo(name="email")
    var email:String?=null

)