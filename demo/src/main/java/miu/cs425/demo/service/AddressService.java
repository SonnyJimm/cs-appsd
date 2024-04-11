package miu.cs425.demo.service;


import com.github.javafaker.Faker;
import miu.cs425.demo.models.Address;
import miu.cs425.demo.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements IAddressService{
    private AddressRepository addressRepository;
    private Faker faker;
    public AddressService(AddressRepository addressRepository, Faker faker){
        this.addressRepository = addressRepository;
        this.faker = faker;
    }

    public Address getFakeAddress(){
        var address=faker.address();
        return save(new Address(address.streetAddressNumber(),address.city(),address.state(),address.zipCode()));
    }
    public Address save(Address address){
        return addressRepository.save(address);
    }
}
