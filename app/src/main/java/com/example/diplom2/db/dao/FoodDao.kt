package com.example.diplom2.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.diplom2.model.FoodModel

@Dao
interface FoodDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(foodModel: FoodModel)

    @Delete
    fun delete(foodModel: FoodModel)

    @Query("SELECT * from table_food")
    fun getAllFoods(): LiveData<List<FoodModel>>
}