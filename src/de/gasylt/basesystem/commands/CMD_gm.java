package de.gasylt.basesystem.commands;

import de.gasylt.basesystem.data.Data;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_gm implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if(strings.length == 1) {
                if(player.hasPermission("gbs.gm.self")) {
                    int gameMode = Integer.valueOf(strings[0]);

                    switch (gameMode) {
                        case 0:
                            player.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage(Data.getPrefix() + "§aGamemode geändert!");
                            break;
                        case 1:
                            player.setGameMode(GameMode.CREATIVE);
                            player.sendMessage(Data.getPrefix() + "§aGamemode geändert!");
                            break;
                        case 2:
                            player.setGameMode(GameMode.ADVENTURE);
                            player.sendMessage(Data.getPrefix() + "§aGamemode geändert!");
                            break;
                        case 3:
                            player.setGameMode(GameMode.SPECTATOR);
                            player.sendMessage(Data.getPrefix() + "§aGamemode geändert!");
                            break;
                        default:
                            player.sendMessage(Data.getPrefix() + "§cDiesen Gamemode gibt es nicht!");
                            break;
                    }
                } else {
                    player.sendMessage(Data.getPrefix() + "§cDazu hast du keine Berechtigung!");
                }
            }

            if(strings.length == 2) {
                if(player.hasPermission("gbs.gm.other")) {
                    Player target = Bukkit.getPlayer(strings[1]);

                    int gameMode = Integer.valueOf(strings[0]);

                    switch (gameMode) {
                        case 0:
                            target.setGameMode(GameMode.SURVIVAL);
                            player.sendMessage(Data.getPrefix() + "§aGamemode von " + target.getDisplayName() + " geändert!");
                            break;
                        case 1:
                            target.setGameMode(GameMode.CREATIVE);
                            player.sendMessage(Data.getPrefix() + "§aGamemode von " + target.getDisplayName() + " geändert!");
                            break;
                        case 2:
                            target.setGameMode(GameMode.ADVENTURE);
                            player.sendMessage(Data.getPrefix() + "§aGamemode von " + target.getDisplayName() + " geändert!");
                            break;
                        case 3:
                            target.setGameMode(GameMode.SPECTATOR);
                            player.sendMessage(Data.getPrefix() + "§aGamemode von " + target.getDisplayName() + " geändert!");
                            break;
                        default:
                            player.sendMessage(Data.getPrefix() + "§cDiesen Gamemode gibt es nicht!");
                            break;
                    }
                } else {
                    player.sendMessage(Data.getPrefix() +  "§cDazu hast du keine Berechtigung!");
                }
            }
        } else {
            Data.log(Data.getOnlyPlayerMsg());
        }

        return false;
    }
}
