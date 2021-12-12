package com.gildev27.motivation.userinterface

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.gildev27.motivation.R
import com.gildev27.motivation.infra.MotivationConstants
import com.gildev27.motivation.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurityPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        mSecurityPreferences = SecurityPreferences(this)
        textName.text = mSecurityPreferences.getString(MotivationConstants.KEY.PERSON_NAME)

        buttonNewPhrase.setOnClickListener(this)
        infinity.setOnClickListener(this)
        smile.setOnClickListener(this)
        sunny.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id

        val listFilter = listOf(R.id.infinity, R.id.smile, R.id.sunny)

        if (id == R.id.buttonNewPhrase) {
            handleNewPhrase()

        } else if (id in listFilter) {
            handleFilter(id)

        }
    }

    private fun handleNewPhrase() {


    }

    private fun handleFilter(id: Int) {

        infinity.setColorFilter(resources.getColor(R.color.white))
        smile.setColorFilter(resources.getColor(R.color.white))
        sunny.setColorFilter(resources.getColor(R.color.white))

        when (id) {
            R.id.infinity -> {
                infinity.setColorFilter(resources.getColor(R.color.colorAccent))
            }

            R.id.smile -> {
                smile.setColorFilter(resources.getColor(R.color.colorAccent))
            }

            R.id.sunny -> {
                sunny.setColorFilter(resources.getColor(R.color.colorAccent))
            }
        }
    }
}