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

import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import de.superlandnetwork.API.PlayerAPI.PermEnum;
import de.superlandnetwork.API.PlayerAPI.PlayerAPI;
import de.superlandnetwork.gungame.Main;
 
public class ChatListener implements Listener {

	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		UUID UUID = p.getUniqueId();
		e.setMessage(ChatColor.translateAlternateColorCodes('&', e.getMessage()));
		PlayerAPI api = new PlayerAPI(UUID);
		if(Main.getInstance().NickedPlayers.contains(p.getUniqueId())) {
			e.setFormat(PermEnum.SPIELER.getPrefix() + p.getName() + "�f" + " �7: �f" + e.getMessage());
		} else {
			e.setFormat(api.getChatPrefix() + " �7: �f" + e.getMessage());
		}
	}

}
