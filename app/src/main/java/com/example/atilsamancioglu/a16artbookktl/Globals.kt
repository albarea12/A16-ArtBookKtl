package com.example.atilsamancioglu.a16artbookktl

import android.graphics.Bitmap

/**
 * Created by atilsamancioglu on 09/07/2017.
 */
class Globals {

    companion object Chosen {
        var chosenImage : Bitmap? = null
        fun returnImage():Bitmap {
            return chosenImage!!
        }
    }

}