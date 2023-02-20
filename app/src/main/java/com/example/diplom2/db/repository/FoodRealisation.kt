package com.example.diplom2.db.repository

import androidx.lifecycle.LiveData
import com.example.diplom2.db.dao.FoodDao
import com.example.diplom2.model.FoodModel

class FoodRealisation(private val foodDao: FoodDao): FoodRepository {
    override val allFoods: LiveData<List<FoodModel>>
        get() = foodDao.getAllFoods()

    override suspend fun insertFood(foodModel: FoodModel, onSucces: () -> Unit) {
        foodDao.insert(foodModel)
        onSucces()
    }

    override suspend fun deleteFood(foodModel: FoodModel, onSucces: () -> Unit) {
        foodDao.delete(foodModel)
        onSucces()
    }
}