//   ___                  ___                      
//  / __|  _  _   _ _    / __|  __ _   _ __    ___ 
// | (_ | | || | | ' \  | (_ | / _` | | '  \  / -_)
//  \___|  \_,_| |_||_|  \___| \__,_| |_|_|_| \___|
//
// Copyright (C) Filli-IT (Einzelunternehmen) & Ursin Filli - All Rights Reserverd
// Unauthorized copying of the this file, via any medium is strictly prohibited
// Proprietary and confidential
// Written by Ursin Filli <ursin.filli@Filli-IT.ch>

package de.superlandnetwork.gungame.listener;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import de.superlandnetwork.API.StatsAPI.StatsAPI;
import de.superlandnetwork.API.StatsAPI.StatsEnum;
import de.superlandnetwork.gungame.Main;

public class MoveListener implements Listener{

	@EventHandler
	public void onMove(PlayerMoveEvent e){
		Player p = e.getPlayer();
		Block block = e.getTo().getBlock();
		if (block.getType() == Material.LAVA || block.getType() == Material.STATIONARY_LAVA || block.getType() == Material.WATER || block.getType() == Material.STATIONARY_WATER){
			
			p.teleport(Main.Spawn);
			p.setGameMode(GameMode.ADVENTURE);
			p.setFoodLevel(20);
			p.setHealth(20.0D);
			p.sendMessage("§7[§eGunGame§7] §7Du §7bist §7gestorben.");
			if (Main.Levels.containsKey(p.getUniqueId())) {
				int i = Main.Levels.get(p.getUniqueId());
				if(i > 1)
					i--;
				Main.Levels.replace(p.getUniqueId(), i);
			} else {
				Main.Levels.put(p.getUniqueId(), 1);
			}
			StatsAPI sapi = new StatsAPI(p.getUniqueId());
			sapi.setStates(StatsEnum.GUNGAME_DEATHS, Main.Deaths.get(p.getUniqueId()) + 1);
			Main.Deaths.replace(p.getUniqueId(), Main.Deaths.get(p.getUniqueId()) + 1);
		}
	}
	
}
