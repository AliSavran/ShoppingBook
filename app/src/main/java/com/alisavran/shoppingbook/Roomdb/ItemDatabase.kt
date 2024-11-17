package com.alisavran.shoppingbook.Roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alisavran.shoppingbook.Model.Item

@Database(entities = [Item::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}