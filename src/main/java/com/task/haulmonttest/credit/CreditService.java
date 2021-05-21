package com.task.haulmonttest.credit;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditService {

    private final CreditDao creditDao;

    public CreditService(CreditDao creditDao) {
        this.creditDao = creditDao;
    }

    public List<Credit> getAll() {
        return creditDao.findAll();
    }
}
