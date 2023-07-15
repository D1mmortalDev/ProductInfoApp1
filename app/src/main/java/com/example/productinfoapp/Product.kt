package com.example.productinfoapp

import android.os.Parcel
import android.os.Parcelable

data class Product(val image:Int, val brandName: String?, val productName: String?, val productDesc: String?, val productPrice: String?):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(brandName)
        parcel.writeString(productName)
        parcel.writeString(productDesc)
        parcel.writeString(productPrice)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Product> {
        override fun createFromParcel(parcel: Parcel): Product {
            return Product(parcel)
        }

        override fun newArray(size: Int): Array<Product?> {
            return arrayOfNulls(size)
        }
    }
}