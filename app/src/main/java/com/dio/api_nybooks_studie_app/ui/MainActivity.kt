package com.dio.api_nybooks_studie_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dio.api_nybooks_studie_app.R
import com.dio.api_nybooks_studie_app.model.SamplePojo
import com.dio.api_nybooks_studie_app.repository.Repository
import retrofit2.Callback

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        val callback = ca
        val test = findViewById<TextView>(R.id.tv_test_titulo)
        val botao = findViewById<Button>(R.id.botao)

        botao.setOnClickListener {
            viewModel.getPost()


                    viewModel.myResponse.observe(this, Observer { response ->
//            if (response.isSuccessful){
//                test.text = response.body().toString()
//                Log.d("RESPONDEU", response.body().toString())
//            }
//
        })

                    }

        }


    }