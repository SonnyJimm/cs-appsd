package miu.cs425.demo.repo;

import miu.cs425.demo.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointementRepository extends JpaRepository<Appointment,Integer> {
}
