package com.example.flowershop.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bouquets")
data class BouquetEntity (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "bouquet_id") val bouquetId: Int,
    @ColumnInfo(name = "bouquet_name") val bouquetName: String,
    @ColumnInfo(name = "bouquet_price") val bouquetPrice: Float,
    @ColumnInfo(name = "bouquet_decoration") val bouquetDecoration: String?,
)


