package br.finegamer.kitpvp.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import br.finegamer.kitpvp.sistemas.CommandAPI;

public class Tag implements CommandExecutor, Listener {

	public boolean onCommand(CommandSender sender, Command cmd, String label, final String[] args) {
		if (!(sender instanceof Player)) {
			System.out.println(CommandAPI.console);
			return true;
		}
		final Player p = (Player)sender;
		if (cmd.getLabel().equalsIgnoreCase("tag")) {
			if (args.length == 0) {
			return true;
			}
			if (!(p.hasPermission("tag.dono"))) {
			if (args[0].equalsIgnoreCase("dono")) {
				p.sendMessage("§7Sua tag foi alterada para §4Dono");
				p.setDisplayName("§4§lDONO §4" + p.getName());
				p.setPlayerListName("§4" + p.getName());
				return true;
				
			}
			else {
				p.sendMessage("§cVoce nao tem a tag DONO");
			}
		}
			if (!(p.hasPermission("tag.admin"))) {
				if (args[0].equalsIgnoreCase("admin")) {
					p.sendMessage("§7Sua tag foi alterada para §cAdmininstrador");
					p.setDisplayName("§c§lADMIN §c" + p.getName());
					p.setPlayerListName("§c" + p.getName());
					return true;
					
				}
				else {
					p.sendMessage("§cVoce nao tem a tag ADMININSTRADOR");
				}
			}
			if (!(p.hasPermission("tag.mod"))) {
				if (args[0].equalsIgnoreCase("mod")) {
					p.sendMessage("§7Sua tag foi alterada para §5MODERADOR");
					p.setDisplayName("§5§lMOD §5" + p.getName());
					p.setPlayerListName("§5" + p.getName());
					return true;
					
				}
				else {
					p.sendMessage("§cVoce nao tem a tag MODERADOR");
				}
			}
			if (!(p.hasPermission("tag.trial"))) {
				if (args[0].equalsIgnoreCase("trial")) {
					p.sendMessage("§7Sua tag foi alterada para §dTrialModerador");
					p.setDisplayName("§d§lTRIAL §d" + p.getName());
					p.setPlayerListName("§d" + p.getName());
					return true;
					
				}
				else {
					p.sendMessage("§cVoce nao tem a tag TRIAL-MODERADOR");
				}
			}
			if (!(p.hasPermission("tag.membro"))) {
				if (args[0].equalsIgnoreCase("membro")) {
					p.sendMessage("§7Sua tag foi alterada para §7Membro");
					p.setDisplayName("§7" + p.getName());
					p.setPlayerListName("§7" + p.getName());
					return true;
					
				}
				else {
					p.sendMessage("§cVoce nao tem a tag MEMBRO");
				}
			}
			return false;
		}
		if (!(p.hasPermission("tag.dono"))) {
			p.sendMessage("§eSuas tags: §4§lDONO");
			
		}
		if (!(p.hasPermission("tag.admin"))) {
			p.sendMessage("§eSuas tags: §c§lADMININSTRADOR");
			
		}
		if (!(p.hasPermission("tag.mod"))) {
			p.sendMessage("§eSuas tags: §5§lMOD");
			
		}
		if (!(p.hasPermission("tag.trial"))) {
			p.sendMessage("§eSuas tags: §d§lTRIAL MODERADOR");
			
		}
		if (!(p.hasPermission("tag.membro"))) {
			p.sendMessage("§eSuas tags: §7§lMEMBRO");
			
		}
		return false;
	}

}
