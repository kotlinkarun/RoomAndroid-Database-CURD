package com.demo.dao

import android.arch.persistence.room.*
import com.demo.entity.User

@Dao
interface MyDao{

    @Insert
    fun addUser(user:User)


    @Query("select * from users")
    fun showAll():List<User>

    @Delete
    fun deletByID(user:User)

    @Update
    fun updateByID(user:User)




}
