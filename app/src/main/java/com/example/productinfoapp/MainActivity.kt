package com.example.productinfoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.productinfoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),RecyclerViewItemClickListener {
    private lateinit var binding:ActivityMainBinding
    private lateinit var  recycleView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recycleView = binding.recycleViewProduct
        recycleView.layoutManager = LinearLayoutManager(this)

        var products = listOf(
            Product(R.drawable.dior,"Dior","Small Dior Tote","Introduced by Maria Grazia Chiuri, Creative Director of Dior, the Dior Book Tote has become a staple of the Dior aesthetic. Designed to hold all the daily essentials, the style is fully embroidered with the pink and gray Toile de Jouy Sauvage motif, offering a new take on the House icon. Adorned with the Christian Dior Paris signature on the front, the small tote exemplifies the House's signature savoir-faire and may be carried by hand.","S$ 4,400.00"),
            Product(R.drawable.gucci,"Gucci","Gucci Blondie Small Shoulder Bag","Style \u200E742360 1IV0G 2535\n" +
                    "The Round Interlocking G that characterises the Gucci Blondie line originates from the House archives. Signature pieces such as this Gucci Blondie shoulder and crossbody bag reinterpret the emblem as a subtler leather patch detail.","S$ 2,570"),
            Product(R.drawable.prada,"Prada","Small Prada Galleria Saffiano Special Edition Bag","Redefined and recreated season after season, the Galleria bag is a neo-classical archetype of Prada proposed here in an exclusive limited edition with vibrant color-block motif printed on distinctive Saffiano leather. Pop-inspired colors reflect in the kaleidoscopic universe created by conceptual artist Alex Da Corte for the dedicated campaign starring actor Scarlett Johansson. As this Hollywood icon is transformed and recontextualized through color, so is the Prada Galleria, its silhouette a canvas for an exploration of shades and patterns. Sleek and timeless with pure and simple lines, the Galleria bag revisits Prada's artisan heritage with a contemporary handmade design blending history and modernity.","SGD 11,000"),
            Product(R.drawable.saint,"Saint Laurent","Jamie 4.3 in Lambskin","JAMIE 4.3 IN LAMBSKIN\n" +
                    "LARGE SOFT NAPPA BAG DECORATED WITH QUILTED \"CARRÉ RIVE GAUCHE\" TOPSTITCHING.\n" +
                    "LIGHT AND SPACIOUS, ITS SLIDING CHAIN STRAP CAN BE ADJUSTED FOR A TAILOR-MADE LENGTH.\n" +
                    "\n" +
                    " TANNED CHROME- AND METAL-FREE LEATHER\n" +
                    " 100% LAMBSKIN\n" +
                    " TANNED CHROME- AND METAL-FREE LEATHER\n" +
                    " COTTON LINING\n" +
                    " LIGHT BRONZE METAL HARDWARE\n" +
                    " TIE CLOSURE\n" +
                    " INSIDE ZIPPER POCKET & INSIDE PATCH POCKET\n" +
                    " DIMENSIONS: 43 X 29 X 9 CM / 16.9 X 11.4 X 3.5 INCHES\n" +
                    " CHAIN LENGTH: 30-54 CM / 11.8-21.3 INCHES\n" +
                    " 100% LAMBSKIN\n" +
                    " STYLE ID 742431AAB321000\n" +
                    " MADE IN ITALY\n" +
                    "\n" +
                    "Made in France\n" +
                    "\n" +
                    "Highlights\n" +
                    "circa 1993-1994\n" +
                    "black\n" +
                    "silk/suede\n" +
                    "fully pleated\n" +
                    "single circular top handle\n" +
                    "detachable shoulder strap\n" +
                    "signature sangles straps\n" +
                    "foldover top\n" +
                    "twist-lock fastening\n" +
                    "padlock fastening\n" +
                    "hanging key fob\n" +
                    "set of keys\n" +
                    "internal zip-fastening pocket\n" +
                    "internal logo stamp\n" +
                    "suede lining\n" +
                    "metal feet\n" +
                    "gold-tone hardware\n" +
                    "hard trapeze body\n" +
                    "Purchasing this item continues its narrative and reduces the environmental impact by avoiding the use of new resources needed to make the product from scratch, such as water, materials and electricity, and avoiding additional manufacturing impact.","$153,353"),
            Product(R.drawable.hermes,"Hermes","Hermès","1993-1994 pleated small Kelly two-way handbag\n" +
                    "\n" +
                    "Named after Grace Kelly in 1977, the Kelly bag from Hermès became one of the most sought-after styles in the world. Crafted from pure silk with suede trimming, this iteration of the Kelly two-way bag has a black tone with a distinct fully-pleated design.\n","$153,353"),
        )
        recycleView.adapter=ProductAdapter(products,this)

    }

    override fun onItemClick(product: Product) {
        val bundle = Bundle()
        bundle.putParcelable("product", product)
        val intent = Intent(this, ProductDetails::class.java)
        intent.putExtras(bundle)
        startActivity(intent)
    }
}

