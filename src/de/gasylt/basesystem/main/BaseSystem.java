package de.gasylt.basesystem.main;

import de.gasylt.basesystem.commands.CMD_gm;
import de.gasylt.basesystem.data.Data;
import org.bukkit.plugin.java.JavaPlugin;

public class BaseSystem extends JavaPlugin {
    @Override
    public void onEnable() {
        Data.log("Base System gestartet!");
        Data.log("Version: " + Data.getVersion());

        this.getCommand("gm").setExecutor(new CMD_gm());
    }

    @Override
    public void onDisable() {

    }
}
