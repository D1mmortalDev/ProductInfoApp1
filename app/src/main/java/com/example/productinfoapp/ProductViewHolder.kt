package com.example.productinfoapp

import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.productinfoapp.databinding.ProductLayoutBinding

class ProductViewHolder(private val binding:ProductLayoutBinding):RecyclerView.ViewHolder(binding.root){
    fun bind(product:Product){
           binding.imgViewProduct.setImageResource(product.image)
           binding.txtBrandName.text =product.brandName
           binding.txtProductName.text=product.productName
           binding.txtProductPrice.text=product.productPrice

    }
}