package net.intercraftmc.killmeplz;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;




public class Main extends JavaPlugin implements Listener {
	int novotes = 0;
	int yesvotes = 0;
	boolean votesaccepted = false;
	String votemaker;
	

	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		
		System.out.println("Loaded killmeplz");
		
		
	}
	@Override
	public void onDisable() {
		System.out.println("Disabled killmeplz");
	}
	
	
	
	
	
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	
	
	
	
		if (cmd.getName().equals("kill")) {
			novotes = 0;
			yesvotes = 0;
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.setHealth(0.0D);

			
			
			
		}
		}
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		return false;
		
	}




}






