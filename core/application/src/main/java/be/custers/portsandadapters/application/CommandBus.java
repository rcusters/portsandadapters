package be.custers.portsandadapters.application;

@FunctionalInterface
public interface CommandBus {

    void execute(Command command);
}
