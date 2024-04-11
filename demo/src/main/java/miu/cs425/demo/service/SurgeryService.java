package miu.cs425.demo.service;

import miu.cs425.demo.models.Surgery;
import miu.cs425.demo.repo.SurgeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurgeryService {
    @Autowired
    private SurgeryRepository surgeryRepository;

    public Surgery save(Surgery surgery){
        return surgeryRepository.save(surgery);
    }
}
