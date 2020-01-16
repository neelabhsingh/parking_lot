package com.parking_lot.models.person;

import com.parking_lot.models.address.Address;
import lombok.Data;

@Data
public class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
}
