package Module07;

public class DBMain {

    /**
     *  Understanding DEADLOCK, how does it work?
     */
    public static void main(String[] args) {
        TransactionManager tx = new TransactionManager();
        PoolConnection pool = new PoolConnection();
        System.out.println("Starting");
        // Simulating a LOCK between transactions/threads...
        new Thread(new TaskAccessDb(pool, tx)).start();
        new Thread(new TaskAccessDbProcedure(pool, tx)).start();
    }
}
