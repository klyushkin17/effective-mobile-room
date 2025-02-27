package com.example.flowershop.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    primaryKeys = ["flower_id", "bouquet_id"],
    tableName = "flower_bouquet"
)
data class FlowerBouquetCrossRef(
    @ColumnInfo(name = "flower_id") val flowerId: Int,
    @ColumnInfo(name = "bouquet_id") val bouquetId: Int,
    @ColumnInfo(name = "flowers_quantity") val flowersQuantity: Int,
)
