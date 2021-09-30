import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();

    public DatePrinter() {

    }

    @Override
    public void run() {
        for (int i = 0; i < 200000; i++) {
            System.out.println("Current time and date: " + sdf.format(date));
        }
    }
}
