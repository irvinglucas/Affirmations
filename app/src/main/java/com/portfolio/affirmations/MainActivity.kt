package com.portfolio.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.portfolio.affirmations.adapter.ItemAdapter
import com.portfolio.affirmations.data.Datasource
import com.portfolio.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = Datasource().loadAffirmations()

//        val linearLayoutManager = LinearLayoutManager(this, HORIZONTAL, false)
//        val gridLayoutManager = GridLayoutManager(this, 3)
        binding.recyclerView.adapter = ItemAdapter(this, data)
        binding.recyclerView.setHasFixedSize(true)
//        binding.recyclerView.layoutManager = gridLayoutManager
    }
}