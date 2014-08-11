package com.creepysheep.earthmod.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        //Create cfg obj from given cfg file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;
        try
        {
            //Load conf file
            configuration.load();

            //Read in props from cfg file
           configValue = configuration.get("ForgeCraft", "configValue", true, "This is and example cfg value").getBoolean(true);
        }
        catch (Exception e)
        {
            // Log except
        }
        finally
        {
            configuration.save();
        }
        System.out.println("Configuration test: " + configValue);

    }
}
