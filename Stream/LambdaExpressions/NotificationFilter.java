import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Alert {
    String type;
    Alert(String t) { type = t; }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(new Alert("CRITICAL"), new Alert("INFO"), new Alert("CRITICAL"));
        Predicate<Alert> filter = a -> a.type.equals("CRITICAL");
        List<Alert> result = alerts.stream().filter(filter).collect(Collectors.toList());
    }
}
