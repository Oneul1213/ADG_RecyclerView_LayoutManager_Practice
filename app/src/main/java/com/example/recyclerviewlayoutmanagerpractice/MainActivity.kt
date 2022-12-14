package com.example.recyclerviewlayoutmanagerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewlayoutmanagerpractice.adapter.ItemAdapter
import com.example.recyclerviewlayoutmanagerpractice.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, Datasource().loadCards())
        recyclerView.setHasFixedSize(true)
    }
}