/*
 * ATTRIBUTE PLUGIN
 */

package org.ide.language.intel.manage.manager.untitled3;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public class AttributePlugin extends JavaPlugin {
            @Override public void onEnable() {
            getLogger().info("AttributePlugin has been enabled.");
            }  @Override public void onDisable() {
            getLogger().info("AttributePlugin has been disabled.");  }  @Override
            public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if (cmd.getName().equalsIgnoreCase("addstrength") 
        	&& sender instanceof Player) {    Player player = (Player) sender;          
            UUID modifierUUID = UUID.randomUUID();     
            AttributeModifier strengthModifier = new AttributeModifier(modifierUUID, "Strength", 2.0, AttributeModifier.Operation.ADD_NUMBER);
            player.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(strengthModifier);
            player.sendMessage("You now have increased strength!");
            return true; } return false; } }
