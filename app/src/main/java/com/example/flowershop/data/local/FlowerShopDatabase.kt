package com.example.flowershop.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.flowershop.data.local.entities.BouquetEntity
import com.example.flowershop.data.local.entities.FlowerBouquetCrossRef
import com.example.flowershop.data.local.entities.FlowerEntity

@Database(
    entities = [
        BouquetEntity::class,
        FlowerEntity::class,
        FlowerBouquetCrossRef::class,
    ],
    version = 1
)
abstract class FlowerShopDatabase: RoomDatabase() {

    abstract val flowerShopDao: FlowerShopDao
}