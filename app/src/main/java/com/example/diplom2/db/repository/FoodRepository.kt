package com.example.diplom2.db.repository

import androidx.lifecycle.LiveData
import com.example.diplom2.model.FoodModel

interface FoodRepository {
    val allFoods: LiveData<List<FoodModel>>
    suspend fun insertFood(foodModel: FoodModel, onSucces:() -> Unit)
    suspend fun deleteFood(foodModel: FoodModel, onSucces:() -> Unit)
}