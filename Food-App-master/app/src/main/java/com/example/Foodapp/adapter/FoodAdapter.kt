package com.example.Foodapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.Foodapp.R
import com.example.Foodapp.model.Pizza


// - Bind data with views
// - send list of data to RecyclerView
class FoodAdapter(
    private val dataset: List<Pizza>,
    private val context: Context
    )
    : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    // Adapter helper class to arrange data in layout file
    class FoodViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView1 : TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
        val textView : TextView = view.findViewById(R.id.price)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pizza, parent, false)

        return FoodViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        // save the position of them (which item i'm dealing with)
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.priceId)
        holder.imageView.setImageResource(item.pizzaImageId)
        holder.textView1.text = context.resources.getString(item.pizzaStringId)

    }


    override fun getItemCount() = dataset.size


}