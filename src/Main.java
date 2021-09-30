public class Main {
    public static void main(String[] args) {
        DatePrinter dp = new DatePrinter();
        Thread th1 = new Thread(dp);

        CountPrinter cp = new CountPrinter();
        Thread th2 = new Thread(cp);
    }
}
