package ru.easycode.zerotoheroandroidtdd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.easycode.zerotoheroandroidtdd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.actionButton.setOnClickListener {
            binding.inputEditText.setText("")
        }
        val data = mutableListOf("first text", "second text")
        for(i in 0 .. 10){
            data.add("text number $i")
        }
        binding.recyclerView.adapter = TestAdapter(data)
    }
}