package com.example.diplom2.screens.physical

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.diplom2.R
import com.example.diplom2.Calculator

class PhysicalFragment : Fragment() {


    var ves:Int = 100;
    var rost:Int = 180;
    var pol = 0;
    var vozrast = 20;
    lateinit var Pol:TextView
    lateinit var Ves:TextView
    lateinit var Rost:TextView
    lateinit var Vozrast:TextView
    lateinit var obmen: TextView
    lateinit var Belki: TextView
    lateinit var Jiri: TextView
    lateinit var Uglevodi: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_physical, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var Kalorazh = Calculator().Calculate(rost,ves,pol,vozrast)

        Rost = view.findViewById(R.id.rost)
        Ves = view.findViewById(R.id.ves)
        Vozrast = view.findViewById(R.id.vozrast)
        Pol = view.findViewById(R.id.pol)
        obmen = view.findViewById(R.id.obmen)
        Belki = view.findViewById(R.id.belki)
        Jiri = view.findViewById(R.id.jiri)
        Uglevodi = view.findViewById(R.id.uglevodi)


        if (pol == 0) { Pol.text = "М" }
        else Pol.text = "Ж"
        Rost.text = rost.toString()
        Ves.text = ves.toString()
        Vozrast.text = vozrast.toString()

        obmen.text = Kalorazh[0].toString()
        Belki.text = Kalorazh[1].toString()
        Jiri.text = Kalorazh[2].toString()
        Uglevodi.text = Kalorazh[3].toString()



    }
}

