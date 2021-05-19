package com.task.haulmonttest.client;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Client {

    @Id
    private UUID id;

    private String phone;
    private String email;
    private String passport;

    public Client(String phone, String email, String passport) {
        this.phone = phone;
        this.email = email;
        this.passport = passport;
    }

    public Client(UUID id, String phone, String email, String passport) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.passport = passport;
    }

    public Client() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }
}
