package miu.cs425.demo.service;

import miu.cs425.demo.models.Appointment;

import java.util.List;

public interface IAppointmentService {
    public Appointment save(Appointment appointment);
    public List<Appointment> getAllAppointment();
}
