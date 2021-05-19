package com.task.haulmonttest.creditOffer;

import com.task.haulmonttest.client.Client;
import com.task.haulmonttest.credit.Credit;
import com.task.haulmonttest.paymentTable.PaymentTable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
public class CreditOffer {

    @Id
    private UUID id;

    @OneToOne
    private Client client;

    @OneToOne
    private Credit credit;

    private Long creditAmount;

    @OneToOne
    private PaymentTable paymentTable;

    public CreditOffer(Client client, Credit credit, Long creditAmount, PaymentTable paymentTable) {
        this.client = client;
        this.credit = credit;
        this.creditAmount = creditAmount;
        this.paymentTable = paymentTable;
    }

    public CreditOffer(UUID id, Client client, Credit credit, Long creditAmount, PaymentTable paymentTable) {
        this.id = id;
        this.client = client;
        this.credit = credit;
        this.creditAmount = creditAmount;
        this.paymentTable = paymentTable;
    }

    public CreditOffer() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public Long getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Long creditAmount) {
        this.creditAmount = creditAmount;
    }

    public PaymentTable getPaymentTable() {
        return paymentTable;
    }

    public void setPaymentTable(PaymentTable paymentTable) {
        this.paymentTable = paymentTable;
    }
}
