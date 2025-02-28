package com.example.flowershop.data.local.migration

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val MIGRATION_1_2 = object : Migration(1, 2) {
    override fun migrate(db: SupportSQLiteDatabase) {
        db.execSQL("ALTER TABLE bouquets ADD COLUMN bouquet_decoration TEXT;")
        db.execSQL("ALTER TABLE flowers ADD COLUMN origin_country TEXT;")
        db.execSQL("UPDATE bouquets SET decoration = 'Крафтовая бумага' WHERE bouquet_id = 1;");
        db.execSQL("UPDATE bouquets SET decoration = 'Корзина' WHERE bouquet_id = 2;");
        db.execSQL("UPDATE bouquets SET decoration = 'Пленка' WHERE bouquet_id = 3;");
        db.execSQL("UPDATE bouquets SET decoration = 'Крафтовая бумага' WHERE bouquet_id = 4;");
        db.execSQL("UPDATE flowers SET country_of_origin = 'Нидерланды' WHERE flower_id IN (1, 2, 3, 4);");
        db.execSQL("UPDATE flowers SET country_of_origin = 'Россия' WHERE flower_id = 5;");
        db.execSQL("UPDATE flowers SET country_of_origin = 'Кения' WHERE flower_id = 6;");
        db.execSQL("UPDATE flowers SET country_of_origin = 'Китай' WHERE flower_id = 7;");
        db.execSQL("UPDATE flowers SET country_of_origin = 'Франция' WHERE flower_id = 8;");
        db.execSQL("UPDATE flowers SET country_of_origin = 'Таиланд' WHERE flower_id = 9;");
        db.execSQL("UPDATE flowers SET country_of_origin = 'Эквадор' WHERE flower_id = 10;");
    }
}