package be.custers.portsandadapters.application;

import be.custers.portsandadapters.domain.port.Command;

public interface CommandHandler<COMMAND extends Command> {
    void execute(COMMAND command);
}
