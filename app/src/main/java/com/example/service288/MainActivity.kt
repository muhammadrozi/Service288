package com.example.service288

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity (){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     btn_facebook.setOnClickListener({
            val i = Intent (Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"))
                    startActivity(i)
        })
        btn_instagram.setOnClickListener({
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"))
                                startActivity(i)
        })
    var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.ooooo)

        btn_play.setOnClickListener {
                MediaPlayer?.start()
        }
        btn_pause.setOnClickListener{
                MediaPlayer?.pause()
        }
        btn_stop.setOnClickListener{
                MediaPlayer?.stop()
                MediaPlayer?.seekTo(0)
        }
    }
}