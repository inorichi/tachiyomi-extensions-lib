package eu.kanade.tachiyomi.source.online

import eu.kanade.tachiyomi.source.Source
import eu.kanade.tachiyomi.source.SourceWithPreferences
import okhttp3.Response
import rx.Observable

/**
 */
interface LoginSource : Source, SourceWithPreferences{

    fun isLogged(): Boolean

    fun login(username: String, password: String): Observable<Boolean>

    fun getUserName() : String

    fun getPassword() : String

    fun setUserNameAndPassword(username: String, password: String)

}