package jp.iceserver.lobby.listeners

import jp.iceserver.lobby.config.MainConfig
import org.bukkit.Bukkit
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class PlayerJoin : Listener
{
    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent)
    {
        val world = Bukkit.getWorld(MainConfig.world) ?: return
        e.player.teleport(world.spawnLocation)
    }
}