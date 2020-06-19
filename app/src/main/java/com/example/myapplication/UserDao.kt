@file:Suppress("AndroidUnresolvedRoomSqlReference")

package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.LoginFilter
import androidx.room.*





        @Dao
        interface UserDao
        {
            @Query("SELECT * FROM user")
            fun getAll(): List<User>

            @Query("SELECT * FROM user WHERE uid IN (:Id)")
            fun loadAllByIds(userIds: IntArray): List<User>
            @Query( "SELECT * FROM user WHERE name IN (:Name)")
            fun getUserByName(userName: String): List<User>
            @Query("SELECT*FROM user WHERE location IN(:Location)")
            fun getUserByLocation(userLocation: String): List<User>
            @Insert
            fun insertAll(vararg user: User)

            @Delete
            fun delete(user: User)

            @Update
            fun update(user: User)
        }

