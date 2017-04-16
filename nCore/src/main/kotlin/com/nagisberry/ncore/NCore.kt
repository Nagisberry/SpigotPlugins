package com.nagisberry.ncore

import com.google.gson.Gson
import org.bukkit.plugin.java.JavaPlugin
import java.io.Reader

class NCore: JavaPlugin() {

    companion object {
        val gson = Gson()

        inline fun <reified T: Any> Gson.fromJson(reader: Reader): T = fromJson(reader, T::class.java)
        inline fun <reified T: Any> Gson.fromJson(string: String): T = fromJson(string, T::class.java)
    }

}