package Module07;

public class TaskAccessDb implements Runnable {

    private PoolConnection pool;
    private final TransactionManager tx;

    public TaskAccessDb(PoolConnection pool, TransactionManager tx) {
        this.pool = pool;
        this.tx = tx;
    }

    public void run() {
        synchronized (pool) {
            System.out.println("I got the connnection");
            pool.getConnection();
            synchronized (tx) {
                System.out.println("Starting the tx");
                tx.begin();
            }
        }
    }
}
