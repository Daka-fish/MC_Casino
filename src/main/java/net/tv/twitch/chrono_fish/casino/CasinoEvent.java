package net.tv.twitch.chrono_fish.casino;

import io.papermc.paper.event.entity.EntityMoveEvent;
import net.tv.twitch.chrono_fish.casino.ShopPack.ShopVillager;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class CasinoEvent implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEntityEvent e){
        if(e.getRightClicked() instanceof Villager){
            Villager villager = (Villager) e.getRightClicked();
            e.getPlayer().sendMessage("sasass");
            if(villager.customName().equals("casino shop")){
                e.setCancelled(true);
                e.getPlayer().openInventory(((ShopVillager)villager).getShopInv());
            }
        }
    }

    @EventHandler
    public void onShopMove(EntityMoveEvent e){
        if(e.getEntity() instanceof Villager){
            Villager villager = (Villager) e.getEntity();
            if(villager.customName().equals("casino shop")){
                e.setCancelled(true);
            }
        }
    }
}
