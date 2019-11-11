package com.example.myfirstapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import kotlin.random.Random

class MainActivity : Activity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        randomNum.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.button1 || v?.id == R.id.randomNum){
            randomNum.text = Random.nextInt(0,512).toString()
        }
    }
}

class RetrofitInitialize{
    fun init(){
        Retrofit.Builder()
            .baseUrl("https://cataas.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
