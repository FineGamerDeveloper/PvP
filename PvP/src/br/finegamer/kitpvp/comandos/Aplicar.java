package br.finegamer.kitpvp.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import br.finegamer.kitpvp.sistemas.CommandAPI;

public class Aplicar implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String label, final String[] args) {
		if (!(sender instanceof Player)) {
			System.out.println(CommandAPI.console);
			return true;
		}
		final Player p = (Player)sender;
		p.sendMessage("§a§lAPLICAÇÃO");
		p.sendMessage("§f");
		p.sendMessage("§8Aplicação em breve!");
		return false;
	}

}
