package com.example.scapping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.scapping.Retrofit.RetrofitService
import com.example.scapping.adapter.MainAdapter
import com.example.scapping.databinding.ActivityMainBinding
import com.example.scapping.viewmodel.MainViewModel
import com.example.scapping.viewmodel.MyViewModelfactory


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val adapter = MainAdapter()

    val TAG = "Main Activity"
    lateinit var viewModel : MainViewModel
    private val retrofitService = RetrofitService.getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       val viewModel = ViewModelProvider(this, MyViewModelfactory(MainRepository(retrofitService))).get(MainViewModel::class.java)
        binding.recyclerview.adapter = adapter
        viewModel.movieList.observe(this, Observer {
            Log.d(TAG, "onCreate: $it?")
//            adapter.setMovieList(it)
        })
        viewModel.errorMessage.observe(this, Observer {
        })
        viewModel.getAllMovies()
    }
}


