public class CountPrinter implements Runnable {
    public CountPrinter() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Count: " + i);
        }
    }

    @Override
    public void run() {

    }
}
