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

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import de.superlandnetwork.API.PlayerAPI.PermEnum;
import de.superlandnetwork.API.PlayerAPI.PlayerAPI;
import de.superlandnetwork.API.StatsAPI.StatsAPI;
import de.superlandnetwork.API.StatsAPI.StatsEnum;
import de.superlandnetwork.gungame.Main;
import de.superlandnetwork.gungame.utils.Levels;
import net.minecraft.server.v1_12_R1.PacketPlayInClientCommand;
import net.minecraft.server.v1_12_R1.PacketPlayInClientCommand.EnumClientCommand;

public class DeathListener implements Listener {

	@EventHandler
	public void onDeath(PlayerDeathEvent e) {
		Player p = e.getEntity();
		e.setDeathMessage(null);
		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
			public void run()
			{
				PacketPlayInClientCommand packet = new PacketPlayInClientCommand(EnumClientCommand.PERFORM_RESPAWN);
				((CraftPlayer)p).getHandle().playerConnection.a(packet);
			}
		}, 1);
		e.setKeepInventory(true);
		if (e.getEntity().getKiller() == null) {
			p.sendMessage("§7[§eGunGame§7] §7Du §7bist §7gestorben.");
			StatsAPI sapi = new StatsAPI(p.getUniqueId());
			sapi.setStates(StatsEnum.GUNGAME_DEATHS, Main.Deaths.get(p.getUniqueId()) + 1);
			Main.Deaths.replace(p.getUniqueId(), Main.Deaths.get(p.getUniqueId()) + 1);
			if (Main.Levels.containsKey(p.getUniqueId())) {
				int i = Main.Levels.get(p.getUniqueId());
				if(i > 1)
					i--;
				Main.Levels.replace(p.getUniqueId(), i);
			} else {
				Main.Levels.put(p.getUniqueId(), 1);
			}
		} else {
			PlayerAPI pAPI = new PlayerAPI(p.getUniqueId());
			PlayerAPI kAPI = new PlayerAPI(e.getEntity().getKiller().getUniqueId());
			if(Main.getInstance().NickedPlayers.contains(e.getEntity().getKiller().getUniqueId())) {
				p.sendMessage("§7[§3KnockbackFFA§7] §7Du §7wurdest §7von " + PermEnum.SPIELER.getTabList() + e.getEntity().getKiller().getName() + " §7getötet.");
			} else {
				p.sendMessage("§7[§3KnockbackFFA§7] §7Du §7wurdest §7von " + kAPI.getTabPrefix() + " §7getötet.");
			}
			if(Main.getInstance().NickedPlayers.contains(p.getUniqueId())) {
				e.getEntity().getKiller().sendMessage("§7[§3KnockbackFFA§7] §7Du §7hast " + PermEnum.SPIELER.getTabList() + p.getName() + " §7getötet.");
			} else {
				e.getEntity().getKiller().sendMessage("§7[§3KnockbackFFA§7] §7Du §7hast " + pAPI.getTabPrefix() + " §7getötet.");
			}
			if (Main.Levels.containsKey(p.getUniqueId())) {
				int i = Main.Levels.get(p.getUniqueId());
				if(i > 1)
					i--;
				Main.Levels.replace(p.getUniqueId(), i);
			} else {
				Main.Levels.put(p.getUniqueId(), 1);
			}
			if (Main.Levels.containsKey(e.getEntity().getKiller().getUniqueId())) {
				int i = Main.Levels.get(e.getEntity().getKiller().getUniqueId());
					i++;
				Main.Levels.replace(e.getEntity().getKiller().getUniqueId(), i);
			} else {
				Main.Levels.put(e.getEntity().getKiller().getUniqueId(), 1);
			}
			PlayerAPI api = new PlayerAPI(e.getEntity().getKiller().getUniqueId());
			api.addCoins(20);
			StatsAPI sapi = new StatsAPI(p.getUniqueId());
			sapi.setStates(StatsEnum.GUNGAME_DEATHS, Main.Deaths.get(p.getUniqueId()) + 1);
			Main.Deaths.replace(p.getUniqueId(), Main.Deaths.get(p.getUniqueId()) + 1);
			StatsAPI sapi2 = new StatsAPI(e.getEntity().getKiller().getUniqueId());
			sapi2.setStates(StatsEnum.GUNGAME_KILLS, Main.Kills.get(e.getEntity().getKiller().getUniqueId()) + 1);
			Main.Kills.replace(e.getEntity().getKiller().getUniqueId(), Main.Kills.get(e.getEntity().getKiller().getUniqueId()) + 1);
			//----------------
			e.getEntity().getKiller().playSound(e.getEntity().getKiller().getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 10F, 1F);
		}
		Levels.getItems(p);
		Main.SetScorbord(p);
		Main.SetScorbord(e.getEntity().getKiller());
	}
	
	@EventHandler
	public void onRespawn(PlayerRespawnEvent e){
		e.setRespawnLocation(Main.Spawn);
		Levels.getItems(e.getPlayer());
	}
	
}
