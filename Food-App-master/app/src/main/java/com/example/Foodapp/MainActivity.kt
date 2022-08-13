package com.example.Foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.Foodapp.adapter.FoodAdapter
import com.example.Foodapp.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Data source
        val foodList = Datasource().loadFood()

        // adapter
        val adapter = FoodAdapter(foodList, this)

        // recyclerView
        val recyclerView : RecyclerView = findViewById(R.id.rv_food)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

    }
}