package io.github.qlain.themostsimplerecyclerview.view.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.qlain.themostsimplerecyclerview.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(
            R.id.container_main_fragment,
            MainFragment()
        ).commit()
    }
}
