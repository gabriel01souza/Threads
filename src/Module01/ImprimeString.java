package Module01;

public class ImprimeString implements Runnable {

    /**
     *  tested logging this message in another thread
     */
    public void run() {
        System.out.println("Log da nova THREAD");
    }
}
