package com.example.productinfoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.productinfoapp.databinding.ActivityProductDetailsBinding

@Suppress("DEPRECATION")
class ProductDetails : AppCompatActivity() {
    private lateinit var binding:ActivityProductDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val product = bundle?.getParcelable<Product>("product")

        if(product!=null){
            val productImage = product.image
            val productBrandName = product.brandName
            val productName = product.productName
            val productDesc = product.productDesc
            val productPrice = product.productPrice

            binding.imgViewProductImage.setImageResource(productImage)
            binding.txtViewProductName.text =productName
            binding.txtViewProductDesc.text= productDesc
            binding.txtViewProductPrice.text="$productBrandName Price: $productPrice"
        }


    }
}