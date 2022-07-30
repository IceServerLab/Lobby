package jp.iceserver.lobby

import hazae41.minecraft.kutils.bukkit.init
import jp.iceserver.lobby.config.MainConfig
import jp.iceserver.lobby.listeners.*

class Lobby : AbstractLobby()
{
    companion object
    {
        lateinit var plugin: Lobby
    }

    override fun onEnable()
    {
        plugin = this

        init(MainConfig)
        MainConfig.autoSave = true

        registerListeners(
            PlayerJoin(), PlayerMove()
        )
    }
}