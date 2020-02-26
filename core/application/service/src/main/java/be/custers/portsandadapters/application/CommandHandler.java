package be.custers.portsandadapters.application;

import be.custers.portsandadapters.core.application.drivingport.Command;

public interface CommandHandler<COMMAND extends Command> {
    void execute(COMMAND command);
}
