package com.zahideaksak.marvel.domain.repository

import androidx.paging.PagingData
import com.zahideaksak.marvel.data.remote.model.comics.CharacterComics
import com.zahideaksak.marvel.data.remote.model.dto.Result
import com.zahideaksak.marvel.domain.model.MarvelCharacter
import kotlinx.coroutines.flow.Flow

interface MarvelCharacterRepository {
    fun getMarvelCharacters(): Flow<PagingData<MarvelCharacter>>
    suspend fun getMarvelCharacterById(characterId: Int): Result
    suspend fun getMarvelCharacterComics(characterId: Int): CharacterComics
}