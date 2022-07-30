package jp.iceserver.lobby.listeners

import jp.iceserver.lobby.config.MainConfig
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerMoveEvent

class PlayerMove : Listener
{
    @EventHandler
    fun onPlayerMove(e: PlayerMoveEvent)
    {
        val player = e.player

        if (player.location.block.type != Material.WATER) return

        val world = Bukkit.getWorld(MainConfig.world) ?: return
        player.teleport(world.spawnLocation)
    }
}