package org.kitteh.vanish.sniffers;

import net.minecraft.server.Packet;
import net.minecraft.server.Packet17EntityLocationAction;

import org.bukkit.entity.Player;
import org.kitteh.vanish.VanishManager;

public class Sniffer17EntityLocationAction extends Sniffer {

    public Sniffer17EntityLocationAction(VanishManager vanish) {
        super(vanish);
    }

    @Override
    public boolean checkPakkit(Player player, Packet packet) throws ClassCastException {
        return !this.vanish.shouldHide(player, ((Packet17EntityLocationAction) packet).a);
    }

}
