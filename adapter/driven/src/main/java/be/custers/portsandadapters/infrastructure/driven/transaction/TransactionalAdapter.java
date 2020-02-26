package be.custers.portsandadapters.infrastructure.driven.transaction;

import be.custers.portsandadapters.core.application.drivenport.TransactionPort;

public class TransactionalAdapter implements TransactionPort {

    @Override
    public void executeInTransaction(Runnable runnable) {
        //start a spring transaction over here
    }
}
