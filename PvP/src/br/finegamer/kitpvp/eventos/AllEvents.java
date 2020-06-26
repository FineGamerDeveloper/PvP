package br.finegamer.kitpvp.eventos;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class AllEvents implements Listener {
	
	@EventHandler
	public void join(final PlayerJoinEvent e) {
		final Player p = e.getPlayer();
		p.getInventory().setArmorContents(null);
		p.getInventory().clear();
		p.sendMessage("§a§lSERVIDOR");
		p.sendMessage("§f");
		p.sendMessage("§7Seja bem-vindo §a" + p.getName() + "§7!");
		e.setJoinMessage(null);
		p.getPlayer().getWorld().getSpawnLocation();
		p.setFireTicks(0);
		p.setFoodLevel(20);
		p.setHealth(20);
		p.setGameMode(GameMode.ADVENTURE);
		p.chat("/tag membro");
		
	}
	
	@EventHandler
	public void exit(final PlayerQuitEvent e) {
		final Player p = e.getPlayer();
		e.setQuitMessage(null);
		
	}
	
	@EventHandler
	public void respawn(final PlayerRespawnEvent e) {
		final Player p = e.getPlayer();
		p.setGameMode(GameMode.ADVENTURE);
		p.setHealth(20);
		p.setFireTicks(0);
		p.sendMessage("§6voce voltou para o spawn");
		p.getPlayer().getWorld().getSpawnLocation();
		p.setFoodLevel(20);
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void chat(final PlayerChatEvent e) {
		final Player p = e.getPlayer();
		if (!(e.getMessage().toUpperCase().startsWith("pl"))) {
			if (!(p.hasPermission("comando.use"))) {				
				
			}
			e.setMessage("§cComando bloqueado meu amiguinho.");
			
		}
	}
	
	@EventHandler
	public void chat2(final AsyncPlayerChatEvent e) {
		e.setFormat("" + e.getPlayer().getDisplayName() + "§7:§f " + e.getMessage());
	}
	
	@EventHandler
	public void drop(final PlayerDropItemEvent e) {
		final Player p = e.getPlayer();
		e.setCancelled(true);
	}

}
