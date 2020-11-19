package me.wackee.librarian.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class lbCommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player){
            Player player = (Player) sender;

            Inventory adminGUI = Bukkit.createInventory(player, 9, ChatColor.AQUA + "Enchantment Library - Admin");

            ItemStack tool = new ItemStack(Material.DIAMOND_PICKAXE);
            ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
            ItemStack bow = new ItemStack(Material.BOW);
            ItemStack armor = new ItemStack(Material.DIAMOND_CHESTPLATE);
            ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
            ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
            ItemStack frod = new ItemStack(Material.FISHING_ROD);
            ItemStack trident = new ItemStack(Material.TRIDENT);
            ItemStack misc = new ItemStack(Material.ENCHANTED_BOOK);

            ItemMeta tool_meta = tool.getItemMeta();
            tool_meta.setDisplayName(ChatColor.BLUE + "Tool Enchantments");
            ArrayList<String> tool_lore = new ArrayList<>();
            tool_lore.add(ChatColor.GOLD + "Show all available tool enchantments");
            tool_meta.setLore(tool_lore);
            tool.setItemMeta(tool_meta);
            
            ItemMeta sword_meta = sword.getItemMeta();
            sword_meta.setDisplayName(ChatColor.BLUE + "Sword Enchantments");
            ArrayList<String> sword_lore = new ArrayList<>();
            sword_lore.add(ChatColor.GOLD + "Show all available sword enchantments");
            sword_meta.setLore(sword_lore);
            sword.setItemMeta(sword_meta);
            
            ItemMeta bow_meta = bow.getItemMeta();
            bow_meta.setDisplayName(ChatColor.BLUE + "Bow Enchantments");
            ArrayList<String> bow_lore = new ArrayList<>();
            bow_lore.add(ChatColor.GOLD + "Show all available bow enchantments");
            bow_meta.setLore(bow_lore);
            bow.setItemMeta(bow_meta);

            ItemMeta armor_meta = armor.getItemMeta();
            armor_meta.setDisplayName(ChatColor.BLUE + "Armor Enchantments");
            ArrayList<String> armor_lore = new ArrayList<>();
            armor_lore.add(ChatColor.GOLD + "Show all available armor enchantments");
            armor_meta.setLore(armor_lore);
            armor.setItemMeta(armor_meta);

            ItemMeta helmet_meta = helmet.getItemMeta();
            helmet_meta.setDisplayName(ChatColor.BLUE + "Helmet Enchantments");
            ArrayList<String> helmet_lore = new ArrayList<>();
            helmet_lore.add(ChatColor.GOLD + "Show all available helmet enchantments");
            helmet_meta.setLore(helmet_lore);
            helmet.setItemMeta(helmet_meta);

            ItemMeta boots_meta = boots.getItemMeta();
            boots_meta.setDisplayName(ChatColor.BLUE + "Boots Enchantments");
            ArrayList<String> boots_lore = new ArrayList<>();
            boots_lore.add(ChatColor.GOLD + "Show all available boots enchantments");
            boots_meta.setLore(boots_lore);
            boots.setItemMeta(boots_meta);

            ItemMeta frod_meta = frod.getItemMeta();
            frod_meta.setDisplayName(ChatColor.BLUE + "Fishing Rod Enchantments");
            ArrayList<String> frod_lore = new ArrayList<>();
            frod_lore.add(ChatColor.GOLD + "Show all available Fishing Rod enchantments");
            frod_meta.setLore(frod_lore);
            frod.setItemMeta(frod_meta);

            ItemMeta trident_meta = trident.getItemMeta();
            trident_meta.setDisplayName(ChatColor.BLUE + "Trident Enchantments");
            ArrayList<String> trident_lore = new ArrayList<>();
            trident_lore.add(ChatColor.GOLD + "Show all available trident enchantments");
            trident_meta.setLore(trident_lore);
            trident.setItemMeta(trident_meta);

            ItemMeta misc_meta = misc.getItemMeta();
            misc_meta.setDisplayName(ChatColor.BLUE + "Miscellaneous Enchantments");
            ArrayList<String> misc_lore = new ArrayList<>();
            misc_lore.add(ChatColor.GOLD + "Show all available miscellaneous enchantments");
            misc_meta.setLore(misc_lore);
            misc.setItemMeta(misc_meta);


            ItemStack[] menu_items = {tool, sword, bow, armor, helmet, boots, frod, trident, misc};
            adminGUI.setContents(menu_items);



            player.openInventory(adminGUI);
        }
        return true;
    }
}
