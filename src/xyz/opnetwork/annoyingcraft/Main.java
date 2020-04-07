package xyz.opnetwork.annoyingcraft;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("[AnnoyingCraft] BOOTING");
		System.out.println("[AnnoyingCraft] -------------------------------------------------------------");
		System.out.println("[AnnoyingCraft] Need support? Join https://discord.skaerf.xyz for assistance!");
		System.out.println("[AnnoyingCraft] -------------------------------------------------------------");
	}
	public void onDisable() {
		System.out.println("[AnnoyingCraft] SHUTTING DOWN");
	}

}
