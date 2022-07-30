package jp.iceserver.lobby

class Lobby : AbstractLobby()
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