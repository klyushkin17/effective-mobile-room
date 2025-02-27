package com.example.flowershop.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import com.example.flowershop.data.local.entities.BouquetEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface FlowerShopDao {

    @Query("SELECT * FROM bouquets")
    fun getBouquets(): Flow<List<BouquetEntity>>

    @Delete
    fun deleteBouquet(bouquetEntity: BouquetEntity)
}