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
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;
import org.bukkit.event.player.PlayerQuitEvent;

import de.superlandnetwork.API.PlayerAPI.PermEnum;
import de.superlandnetwork.API.PlayerAPI.PlayerAPI;
import de.superlandnetwork.API.ServerAPI.ServerAPI;
import de.superlandnetwork.API.StatsAPI.StatsAPI;
import de.superlandnetwork.API.StatsAPI.StatsEnum;
import de.superlandnetwork.API.Utils.Nick;
import de.superlandnetwork.API.Utils.Tablist;
import de.superlandnetwork.gungame.Main;
import de.superlandnetwork.gungame.utils.Levels;
import de.superlandnetwork.gungame.utils.Methods;

public class JoinListener implements Listener{

	@EventHandler
	public void onLogin(PlayerLoginEvent e) {
		PlayerAPI api = new PlayerAPI(e.getPlayer().getUniqueId());
		if(e.getResult() == Result.KICK_FULL) {
			if(!api.IsPlayerInGroup(1) && !api.IsPlayerInGroup(2) && !api.IsPlayerInGroup(3) && !api.IsPlayerInGroup(4))
				e.allow();
		}
		if(api.AutoNick()) {
			Nick nick = new Nick(e.getPlayer());
			if(nick.nick()) {
				//OK
				Main.getInstance().NickedPlayers.add(e.getPlayer().getUniqueId());
				Main.getInstance().NickInstances.put(e.getPlayer().getUniqueId(), nick);
			} else {
				//Nick Failded 1/3
				if(nick.nick()) {
					//OK
					Main.getInstance().NickedPlayers.add(e.getPlayer().getUniqueId());
					Main.getInstance().NickInstances.put(e.getPlayer().getUniqueId(), nick);
				} else {
					//Nick Failded 2/3
					if(nick.nick()) {
						//OK
						Main.getInstance().NickedPlayers.add(e.getPlayer().getUniqueId());
						Main.getInstance().NickInstances.put(e.getPlayer().getUniqueId(), nick);
					} else {
						//Nick Failed 3/3
					}
				}
			}
		}
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = e.getPlayer();
		Methods.RegisterTeams(p);
		if(Main.getInstance().NickedPlayers.contains(p.getUniqueId())) {
			p.sendMessage("§7[§5NICK§7] §4Du spielst als §e" + Main.getInstance().NickInstances.get(p.getUniqueId()).getNick());
			p.sendMessage(" ");
		}
		PlayerAPI api = new PlayerAPI(p.getUniqueId());
		if(Main.getInstance().NickedPlayers.contains(p.getUniqueId()))
			e.setJoinMessage("§a» " + PermEnum.SPIELER.getTabList() + p.getName() + " §7hat §7den §7Server §7betreten.");
		else
			e.setJoinMessage("§a» " + api.getTabPrefix() + " §7hat §7den §7Server §7betreten.");
		p.teleport(Main.Spawn);
		p.setGameMode(GameMode.ADVENTURE);
		p.setFoodLevel(20);
		p.setHealth(20.0D);
		new Tablist(p, "§eSuperLandNetwork.de Netzwerk §7- §aGunGame", "§7Teamspeak: §eTs.SuperLandNetwork.de \n §7Shop: §eShop.SuperLandNetwork.de");
		for(Player all : Bukkit.getOnlinePlayers()){
			Methods.setPrefix(all);
		}		
		Main.SetScorbord(p);
		StatsAPI sapi = new StatsAPI(p.getUniqueId());
		sapi.InsertUserInDB(StatsEnum.GUNGAME);
		Main.Deaths.put(p.getUniqueId(), sapi.getStates(StatsEnum.GUNGAME_DEATHS));
		Main.Kills.put(p.getUniqueId(), sapi.getStates(StatsEnum.GUNGAME_KILLS));
		Main.getInstance().server.setPlayers_Online(Bukkit.getOnlinePlayers().size());
		new ServerAPI(Main.getInstance().server).update();
		Levels.getItems(p);
	}
	
	@EventHandler
	public void onLeave(PlayerQuitEvent e){
		Player p = e.getPlayer();
		PlayerAPI api = new PlayerAPI(p.getUniqueId());
		if(Main.getInstance().NickedPlayers.contains(p.getUniqueId()))
			e.setQuitMessage("§c« " + PermEnum.SPIELER.getTabList() + p.getName() + " §7hat §7den §7Server §7verlassen.");
		else
			e.setQuitMessage("§c« " + api.getTabPrefix() + " §7hat §7den §7Server §7verlassen.");
		Main.Deaths.remove(p.getUniqueId());
		Main.Kills.remove(p.getUniqueId());
		if(Main.getInstance().NickedPlayers.contains(p.getUniqueId())) {
			Main.getInstance().NickedPlayers.remove(p.getUniqueId());
			Main.getInstance().NickInstances.remove(p.getUniqueId());
		}
		Main.getInstance().server.setPlayers_Online(Bukkit.getOnlinePlayers().size()-1);
		new ServerAPI(Main.getInstance().server).update();	
	}
	
}
