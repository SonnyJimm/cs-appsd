package miu.cs425.demo.service;

import miu.cs425.demo.models.Patient;
import miu.cs425.demo.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient  save(Patient patient){
        return patientRepository.save(patient);
    }
}
