package org.main.thebebra.util;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.main.thebebra.commands.TestCommand;

public class Registry {
    public static void RegisterMod() {
        registerCommands();
    }
    private static void registerCommands() {
        CommandRegistrationCallback.EVENT.register(TestCommand::register);
    }
}
