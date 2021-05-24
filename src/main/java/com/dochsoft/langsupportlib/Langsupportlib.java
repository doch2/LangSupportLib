package com.dochsoft.langsupportlib;

import com.dochsoft.langsupportlib.command.AddItemLocalNameCommand;
import com.dochsoft.langsupportlib.config.LanguageConfig;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Langsupportlib extends JavaPlugin {
    private static Langsupportlib Instance;

    @Override
    public void onEnable() {
        getCommand("addItemLocalName").setExecutor(new AddItemLocalNameCommand());

        LanguageConfig.createCategoryCraftGuiConfig();

        Bukkit.getConsoleSender().sendMessage(Reference.prefix_normal + "플러그인이 §a활성화§r되었습니다. §r| 도치(doch1)");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage(Reference.prefix_normal + "플러그인이 §c비활성화§r되었습니다. §r| 도치(doch1)");
    }

    public static Langsupportlib getInstance() {
        return Instance;
    }
}
