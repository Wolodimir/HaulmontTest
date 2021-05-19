package com.task.haulmonttest.paymentTable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentTableDao extends JpaRepository<PaymentTable, UUID> {
}
