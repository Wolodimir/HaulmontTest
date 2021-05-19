package com.task.haulmonttest.bank;

import com.task.haulmonttest.client.Client;
import com.task.haulmonttest.credit.Credit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class Bank {

    @Id
    private UUID id;

    @OneToMany
    private List<Credit> credit;

    @OneToMany
    private List<Client> client;

    public Bank(List<Credit> credit, List<Client> client) {
        this.credit = credit;
        this.client = client;
    }

    public Bank(UUID id, List<Credit> credit, List<Client> client) {
        this.id = id;
        this.credit = credit;
        this.client = client;
    }

    public Bank() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Credit> getCredit() {
        return credit;
    }

    public void setCredit(List<Credit> credit) {
        this.credit = credit;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }
}
