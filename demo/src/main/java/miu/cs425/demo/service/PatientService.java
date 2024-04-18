package miu.cs425.demo.service;

import miu.cs425.demo.models.Patient;
import miu.cs425.demo.repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements  IPatientService{
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient  save(Patient patient){
        return patientRepository.save(patient);
    }
    public List<Patient> getAll(){
        return patientRepository.findAll();
    }
}
