package com.gtaskmanager.livedatapractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel

    lateinit var data: TextView
    lateinit var btnUpdate: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        data = findViewById(R.id.data)
        btnUpdate = findViewById(R.id.btnupdate)
    viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.livedata.observe(this, Observer {
            data.text = it
        })

        btnUpdate.setOnClickListener {
            viewModel.updatelivedata()
        }
    }
}