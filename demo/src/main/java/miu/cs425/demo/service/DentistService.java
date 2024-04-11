package miu.cs425.demo.service;

import miu.cs425.demo.models.Dentist;
import miu.cs425.demo.repo.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DentistService {
    @Autowired
    private DentistRepository dentistRepository;
    public Dentist save(Dentist dentist){
        return dentistRepository.save(dentist);
    }
}
