// Raihan Rafi Rizqullah

package com.example.helloapps

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val fullNameTextView = findViewById<TextView>(R.id.fullNameTextView)
        val universityTextView = findViewById<TextView>(R.id.universityTextView)

        // set image
        setProfilePicture(imageView)

        // set full name
        val fullName = getFullName()
        fullNameTextView.text = fullName

        // set university name
        val universityName = getUniversityName()
        universityTextView.text = universityName
    }

    // method for set profile picture
    private fun setProfilePicture(imageView: ImageView) {
        imageView.setImageResource(R.drawable.sanhua_01)
    }

    // method for set full name
    private fun getFullName(): String {
        return "Raihan Rafi Rizqullah"
    }

    // method for set university name
    private fun getUniversityName(): String {
        return "Universitas Muhammadiyah Surakarta"
    }
}


