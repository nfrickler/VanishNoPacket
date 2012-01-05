package org.kitteh.vanish.listeners;

import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;
import org.kitteh.vanish.VanishPerms;
import org.kitteh.vanish.VanishPlugin;

public class ListenPlayerJoinEarly extends PlayerListener {

    private final VanishPlugin plugin;

    public ListenPlayerJoinEarly(VanishPlugin instance) {
        this.plugin = instance;
    }

    @Override
    public void onPlayerJoin(PlayerJoinEvent event) {
        if (VanishPerms.silentJoin(event.getPlayer())) {
            this.plugin.getManager().toggleVanishQuiet(event.getPlayer());
            this.plugin.hooksVanish(event.getPlayer());
        }
    }
}
