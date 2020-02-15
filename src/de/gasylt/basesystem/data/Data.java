package de.gasylt.basesystem.data;

import org.bukkit.Bukkit;

public class Data {
    private static String name = "System";
    private static String prefix = "§8[§6" + name + "§8] ";
    private static String version = "v0.0.1 GITHUB";
    private static boolean debug = false;

    private static String onlyPlayerMsg = "§cDu musst ein Spieler sein, um diesen Command ausführen zu können!";

    public static String getName() {
        return name;
    }

    public static String getPrefix() {
        return prefix;
    }

    public static String getVersion() {
        return version;
    }

    public static String getOnlyPlayerMsg() {
        return onlyPlayerMsg;
    }

    public static boolean isDebug() {
        return debug;
    }

    public static void log(String msg) {
        Bukkit.getConsoleSender().sendMessage(prefix + msg);
    }
}
