package org.main.thebebra.commands;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;

public class TestCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, CommandRegistryAccess commandRegistryAccess, CommandManager.RegistrationEnvironment registrationEnvironment) {
        dispatcher.register(CommandManager.literal("thebebra")
                                    .then(CommandManager.literal("test")
                                                  .executes(TestCommand::run)));
    }
    public static int run(CommandContext<ServerCommandSource> context) {
        System.out.println("test success");
        return Command.SINGLE_SUCCESS; // Успех
    }
}
