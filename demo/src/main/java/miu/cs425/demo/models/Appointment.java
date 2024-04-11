package miu.cs425.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Appointment {
    @Id
    @GeneratedValue
    private Integer id;
    private LocalDateTime appointmentDate;

    public Appointment(LocalDateTime appointmentDate, String state, Patient patient, Surgery surgery, Dentist dentist) {
        this.appointmentDate = appointmentDate;
        this.state = state;
        this.patient = patient;
        this.surgery = surgery;
        this.dentist = dentist;
    }

    private String state;

    @ManyToOne
    @JoinColumn(name = "patient_id", referencedColumnName = "id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "surgery_id", referencedColumnName = "id")
    private Surgery surgery;
    @ManyToOne
    @JoinColumn(name = "dentist_id", referencedColumnName = "id")
    private Dentist dentist;

    public String toString() {
        return "" + dentist.getFirstName() + " " + dentist.getLastName() + " " + patient.getPatientNo() + " "
                + patient.getFirstName() + " " + patient.getLastName() + " " + appointmentDate + " "
                + surgery.getSurgeryNo();
    }
}
