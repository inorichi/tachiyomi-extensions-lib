package eu.kanade.tachiyomi.network

import android.content.Context
import okhttp3.HttpUrl
import java.net.URI

class PersistentCookieStore(context: Context) {

        fun get(url: HttpUrl) : PersistentCookieStore = throw Exception("Stub!")

        fun get(uri: URI) : PersistentCookieStore = throw Exception("Stub!")

}