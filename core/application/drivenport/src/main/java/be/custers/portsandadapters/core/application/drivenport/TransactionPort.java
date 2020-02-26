package be.custers.portsandadapters.core.application.drivenport;

public interface TransactionPort {

    void executeInTransaction(Runnable runnable);
}
