package jp.iceserver.lobby

import org.bukkit.plugin.java.JavaPlugin

class Lobby : JavaPlugin()
{
    companion object
    {
        lateinit var plugin: Lobby
    }

    override fun onEnable()
    {
        plugin = this
    }
}