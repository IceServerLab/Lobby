package jp.iceserver.lobby.config

import hazae41.minecraft.kutils.bukkit.PluginConfigFile

object MainConfig : PluginConfigFile("config")
{
    var world by string("world")
}