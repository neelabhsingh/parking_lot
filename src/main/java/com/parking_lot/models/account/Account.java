package com.parking_lot.models.account;

import com.parking_lot.models.person.Person;
import lombok.Data;

@Data
public abstract class Account {
    private String userName;
    private String password;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword(){
        //
        //
        return true;
    }
}
