package com.dochsoft.langsupportlib.config;

import com.dochsoft.langsupportlib.Langsupportlib;
import com.dochsoft.langsupportlib.Reference;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.HashMap;

public class LanguageConfig {
    public static FileConfiguration data;

    public static void createCategoryCraftGuiConfig() {
        Langsupportlib langsupportlib = Langsupportlib.getInstance();
        File file = new File(Reference.ConfigFolder + "lang/ko_kr.yml");
        File folder = new File(Reference.ConfigFolder);
        File folder1 = new File(Reference.ConfigFolder + "lang/");
        try {
            if (!file.exists()) {
                folder.mkdir();
                folder1.mkdir();
                file.createNewFile();
                langsupportlib.saveResource("lang/ko_kr.yml", true);
            }
        } catch (Exception localException) {}
    }

    public static void loadLocalLangFile() {
        File file = new File(Reference.ConfigFolder + "lang/ko_kr.yml");
        data = YamlConfiguration.loadConfiguration(file);

        HashMap<String, String> langItemNameHashMap = new HashMap();
        for (String key : data.getValues(false).keySet()) {
            langItemNameHashMap.put(key, (String) data.get(key));
        }

        Reference.langHashMapList.put("dd", langItemNameHashMap);
    }
}
