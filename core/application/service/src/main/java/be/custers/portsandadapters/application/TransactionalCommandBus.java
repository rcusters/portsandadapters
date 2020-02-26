package be.custers.portsandadapters.application;

import be.custers.portsandadapters.core.application.drivenport.TransactionPort;
import be.custers.portsandadapters.core.application.drivingport.Command;
import be.custers.portsandadapters.core.application.drivingport.CommandBus;

public class TransactionalCommandBus implements CommandBus {

    private CommandHandlerRegistry commandHandlerRegistry;
    private TransactionPort transactionPort;

    public TransactionalCommandBus(CommandHandlerRegistry commandHandlerRegistry, TransactionPort transactionPort) {
        this.commandHandlerRegistry = commandHandlerRegistry;
        this.transactionPort = transactionPort;
    }

    public void execute(Command command) {
        transactionPort.executeInTransaction(() -> commandHandlerRegistry.getHandler(command).execute(command));
    }
}
