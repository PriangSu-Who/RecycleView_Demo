package com.example.recyclerview_demo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recyclerview_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var  binding : ActivityMainBinding

    val names = listOf<String>(
        "John Doe",
        "Jane Smith",
        "Emily Johnson",
        "Michael Brown",
        "Sarah Davis",
        "David Wilson",
        "Laura Miller",
        "James Taylor",
        "Olivia Anderson",
        "William Thomas",
        "Sophia Martinez",
        "Daniel Lee",
        "Isabella Harris",
        "Matthew Clark",
        "Ava Lewis",
        "Ethan Walker",
        "Mia Hall",
        "Alexander Young",
        "Charlotte King",
        "Benjamin Scott",
        "Amelia Adams"
    )


    lateinit var adapter: NameAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = NameAdapter()
        adapter.submitList(names)

        binding.recyclerView.adapter = adapter

    }
}