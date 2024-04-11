package miu.cs425.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Integer id;
    private String patientNo;
    private String firstName;
    private String lastName;
    private String ContactNumber;
    private LocalDate dob;
    private Double totalBill;
    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public Patient(String patientNo, String firstName, String lastName, String contactNumber, LocalDate dob, Double totalBill, Address address) {
        this.patientNo = patientNo;
        this.firstName = firstName;
        this.lastName = lastName;
        ContactNumber = contactNumber;
        this.dob = dob;
        this.totalBill = totalBill;
        this.address = address;
    }
}
