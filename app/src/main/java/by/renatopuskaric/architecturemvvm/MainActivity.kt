package by.renatopuskaric.architecturemvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import by.renatopuskaric.architecturemvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), LifecycleOwner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)

        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        button.setOnClickListener {
            var textToDieplay = viewModel.upAdd().toString()
            textView.text = textToDieplay

        }



    }
}