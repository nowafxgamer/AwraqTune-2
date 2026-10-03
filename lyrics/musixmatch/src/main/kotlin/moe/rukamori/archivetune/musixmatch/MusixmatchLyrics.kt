package moe.rukamori.archivetune.musixmatch

import moe.rukamori.archivetune.paxsenix.PaxsenixLyrics

object MusixmatchLyrics {
    suspend fun getLyrics(
        title: String,
        artist: String,
        durationSeconds: Int,
    ): Result<String> = PaxsenixLyrics.getMusixmatchLyrics(title, artist, durationSeconds)
}