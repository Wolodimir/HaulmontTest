package com.task.haulmonttest.credit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CreditDao extends JpaRepository<Credit, UUID> {
}
