import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();

    public DatePrinter() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Current time and date: " + sdf.format(date));
        }
    }

    @Override
    public void run() {

    }
}
