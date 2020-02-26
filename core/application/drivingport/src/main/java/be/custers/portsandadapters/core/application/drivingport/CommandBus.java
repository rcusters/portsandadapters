package be.custers.portsandadapters.core.application.drivingport;

@FunctionalInterface
public interface CommandBus {

    void execute(Command command);
}
