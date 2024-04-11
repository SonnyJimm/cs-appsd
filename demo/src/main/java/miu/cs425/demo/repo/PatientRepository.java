package miu.cs425.demo.repo;

import miu.cs425.demo.models.Appointment;
import miu.cs425.demo.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {
}
