package com.zahideaksak.marvel.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.zahideaksak.marvel.data.paging.MarvelCharactersPagingSource
import com.zahideaksak.marvel.data.remote.network.MarvelCharacterApi
import com.zahideaksak.marvel.domain.model.MarvelCharacter
import com.zahideaksak.marvel.domain.repository.MarvelCharacterRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MarvelCharacterRepositoryImpl @Inject constructor(
    private val api: MarvelCharacterApi
) : MarvelCharacterRepository {

    override fun getMarvelCharacters(): Flow<PagingData<MarvelCharacter>> {
        return Pager(
            config = PagingConfig(enablePlaceholders = false, pageSize = 1),
            pagingSourceFactory = {
                MarvelCharactersPagingSource(api)
            }
        ).flow
    }

    override suspend fun getMarvelCharacterById(characterId: Int) =
        api.getMarvelCharacterById(characterId)

    override suspend fun getMarvelCharacterComics(
        characterId: Int
    ) = api.getMarvelCharacterComics(characterId)
}