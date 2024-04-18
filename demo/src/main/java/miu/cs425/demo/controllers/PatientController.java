package miu.cs425.demo.controllers;

import miu.cs425.demo.models.Patient;
import miu.cs425.demo.service.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/adsweb/api/v1/patient")
public class PatientController {
    private PatientService patientService;
    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }
    @GetMapping("/list")
    public List<Patient> patientList(){
        return patientService.getAll();
    }
}
