package by.renatopuskaric.architecturemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import by.renatopuskaric.architecturemvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), LifecycleOwner {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val  view: View = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            var dispaly = 0
            var textToDieplay = dispaly++.toString()
            binding.textView.text = textToDieplay
        }



    }
}