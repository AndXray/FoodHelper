package com.example.diplom2.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_food")
class FoodModel(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo
    var title: String ="",

    @ColumnInfo
    var kalorazh: String ="",

    @ColumnInfo
    var belki: String ="",

    @ColumnInfo
    var jiri: String ="",

    @ColumnInfo
    var uglevodi: String =""
        )