package com.task.haulmonttest.bank;

import com.task.haulmonttest.client.Client;
import com.task.haulmonttest.credit.Credit;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;
import java.util.UUID;

@Entity
public class Bank {

    @Id
    private UUID id;

    @OneToMany//(mappedBy = "credit_id", cascade = CascadeType.ALL)
    private Set<Credit> credit;

    @OneToMany//(mappedBy = "client_id", cascade = CascadeType.ALL)
    private Set<Client> client;

    public Bank(Set<Credit> credit, Set<Client> client) {
        this.credit = credit;
        this.client = client;
    }

    public Bank(UUID id, Set<Credit> credit, Set<Client> client) {
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

    public Set<Credit> getCredit() {
        return credit;
    }

    public void setCredit(Set<Credit> credit) {
        this.credit = credit;
    }

    public Set<Client> getClient() {
        return client;
    }

    public void setClient(Set<Client> client) {
        this.client = client;
    }
}
