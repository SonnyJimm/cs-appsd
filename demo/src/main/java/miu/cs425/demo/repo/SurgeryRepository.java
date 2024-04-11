package miu.cs425.demo.repo;

import miu.cs425.demo.models.Appointment;
import miu.cs425.demo.models.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery,Integer> {
}
