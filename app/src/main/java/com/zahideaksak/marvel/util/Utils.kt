package com.zahideaksak.marvel.util

import com.zahideaksak.marvel.common.Constants

class Utils {
    companion object {
        fun applyQueries(): HashMap<String, String> {
            val queries: HashMap<String, String> = HashMap()
            queries[Constants.QUERY_TS] = Constants.TS
            queries[Constants.QUERY_API_KEY] = Constants.PUBLIC_API_KEY
            queries[Constants.QUERY_HASH] = Constants.MD5_API_KEY
            queries[Constants.QUERY_LIMIT] = Constants.LIMIT
            return queries
        }
    }
}