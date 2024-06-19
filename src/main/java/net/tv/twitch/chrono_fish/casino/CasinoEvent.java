package net.tv.twitch.chrono_fish.casino;

import io.papermc.paper.event.entity.EntityMoveEvent;
import net.kyori.adventure.text.Component;
import net.tv.twitch.chrono_fish.casino.ShopPack.ShopItem;
import net.tv.twitch.chrono_fish.casino.ShopPack.ShopVillager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class CasinoEvent implements Listener {

    private final Component casino_shop = Component.text("casino shop");

    @EventHandler
    public void onInteract(PlayerInteractEntityEvent e){
        if(e.getRightClicked() instanceof Villager){
            Villager villager = (Villager) e.getRightClicked();
            if(casino_shop.equals(villager.customName())){
                e.setCancelled(true);
                e.getPlayer().openInventory(new ShopVillager(villager).getShopInv());
            }
        }
    }

    @EventHandler
    public void onShopMove(EntityMoveEvent e){
        if(e.getEntity() instanceof Villager){
            Villager villager = (Villager) e.getEntity();
            if(casino_shop.equals(villager.customName())){
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onShop(InventoryClickEvent e){
        if(e.getView().title().equals(casino_shop)){
            e.setCancelled(true);
            ItemStack clickedItem = e.getCurrentItem();
            if(clickedItem == null || clickedItem.getType() == Material.AIR) return;
            new ShopItem((Player) e.getWhoClicked(),clickedItem);
            e.getWhoClicked().closeInventory();
        }
    }
}
