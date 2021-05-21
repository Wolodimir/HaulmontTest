package com.task.haulmonttest.credit;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "crd")
public class Credit {

    @Id
    private UUID id;

    private Long limit;
    private Double interestRate;


    public Credit(Long limit, Double interestRate) {
        this.limit = limit;
        this.interestRate = interestRate;
    }

    public Credit(UUID id, Long limit, Double interestRate) {
        this.id = id;
        this.limit = limit;
        this.interestRate = interestRate;
    }

    public Credit() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
