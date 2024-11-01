package com.example.coinwave.ui.screen.favourite.repository

import com.example.coinwave.data.service.model.database.Coin
import com.example.coinwave.data.service.model.database.FavouriteDao
import javax.inject.Inject

class FavouriteRepository @Inject constructor( private val favouriteDao: FavouriteDao) {

  fun getAllFavourites() = favouriteDao.getAllFavourites()
  suspend fun insertFavourite(coin: Coin) = favouriteDao.insertFavourite(coin)
  suspend fun deleteFavourite(coin: Coin) = favouriteDao.deleteFavourite(coin)
}
