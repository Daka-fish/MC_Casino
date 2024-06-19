package net.tv.twitch.chrono_fish.casino.ShopPack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ShopItem {

    public ShopItem(Player player, ItemStack item){
        switch(item.getType()){
            case BREAD:
                player.sendMessage("you bought a bread");
                player.getInventory().addItem(new ItemStack(Material.BREAD));
                break;

            default:
                break;
        }
    }
}
