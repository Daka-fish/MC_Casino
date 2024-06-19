package net.tv.twitch.chrono_fish.casino;

import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;

import java.util.UUID;

public class ShopVillager {

    private final UUID id;
    private final Location shopLoc;
    private final Villager villager;
    private final Inventory shopInv;
    private final Component invName;

    public ShopVillager(Location loc){
        id = UUID.randomUUID();
        shopLoc = loc;
        villager = shopLoc.getWorld().spawnEntity(shopLoc, EntityType.VILLAGER).
    }

}
