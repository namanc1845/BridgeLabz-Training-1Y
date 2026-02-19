abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private String record;

    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 5000; // Fixed admission charge
    }

    public void addRecord(String record) {
        this.record = record;
    }

    public void viewRecords() {
        System.out.println("Record: " + record);
    }
}

class OutPatient extends Patient {
    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 500; // Consultation fee
    }
}

public class HospitalMain {
    public static void main(String[] args) {
        Patient p = new InPatient(1, "Rahul", 30);
        System.out.println(p.getPatientDetails());
        System.out.println("Bill: " + p.calculateBill());
    }
}
