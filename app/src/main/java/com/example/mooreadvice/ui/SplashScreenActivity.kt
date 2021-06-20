package com.example.mooreadvice.ui

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.MediaStore
import android.util.Log
import com.example.mooreadvice.MainActivity
import com.example.mooreadvice.R
import kotlinx.android.synthetic.main.activity_splash_screen.*
import java.lang.Thread.sleep

class SplashScreenActivity : Activity() {

    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        val path: Uri = Uri.parse("android.resource://$packageName/" + R.raw.episode_three)

        videoView.setVideoURI(path)

        handler = Handler()
        videoView.start()


        handler.postDelayed({
            val i =  Intent(this@SplashScreenActivity, MainActivity::class.java)
            startActivity(i)
            finish()
        }, 20000)




    }



}