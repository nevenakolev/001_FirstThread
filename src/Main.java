/**
 * @author Nevena
 * @version 1.0, 30-09-2021
 *
 * What did you notice?
 *      - 20 runs => both threads run one after the other
 *      - 200 runs => the threads still run one afther the other, but rather alternative
 *      - 2.000 runs => the threads alternate more frequently
 *      - ...more runs lead to more alternation between the threads
 */

public class Main {
    public static void main(String[] args) {
        DatePrinter dp = new DatePrinter(); // runnable object
        Thread th1 = new Thread(dp); // parameter = runnable object

        CountPrinter cp = new CountPrinter();
        Thread th2 = new Thread(cp);

        // is needed so the threads can run
        th1.start();
        th2.start();
    }
}
