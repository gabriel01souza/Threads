package Module07;

public class TaskAccessDbProcedure implements Runnable {
    private final PoolConnection pool;
    private final TransactionManager tx;

    public TaskAccessDbProcedure(PoolConnection pool, TransactionManager tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        synchronized (tx) {
            System.out.println("Starting the tx");
            tx.begin();
            synchronized (pool) {
                System.out.println("I got the connection");
                pool.getConnection();
            }
        }
    }
}
