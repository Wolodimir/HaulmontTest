package com.task.haulmonttest.paymentTable;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class PaymentTable {

    @Id
    private UUID id;

    private Date paymentDate;
    private Double paymentAmount;
    private Double creditBody;
    private Double creditPercent;

    public PaymentTable(Date paymentDate, Double paymentAmount, Double creditBody, Double creditPercent) {
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.creditBody = creditBody;
        this.creditPercent = creditPercent;
    }

    public PaymentTable(UUID id, Date paymentDate, Double paymentAmount, Double creditBody, Double creditPercent) {
        this.id = id;
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
        this.creditBody = creditBody;
        this.creditPercent = creditPercent;
    }

    public PaymentTable() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Double getCreditBody() {
        return creditBody;
    }

    public void setCreditBody(Double creditBody) {
        this.creditBody = creditBody;
    }

    public Double getCreditPercent() {
        return creditPercent;
    }

    public void setCreditPercent(Double creditPercent) {
        this.creditPercent = creditPercent;
    }
}
