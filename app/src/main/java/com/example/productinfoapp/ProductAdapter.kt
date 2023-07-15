package com.example.productinfoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.productinfoapp.databinding.ProductLayoutBinding

class ProductAdapter(private val productList:List<Product>,private val listener: RecyclerViewItemClickListener):RecyclerView.Adapter<ProductViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ProductLayoutBinding.inflate(inflater,parent,false)
        return ProductViewHolder(binding)
    }

    override fun getItemCount(): Int {
      return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(productList[position])
        holder.itemView.setOnClickListener {
            listener.onItemClick(productList[position])
        }

    }
}