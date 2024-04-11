package miu.cs425.demo;

import com.github.javafaker.Faker;
import miu.cs425.demo.models.Appointment;
import miu.cs425.demo.models.Dentist;
import miu.cs425.demo.models.Patient;
import miu.cs425.demo.models.Surgery;
import miu.cs425.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.time.ZoneId;

@SpringBootApplication
public class Lab6Application implements CommandLineRunner {
	@Autowired
	private Faker faker;
	@Autowired
	private AddressService addressService;
	@Autowired
	private AppointmentService appointmentService;
	@Autowired
	private DentistService dentistService;
	@Autowired
	private PatientService patientService;
	@Autowired
	private SurgeryService surgeryService;
	public static void main(String[] args) {
		SpringApplication.run(Lab6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// CREATE patients first
		Patient patient1 = patientService.save(new Patient("P100","Gillian","White",faker.phoneNumber().phoneNumber(),faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()
		).toLocalDate(),0.0,addressService.getFakeAddress()));
		Patient patient2 = patientService.save(new Patient("P105","Jill","Bell",faker.phoneNumber().phoneNumber(),faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()
		).toLocalDate(),0.0,addressService.getFakeAddress()));
		Patient patient3 = patientService.save(new Patient("P108","Ian","McKay",faker.phoneNumber().phoneNumber(),faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()
		).toLocalDate(),0.0,addressService.getFakeAddress()));
		Patient patient4 = patientService.save(new Patient("P110","John","Walker",faker.phoneNumber().phoneNumber(),faker.date().birthday().toInstant().atZone(ZoneId.systemDefault()
		).toLocalDate(),0.0,addressService.getFakeAddress()));

		Dentist dentist1 = dentistService.save(new Dentist("Tony","Smith",faker.phoneNumber().phoneNumber(),faker.internet().emailAddress(),"Root Canal"));
		Dentist dentist2 = dentistService.save(new Dentist("Helen","Pearson",faker.phoneNumber().phoneNumber(),faker.internet().emailAddress(),"Orthodontist"));
		Dentist dentist3 = dentistService.save(new Dentist("Robin","Plevin",faker.phoneNumber().phoneNumber(),faker.internet().emailAddress(),"Oral Surgeon"));

		Surgery surgery1 = surgeryService.save(new Surgery("S15","Veneer",addressService.getFakeAddress()));
		Surgery surgery2 = surgeryService.save(new Surgery("S10","Root Canal Therapy",addressService.getFakeAddress()));

		Appointment appointment1 = appointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient1,surgery2,dentist1));
		Appointment appointment2 = appointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient2,surgery2,dentist1));
		Appointment appointment3 = appointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient3,surgery1,dentist2));
		Appointment appointment4 = appointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient3,surgery1,dentist2));
		Appointment appointment5 = appointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient2,surgery2,dentist3));
		Appointment appointment6 = appointmentService.save(new Appointment(LocalDateTime.now(),"Confirmed",patient4,surgery2,dentist3));
		appointmentService.getAllAppointment().forEach(System.out::println);
	}

}
