import java.text.SimpleDateFormat;
import java.util.Date;
interface DateFormatter {
    static String format(Date d, String f) {
        return new SimpleDateFormat(f).format(d);
    }
}