package com.example.diplom2.screens.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import com.example.diplom2.R
import com.example.diplom2.Calculator
import kotlinx.android.synthetic.main.fragment_physical.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class MainFragment : Fragment() {
    var ves:Int = 100;
    var rost:Int = 180;
    var pol = 0;
    var vozrast = 20;
    lateinit var progressBar: ProgressBar
    lateinit var progressBarBelki:ProgressBar
    lateinit var progressBarJiri:ProgressBar
    lateinit var progressBarUglevodi:ProgressBar
    lateinit var mojno:TextView
    var eaten:Int = 1800
    var eatenBelki:Int = 50
    var eatenJiri:Int = 50
    var eatenUglevodi:Int = 50
    lateinit var roundCal:TextView
    lateinit var belkiProgress:TextView
    lateinit var jiriProgress:TextView
    lateinit var uglevodiProgress:TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //ПОДСЧЕТ ДНЕВНОГО КАЛОРАЖА
        var Kalorazh = Calculator().Calculate(rost,ves,pol,vozrast)
        progressBar = view.findViewById(R.id.progress_bar_calorii)
        mojno = view.findViewById(R.id.mojno)
        var newKalorazh = Kalorazh[0] - eaten
        mojno.text = ("Можно еще $newKalorazh калорий")
        roundCal = view.findViewById(R.id.progress_text_calorii)
        roundCal.text = eaten.toString()
        val kaloriiProcent = (100*eaten)/Kalorazh[0]
        progressBar.setProgress(kaloriiProcent)

        //ПОДСЧЕТ БЕЛКОВ
        belkiProgress = view.findViewById(R.id.progress_text_belki)
        belkiProgress.text = eatenBelki.toString()
        val belkiProcent = (100*eatenBelki)/Kalorazh[1]
        progressBarBelki= view.findViewById(R.id.progress_bar_belki)
        progressBarBelki.setProgress(belkiProcent)

        //ПОДСЧЕТ ЖИРОВ
        jiriProgress = view.findViewById(R.id.progress_text_giri)
        jiriProgress.text = eatenJiri.toString()
        val jiriProcent = (100*eatenJiri)/Kalorazh[2]
        progressBarJiri= view.findViewById(R.id.progress_bar_giri)
        progressBarJiri.setProgress(jiriProcent)

        //ПОДСЧЕТ УГЛЕВОДОВ
        uglevodiProgress = view.findViewById(R.id.progress_text_uglevodi)
        uglevodiProgress.text = eatenUglevodi.toString()
        val uglevodiProcent = (100*eatenUglevodi)/Kalorazh[3]
        progressBarJiri= view.findViewById(R.id.progress_bar_uglevodi)
        progressBarJiri.setProgress(uglevodiProcent)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        println("AAAAAAAAAA")
//        Calculator().Calculate()
//        println("BBBBBBBBB")
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_main, container, false)
    }




}