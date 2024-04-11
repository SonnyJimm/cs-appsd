package miu.cs425.demo.service;

import miu.cs425.demo.models.Address;

public interface IAddressService {
    public Address getFakeAddress();
    public Address save(Address address);
}
