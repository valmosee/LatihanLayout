package com.example.latihanlayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

//<LinearLayout
//android:layout_width="match_parent"
//android:layout_height="wrap_content"
//android:orientation="horizontal"
//android:gravity="center_vertical"
//android:padding="10dp">
//
//<!-- Icon lokasi -->
//<ImageView
//android:id="@+id/search"
//android:layout_width="30dp"
//android:layout_height="30dp"
//android:layout_marginEnd="8dp"
//android:src="@drawable/location" />
//
//<!-- Alamat -->
//<TextView
//android:id="@+id/searchproduct"
//android:layout_width="wrap_content"
//android:layout_height="wrap_content"
//android:text="Brooklyn, NY 11235"
//android:textSize="12sp" />
//<!-- Notifikasi -->
//<ImageView
//android:id="@+id/microphone"
//android:layout_width="30dp"
//android:layout_height="30dp"
//android:layout_gravity="center_vertical|end"
//android:layout_marginEnd="8dp"
//app:srcCompat="@drawable/notification" />
//</LinearLayout>