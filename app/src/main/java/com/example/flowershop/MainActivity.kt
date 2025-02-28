package com.example.flowershop

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import com.example.flowershop.data.local.FlowerShopDao
import com.example.flowershop.data.local.FlowerShopDatabase
import com.example.flowershop.data.local.migration.MIGRATION_1_2
import com.example.flowershop.data.remote.SomeApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

const val TAG = "HAHAH"

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

        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        Room.databaseBuilder(
            applicationContext,
            FlowerShopDatabase::class.java,
            "flower_shop.db"
        ).createFromAsset("database/flower_shop.db")
            .addMigrations(MIGRATION_1_2)
            .build()

        val someApi = Retrofit.Builder()
            .baseUrl(SomeApi.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .client(okHttpClient)
            .build()
            .create(SomeApi::class.java)

        lifecycleScope.launch(Dispatchers.IO) {
            val result = someApi.getVacancies()
        }
    }
}