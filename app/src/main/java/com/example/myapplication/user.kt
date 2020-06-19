package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "Name") val Name: String?,
    @ColumnInfo(name = "Phone") val Phone: String?,
    @ColumnInfo(name = "Location") val Location: String?,
    @ColumnInfo(name = "Login") val Login: String?
)
