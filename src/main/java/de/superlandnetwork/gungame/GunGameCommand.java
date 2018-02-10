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

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.superlandnetwork.API.PlayerAPI.PlayerAPI;
import de.superlandnetwork.API.StatsAPI.StatsAPI;
import de.superlandnetwork.API.StatsAPI.StatsEnum;
import de.superlandnetwork.gungame.utils.Utils;

public class GunGameCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player))
			return true;
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("stats")) {
			
			StatsAPI api = new StatsAPI(p.getUniqueId());
			p.sendMessage("§9»§3 --§c ×§3 --§9 « §eStats §9»§3 --§c ×§3 --§9 «");
			int kills = api.getStates(StatsEnum.GUNGAME_KILLS);
			int deaths = api.getStates(StatsEnum.GUNGAME_DEATHS);
			if(kills != 0 && deaths != 0) {
				double kd = (double) kills / (double) deaths;
				DecimalFormat twoDigit = new DecimalFormat("#,##0.00");
				kd = Double.valueOf(twoDigit.format(kd));
				p.sendMessage("§9»§3 K§8/§3D§c " + kd);
			} else {
				p.sendMessage("§9»§3 K§8/§3D§c 0.00");
			}
			p.sendMessage("§9»§3 Rang§c " + Utils.getRank(p.getUniqueId()));
			p.sendMessage("§9»§3 Coins§c " + new PlayerAPI(p.getUniqueId()).getCoins());
			p.sendMessage("§9»§3 Tode§c " + deaths);
			p.sendMessage("§9»§3 Kills§c " + kills);
			p.sendMessage("§9»§3 --§c ×§3 --§9 « §eStats §9»§3 --§c ×§3 --§9 «");
		}
		return true;
	}
}