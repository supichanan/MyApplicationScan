package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import androidx.room.RoomDatabase





        abstract class AppDatabase : RoomDatabase() {
            abstract fun userDao(): UserDao
        }


