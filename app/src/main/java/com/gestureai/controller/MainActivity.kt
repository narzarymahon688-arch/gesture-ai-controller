package com.gestureai.controller

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    private lateinit var statusText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.rgb(245, 248, 252))
        }

        val title = TextView(this).apply {
            text = "Gesture AI Controller"
            textSize = 26f
            setTextColor(Color.rgb(25, 45, 75))
            gravity = Gravity.CENTER
        }

        statusText = TextView(this).apply {
            text = "Controller ready to configure"
            textSize = 16f
            gravity = Gravity.CENTER
            setPadding(0, 24, 0, 24)
        }

        val cameraButton = Button(this).apply {
            text = "Start Hand Tracking"
            setOnClickListener {
                statusText.text =
                    "Camera tracking will be enabled in the next stage."
            }
        }

        val settingsButton = Button(this).apply {
            text = "Gesture Settings"
            setOnClickListener {
                statusText.text =
                    "Gesture settings are being prepared."
            }
        }

        layout.addView(title)
        layout.addView(statusText)
        layout.addView(
            cameraButton,
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        )
        layout.addView(
            settingsButton,
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        )

        setContentView(layout)
    }
}