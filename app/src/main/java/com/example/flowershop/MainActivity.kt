package com.example.flowershop

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Room
import com.example.flowershop.data.local.FlowerShopDao
import com.example.flowershop.data.local.FlowerShopDatabase
import com.example.flowershop.data.local.migration.MIGRATION_1_2

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

        Room.databaseBuilder(
            applicationContext,
            FlowerShopDatabase::class.java,
            "flower_shop.db"
        ).createFromAsset("database/flower_shop.db")
            .addMigrations(MIGRATION_1_2)
            .build()
    }
}