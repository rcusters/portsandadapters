package be.custers.portsandadapters.application;

import be.custers.portsandadapters.domain.port.Command;

public class SimpleCommandBus {

    private CommandHandlerRegistry commandHandlerRegistry;

    public void execute(Command command) {
        commandHandlerRegistry.getHandler(command).execute(command);
    }
}
