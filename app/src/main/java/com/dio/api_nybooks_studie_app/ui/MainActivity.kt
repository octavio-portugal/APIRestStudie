package com.dio.api_nybooks_studie_app.ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.dio.api_nybooks_studie_app.R
import com.dio.api_nybooks_studie_app.model.Post
import com.dio.api_nybooks_studie_app.model.SamplePojo
import com.dio.api_nybooks_studie_app.model.SamplePojoList
import com.dio.api_nybooks_studie_app.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
        val pojoList = listOf<SamplePojoList>()
        val test = findViewById<TextView>(R.id.tv_test_titulo)
        val botao = findViewById<Button>(R.id.botao)

        viewModel.getPost()

        botao.setOnClickListener {
            viewModel.myResponse.observe(this, Observer { response ->
                var body = pojoList
                test.text = body.toString()
                Log.d("RESPONDEU", body.toString())
            })

//        onStart()
//        suspend fun ConfiguraBotao(
//            repository: Repository,
//            test: TextView
//        ) {


//            lifecycleScope.launch {
//                repository.getPost()
//                    .enqueue(object : Callback<SamplePojoList> {
//                        override fun onResponse(
//                            call: Call<SamplePojoList>,
//                            response: Response<SamplePojoList>
//                        ) {
//                            if (response.isSuccessful) {
//                                pojoList
//                                test.text = response.body().toString()
//                                Log.d("RESPONDEU", response.body().toString())
//
//                            }
//                        }
//
//                        override fun onFailure(call: Call<SamplePojoList>, t: Throwable) {
//                            Log.d("FALHOU", "error")
//                        }
//                    })
//            }
        }

//                    suspend fun onStart() {
//                super.onStart()
//
//                botao.setOnClickListener {
//                    lifecycleScope.launch {
//                        ConfiguraBotao(repository, test)
//                    }

//            viewModel.getPost()

//                    viewModel.myResponse.observe(this, Observer { response ->
//            if (response.isSuccessful){
//                test.text = response.body().toString()
//                Log.d("RESPONDEU", response.body().toString())
//            }
//


    }


}







