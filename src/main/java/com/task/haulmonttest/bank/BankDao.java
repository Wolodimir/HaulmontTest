package com.task.haulmonttest.bank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BankDao extends JpaRepository<Bank, UUID> {

}
