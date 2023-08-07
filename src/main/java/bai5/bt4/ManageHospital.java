package bai5.bt4;

public class ManageHospital {
    private Patient patient;
    private Doctor doctor;

    public ManageHospital(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "ManageHospital{" +
                "patient=" + patient +
                ", doctor=" + doctor +
                '}';
    }
}
