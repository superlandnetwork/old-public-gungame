//   ___                  ___                      
//  / __|  _  _   _ _    / __|  __ _   _ __    ___ 
// | (_ | | || | | ' \  | (_ | / _` | | '  \  / -_)
//  \___|  \_,_| |_||_|  \___| \__,_| |_|_|_| \___|
//
// Copyright (C) Filli-IT (Einzelunternehmen) & Ursin Filli - All Rights Reserverd
// Unauthorized copying of the this file, via any medium is strictly prohibited
// Proprietary and confidential
// Written by Ursin Filli <ursin.filli@Filli-IT.ch>

package de.superlandnetwork.gungame;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import de.superlandnetwork.API.API;
import de.superlandnetwork.API.ServerAPI.Server;
import de.superlandnetwork.API.ServerAPI.ServerAPI;
import de.superlandnetwork.API.StatsAPI.StatsAPI;
import de.superlandnetwork.API.StatsAPI.StatsEnum;
import de.superlandnetwork.API.Utils.Nick;
import de.superlandnetwork.API.Utils.ScorbordManager;
import de.superlandnetwork.API.WorldAPI.WorldAPI;
import de.superlandnetwork.gungame.listener.ChatListener;
import de.superlandnetwork.gungame.listener.DamageListener;
import de.superlandnetwork.gungame.listener.DeathListener;
import de.superlandnetwork.gungame.listener.DisabledListener;
import de.superlandnetwork.gungame.listener.JoinListener;
import de.superlandnetwork.gungame.listener.MoveListener;

public class Main extends JavaPlugin {
	
	public static final Location Spawn = null;
	
	public List<UUID> NickedPlayers = new ArrayList<>();
	public HashMap<UUID, Nick> NickInstances = new HashMap<>();

	public static HashMap<UUID, Integer> Levels = new HashMap<>();
	
	private static Main instance;
		
	public static HashMap<UUID, Integer> Kills = new HashMap<>();
	public static HashMap<UUID, Integer> Deaths = new HashMap<>();
	
	public Server server;

	
	@Override
	public void onEnable() {
		Scoreboard bord = Bukkit.getScoreboardManager().getMainScoreboard();
		for(Team team : bord.getTeams()){
			team.unregister();
		}
		if (bord.getObjective("aaa") != null)
			bord.getObjective("aaa").unregister();
		instance = this;
		Bukkit.getPluginManager().registerEvents(new JoinListener(), this);
		Bukkit.getPluginManager().registerEvents(new DeathListener(), this);
		Bukkit.getPluginManager().registerEvents(new DisabledListener(), this);
		Bukkit.getPluginManager().registerEvents(new DamageListener(), this);
		Bukkit.getPluginManager().registerEvents(new MoveListener(), this);
		Bukkit.getPluginManager().registerEvents(new ChatListener(), this);
		GunGameCommand CMD = new GunGameCommand();
		getCommand("stats").setExecutor(CMD);
		/* GunGame1 */
		if(Bukkit.getWorld("GunGame1") != null)
			Bukkit.unloadWorld("GunGame1", true);
		WorldAPI w = new WorldAPI("GunGame1");
		w.createCleanWorld();
		Bukkit.getWorld("GunGame1").setAutoSave(false);
		Bukkit.getWorld("GunGame1").setThundering(false);
		Bukkit.getWorld("GunGame1").setStorm(false);
		Bukkit.getWorld("GunGame1").setTime(0L);
		Bukkit.getWorld("GunGame1").setGameRuleValue("doDaylightCycle", "false");
		Bukkit.getWorld("GunGame1").setGameRuleValue("announceAdvancements", "false");
		Bukkit.getWorld("GunGame1").setGameRuleValue("doFireTick", "false");//
		Bukkit.getWorld("GunGame1").setGameRuleValue("disableElytraMovementCheck", "true");
		Bukkit.getWorld("GunGame1").setGameRuleValue("doMobSpawning", "false");
		server = new Server(10, 1, 1, API.getInstance().ServerID, 1, true, 0, 20);
		new ServerAPI(server).update();
	}
	
	public void onDisable() {
		server.setOnline(false);
		new ServerAPI(server).update();
		Scoreboard bord = Bukkit.getScoreboardManager().getMainScoreboard();
		for(Team team : bord.getTeams()){
			team.unregister();
		}
		if (bord.getObjective("aaa") != null)
			bord.getObjective("aaa").unregister();
	}
	
	public static Main getInstance() {
		return instance;
	}
	
	public static void SetScorbord(Player p){
		Scoreboard bord = ScorbordManager.getScorebord(p);
		if(bord.getObjective("aaa") != null) {
			bord.getObjective("aaa").unregister();
		}
		StatsAPI sAPI = new StatsAPI(p.getUniqueId());
		if(!Kills.containsKey(p.getUniqueId()))
			Kills.put(p.getUniqueId(), sAPI.getStates(StatsEnum.KFFA_KILLS));
		if(!Deaths.containsKey(p.getUniqueId()))
			Deaths.put(p.getUniqueId(), sAPI.getStates(StatsEnum.KFFA_DEATHS));
		Objective score = bord.registerNewObjective("aaa", "dumy");
		score.setDisplayName("§eSuperLandNetwork§7.§bde");
		score.setDisplaySlot(DisplaySlot.SIDEBAR);
		score.getScore("    ").setScore(12);
		score.getScore("§6Kills:").setScore(11);
		score.getScore("§c" + Kills.get(p.getUniqueId())).setScore(10);
		score.getScore("   ").setScore(9);
		score.getScore("§6Tode:").setScore(8);
		score.getScore("§a" + Deaths.get(p.getUniqueId())).setScore(7);
		score.getScore("  ").setScore(6);
		score.getScore("§6K/D:").setScore(5);
		if(Kills.get(p.getUniqueId()) != 0 && Deaths.get(p.getUniqueId()) != 0) {
			double kd = (double) Kills.get(p.getUniqueId()) / (double) Deaths.get(p.getUniqueId());
			DecimalFormat twoDigit = new DecimalFormat("#,##0.00");
			kd = Double.valueOf(twoDigit.format(kd));
			score.getScore("§e" + kd).setScore(4);
		} else {
			score.getScore("§e" + 0.00).setScore(4);
		}
		score.getScore(" ").setScore(3);
		score.getScore("§6Map:").setScore(2);
		String MapName = "";
		score.getScore("§b" + MapName).setScore(1);
		p.setScoreboard(bord);
	}
	
}