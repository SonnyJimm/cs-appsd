package miu.cs425.demo.repo;

import miu.cs425.demo.models.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist,Integer> {

}
