package com.example.pratikum10

import androidx.lifecycle.LiveData

class WordRepository(private val wordDao: WordDao) {
    val allWords = wordDao.getAlphabetizedWords()
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}