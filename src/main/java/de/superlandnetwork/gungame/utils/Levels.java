//   ___                  ___                      
//  / __|  _  _   _ _    / __|  __ _   _ __    ___ 
// | (_ | | || | | ' \  | (_ | / _` | | '  \  / -_)
//  \___|  \_,_| |_||_|  \___| \__,_| |_|_|_| \___|
//
// Copyright (C) Filli-IT (Einzelunternehmen) & Ursin Filli - All Rights Reserverd
// Unauthorized copying of the this file, via any medium is strictly prohibited
// Proprietary and confidential
// Written by Ursin Filli <ursin.filli@Filli-IT.ch>

package de.superlandnetwork.gungame.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.superlandnetwork.gungame.Main;

public class Levels {

	public static void getItems(Player p) {
		int Levels = 1;
		if (Main.Levels.containsKey(p.getUniqueId()))
			Levels = Main.Levels.get(p.getUniqueId());
		p.getInventory().clear();
		if (Levels == 1) {
			ItemStack item = getItem(Material.WOOD_AXE);
			
			p.getInventory().setItem(0, item);
		} else if (Levels == 2) {
			ItemStack item = getItem(Material.WOOD_SWORD);
			
			p.getInventory().setItem(0, item);
		} else if (Levels == 3) {
			ItemStack item = getItem(Material.WOOD_SWORD);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
		} else if (Levels == 4) {
			ItemStack item = getItem(Material.WOOD_SWORD);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
		} else if (Levels == 5) {
			ItemStack item = getItem(Material.WOOD_SWORD);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
		} else if (Levels == 6) {
			ItemStack item = getItem(Material.WOOD_SWORD);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 7) {
			ItemStack item = getItem(Material.WOOD_AXE);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 8) {
			ItemStack item = getItem(Material.WOOD_SWORD);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 9) {
			ItemStack item = getItem(Material.WOOD_SWORD);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 10) {
			ItemStack item = getItem(Material.WOOD_SWORD);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 11) {
			ItemStack item = getItem(Material.WOOD_SWORD);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 12) {
			ItemStack item = getItem(Material.WOOD_SWORD);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 13) {
			ItemStack item = getItem(Material.GOLD_AXE);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 14) {
			ItemStack item = getItem(Material.GOLD_SWORD);
			ItemStack item2 = getItem(Material.LEATHER_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 15) {
			ItemStack item = getItem(Material.GOLD_SWORD);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.LEATHER_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 16) {
			ItemStack item = getItem(Material.GOLD_SWORD);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.LEATHER_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 17) {
			ItemStack item = getItem(Material.GOLD_SWORD);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.LEATHER_LEGGINGS);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 18) {
			ItemStack item = getItem(Material.GOLD_SWORD);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 19) {
			ItemStack item = getItem(Material.GOLD_AXE);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 20) {
			ItemStack item = getItem(Material.GOLD_SWORD);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 21) {
			ItemStack item = getItem(Material.GOLD_SWORD);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 22) {
			ItemStack item = getItem(Material.GOLD_SWORD);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 23) {
			ItemStack item = getItem(Material.GOLD_SWORD);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 24) {
			ItemStack item = getItem(Material.GOLD_SWORD);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 25) {
			ItemStack item = getItem(Material.STONE_AXE);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 26) {
			ItemStack item = getItem(Material.STONE_SWORD);
			ItemStack item2 = getItem(Material.GOLD_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 27) {
			ItemStack item = getItem(Material.STONE_SWORD);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.GOLD_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 28) {
			ItemStack item = getItem(Material.STONE_SWORD);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.GOLD_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 29) {
			ItemStack item = getItem(Material.STONE_SWORD);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.GOLD_LEGGINGS);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 30) {
			ItemStack item = getItem(Material.STONE_SWORD);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 31) {
			ItemStack item = getItem(Material.STONE_AXE);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 32) {
			ItemStack item = getItem(Material.STONE_SWORD);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 33) {
			ItemStack item = getItem(Material.STONE_SWORD);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 34) {
			ItemStack item = getItem(Material.STONE_SWORD);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 35) {
			ItemStack item = getItem(Material.STONE_SWORD);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 36) {
			ItemStack item = getItem(Material.STONE_SWORD);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 37) {
			ItemStack item = getItem(Material.IRON_AXE);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 38) {
			ItemStack item = getItem(Material.IRON_SWORD);
			ItemStack item2 = getItem(Material.CHAINMAIL_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 39) {
			ItemStack item = getItem(Material.IRON_SWORD);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.CHAINMAIL_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 40) {
			ItemStack item = getItem(Material.IRON_SWORD);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.CHAINMAIL_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 41) {
			ItemStack item = getItem(Material.IRON_SWORD);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 42) {
			ItemStack item = getItem(Material.IRON_SWORD);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 43) {
			ItemStack item = getItem(Material.IRON_AXE);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 44) {
			ItemStack item = getItem(Material.IRON_SWORD);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 45) {
			ItemStack item = getItem(Material.IRON_SWORD);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 46) {
			ItemStack item = getItem(Material.IRON_SWORD);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 47) {
			ItemStack item = getItem(Material.IRON_SWORD);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 48) {
			ItemStack item = getItem(Material.IRON_SWORD);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 49) {
			ItemStack item = getItem(Material.DIAMOND_AXE);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 50) {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.IRON_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 51) {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.IRON_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 52) {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.DIAMOND_BOOTS);
			ItemStack item4 = getItem(Material.IRON_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 53) {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.DIAMOND_BOOTS);
			ItemStack item4 = getItem(Material.DIAMOND_HELMET);
			ItemStack item5 = getItem(Material.IRON_LEGGINGS);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 54) {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.DIAMOND_BOOTS);
			ItemStack item4 = getItem(Material.DIAMOND_HELMET);
			ItemStack item5 = getItem(Material.DIAMOND_LEGGINGS);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 55) {
			ItemStack item = getItem(Material.DIAMOND_AXE);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.DIAMOND_BOOTS);
			ItemStack item4 = getItem(Material.DIAMOND_HELMET);
			ItemStack item5 = getItem(Material.DIAMOND_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 56) {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.DIAMOND_BOOTS);
			ItemStack item4 = getItem(Material.DIAMOND_HELMET);
			ItemStack item5 = getItem(Material.DIAMOND_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 57) {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.DIAMOND_BOOTS);
			ItemStack item4 = getItem(Material.DIAMOND_HELMET);
			ItemStack item5 = getItem(Material.DIAMOND_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 58) {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.DIAMOND_BOOTS);
			ItemStack item4 = getItem(Material.DIAMOND_HELMET);
			ItemStack item5 = getItem(Material.DIAMOND_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 59) {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.DIAMOND_BOOTS);
			ItemStack item4 = getItem(Material.DIAMOND_HELMET);
			ItemStack item5 = getItem(Material.DIAMOND_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else if (Levels == 60) {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.DIAMOND_BOOTS);
			ItemStack item4 = getItem(Material.DIAMOND_HELMET);
			ItemStack item5 = getItem(Material.DIAMOND_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		} else {
			ItemStack item = getItem(Material.DIAMOND_SWORD);
			ItemStack item2 = getItem(Material.DIAMOND_CHESTPLATE);
			ItemStack item3 = getItem(Material.DIAMOND_BOOTS);
			ItemStack item4 = getItem(Material.DIAMOND_HELMET);
			ItemStack item5 = getItem(Material.DIAMOND_LEGGINGS);
			ItemMeta meta = item.getItemMeta();
			meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			item.setItemMeta(meta);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item2.setItemMeta(meta2);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item3.setItemMeta(meta3);
			ItemMeta meta4 = item4.getItemMeta();
			meta4.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item4.setItemMeta(meta4);
			ItemMeta meta5 = item5.getItemMeta();
			meta5.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
			item5.setItemMeta(meta5);
			
			p.getInventory().setItem(0, item);
			p.getInventory().setChestplate(item2);
			p.getInventory().setBoots(item3);
			p.getInventory().setHelmet(item4);
			p.getInventory().setLeggings(item5);
		}
	}
	
	private static ItemStack getItem(Material mat) {
		ItemStack item = new ItemStack(mat);
		ItemMeta meta = item.getItemMeta();
		meta.setUnbreakable(true);
		item.setItemMeta(meta);
		return item;
	}
	
}
