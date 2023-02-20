package com.example.diplom2.screens.food

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.diplom2.APP
import com.example.diplom2.R
import com.example.diplom2.adapter.FoodAdapter
import com.example.diplom2.databinding.FragmentAllFoodBinding

class AllFood : Fragment() {

    lateinit var binding: FragmentAllFoodBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: FoodAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllFoodBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()
    }

    private fun init() {
        val viewModel = ViewModelProvider(this).get(AllFoodViewModel::class.java)
        viewModel.initDataBase()
        recyclerView = binding.rvFood
        adapter = FoodAdapter()
        recyclerView.adapter = adapter
        viewModel.getAllFoods().observe(viewLifecycleOwner) { listFoods ->

            adapter.setList(listFoods.asReversed())
        }

        binding.btnAdd.setOnClickListener{
            APP.navController.navigate(R.id.action_allFood_to_addFood)
        }
    }
}