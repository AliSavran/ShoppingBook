package com.alisavran.shoppingbook.Roomdb

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.alisavran.shoppingbook.Model.Item

@Dao
interface ItemDao {

    @Query("SELECT name , id FROM item")
    fun getItemWithNameAndId(): List<Item>

    @Query("SELECT *FROM item WHERE id =  :id")
    fun getItemById(id: Int) :Item?

    @Insert
    suspend fun insert(item : Item)

    @Delete
    suspend fun delete(item: Item)
}