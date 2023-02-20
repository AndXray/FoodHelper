package com.example.diplom2

import android.os.Bundle
import android.widget.TextView

public class Calculator{

    var kalorazh:Float = 0.0f
    var belok:Int = 0
    var gir:Int = 0
    var uglevod:Int = 0

    fun Calculate(rost: Int, ves: Int, pol:Int, vozrast:Int): IntArray {
        if (pol == 0){
            //ДЛЯ МЖУЧИН
        }
        else{
            //ДЛЯ ЖЕНЩИН
            kalorazh = ((ves*10 + rost*6.25 - vozrast*5-161)*1.2).toFloat()
        }
        kalorazh = ((ves*10 + rost*6.25 - vozrast*5+5)*1.2).toFloat()
        belok = (1.5 * ves).toInt()
        gir = ves
        uglevod = 2 * ves

        val KBGU : IntArray = intArrayOf(kalorazh.toInt(),belok,gir,uglevod)
        return KBGU
    }
}