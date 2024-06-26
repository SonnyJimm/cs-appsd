package miu.cs425.demo.service;

import miu.cs425.demo.models.Appointment;
import miu.cs425.demo.repo.AppointementRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService implements IAppointmentService {
    private AppointementRepository appointementRepository;
    public AppointmentService(AppointementRepository appointementRepository) {
        this.appointementRepository = appointementRepository;
    }
    public Appointment save(Appointment appointment){
       return appointementRepository.save(appointment);
    }
    public List<Appointment> getAllAppointment(){
        return appointementRepository.findAll();
    }
}
