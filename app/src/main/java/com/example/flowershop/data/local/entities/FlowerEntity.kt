package com.example.flowershop.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flowers")
data class FlowerEntity (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "flower_id") val flowerId: Int,
    @ColumnInfo(name = "flower_name") val flowerName: String,
    @ColumnInfo(name = "flower_price") val flowerPrice: Float,
)