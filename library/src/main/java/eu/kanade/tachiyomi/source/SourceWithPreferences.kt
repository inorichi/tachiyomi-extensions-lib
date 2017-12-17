package eu.kanade.tachiyomi.source

import android.content.SharedPreferences

/**
 * Created by Carlos on 12/17/2017.
 */
interface SourceWithPreferences {

    fun getSharedPreference(): SharedPreferences
}