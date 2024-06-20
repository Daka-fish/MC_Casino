package net.tv.twitch.chrono_fish.casino;

import net.tv.twitch.chrono_fish.casino.ShopPack.ShopVillager;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CasinoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if(sender instanceof Player){
            Player snd = (Player) sender;
            Location sndLoc = snd.getLocation();

            if(command.getName().equalsIgnoreCase("shop")){
                new ShopVillager((sndLoc));
                snd.sendMessage("You summon a villager at ["+sndLoc.x()+", "+sndLoc.y()+", "+sndLoc.z()+"]");
            }
        }
        return false;
    }
}
