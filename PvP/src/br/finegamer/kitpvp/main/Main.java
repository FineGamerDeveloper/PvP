package br.finegamer.kitpvp.main;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import br.finegamer.kitpvp.comandos.Aplicar;
import br.finegamer.kitpvp.comandos.Tag;
import br.finegamer.kitpvp.eventos.AllEvents;
import br.finegamer.kitpvp.eventos.Motd;

public class Main extends JavaPlugin {
	
	public static Main instance;
	public static Main plugin;
	
	public static Main getInstance() {
		return instance;
	}
	
	public static Plugin getPlugin() {
		return (Plugin) plugin;
	}
	
	public void onLoad() {
		Bukkit.getConsoleSender().sendMessage("§e§lPVP §fO plugin está sendo carregado...");
	}
	
	public void onEnable() {
		instance = this;
		plugin = this;
		Bukkit.getConsoleSender().sendMessage("§a§lPVP §fO plugin foi carregado com sucesso.");
		this.Comandos();
		this.Eventos();
		
	}

	private void Eventos() {
		final PluginManager event = Bukkit.getPluginManager();		
		event.registerEvents((Listener)new Motd(), this);
		event.registerEvents((Listener)new AllEvents(), this);
		
	}

	private void Comandos() {
		getCommand("aplicar").setExecutor((CommandExecutor)new Aplicar());
		getCommand("tag").setExecutor((CommandExecutor)new Tag());
		
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§c§lPVP §fO plugin foi desativado.");
		for (Player all : Bukkit.getOnlinePlayers()) {
			all.kickPlayer("§3§lPVP§f\n \n§fO servidor está sendo reiniciado.");
		}
	}

}
