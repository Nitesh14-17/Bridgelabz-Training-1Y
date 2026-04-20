import java.util.*;

class Patient {
    String id;
    Patient(String i) { id = i; }
    String getId() { return id; }
}

public class PatientIdPrint {
    public static void main(String[] args) {
        List<Patient> list = Arrays.asList(new Patient("P1"), new Patient("P2"), new Patient("P3"));
        list.stream().map(Patient::getId).forEach(System.out::println);
    }
}
