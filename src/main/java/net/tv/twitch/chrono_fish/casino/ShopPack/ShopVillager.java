package net.tv.twitch.chrono_fish.casino.ShopPack;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ShopVillager {

    Inventory shopInv;
    Villager shopVillager;
    Component invName = Component.text("casino shop");

    public ShopVillager(Villager shopVillager){
        this.shopVillager = shopVillager;
        this.shopInv = Bukkit.createInventory(shopVillager,27,invName);

        shopVillager.customName(Component.text("casino shop"));
        shopVillager.setCustomNameVisible(true);

        this.shopInv.setItem(11, new ItemStack(Material.BREAD));
    }

    public ShopVillager(Location location){
        this.shopVillager = (Villager) location.getWorld().spawnEntity(location, EntityType.VILLAGER);
        this.shopInv = Bukkit.createInventory(shopVillager,27,invName);
        shopVillager.customName(Component.text("casino shop"));
        shopVillager.setCustomNameVisible(true);
    }

    public Inventory getShopInv(){
        return shopInv;
    }
}
