abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setPatientId(int patientId) { this.patientId = patientId; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void getPatientDetails() {
        System.out.println(patientId + " " + name + " " + age);
    }
    public abstract double calculateBill();
}
interface MedicalRecord {
    void addRecord(String record);
    String viewRecords();
}
class InPatient extends Patient implements MedicalRecord {
    private String records = "";
    public InPatient(int patientId, String name, int age) {
        super(patientId, name, age);
    }
    public double calculateBill() { return getAge() * 1000; }
    public void addRecord(String record) { records += record; }
    public String viewRecords() { return records; }
}
class OutPatient extends Patient implements MedicalRecord {
    private String records = "";
    public OutPatient(int patientId, String name, int age) {
        super(patientId, name, age);
    }
    public double calculateBill() { return getAge() * 500; }
    public void addRecord(String record) { records += record; }
    public String viewRecords() { return records; }
}
public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "P1", 30),
            new OutPatient(2, "P2", 25)
        };
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println(p.calculateBill());
        }
    }
}
