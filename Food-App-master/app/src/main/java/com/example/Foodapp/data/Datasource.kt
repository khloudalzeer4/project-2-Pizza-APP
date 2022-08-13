package com.example.Foodapp.data

import com.example.Foodapp.R
import com.example.Foodapp.model.Pizza



class Datasource {


    fun loadFood() : List<Pizza>{
        return listOf(
            Pizza(R.string.pizza1, R.drawable.image,R.string.price1),
            Pizza(R.string.pizza2, R.drawable.image2, R.string.price2),
            Pizza(R.string.pizza3, R.drawable.image3, R.string.price3),
            Pizza(R.string.pizza4, R.drawable.image4, R.string.price4),
            Pizza(R.string.pizza5, R.drawable.image5, R.string.price5),
            Pizza(R.string.pizza6, R.drawable.image6, R.string.price6),
            Pizza(R.string.pizza7, R.drawable.image7, R.string.price7),
            Pizza(R.string.pizza8, R.drawable.image8, R.string.price8),
            Pizza(R.string.pizza9, R.drawable.image9, R.string.price9),
            Pizza(R.string.pizza10, R.drawable.image10, R.string.price10),

        )
    }
}