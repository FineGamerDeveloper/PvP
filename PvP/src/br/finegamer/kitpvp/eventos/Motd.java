package br.finegamer.kitpvp.eventos;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class Motd implements Listener {
	
	public static String onMotd = "§3§lPVP §7- §fVenha jogar em nosso Servidor!\n§6§lNEW §fNovo plugin de PvP!";
	
	@EventHandler
	public void onMotd(final ServerListPingEvent e) {
		e.setMaxPlayers(2020);
		e.setMotd(onMotd);
		
	}
	   
}