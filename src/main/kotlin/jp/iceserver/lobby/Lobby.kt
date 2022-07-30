package jp.iceserver.lobby

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

        registerListeners(
            PlayerJoin(), PlayerMove()
        )
    }
}