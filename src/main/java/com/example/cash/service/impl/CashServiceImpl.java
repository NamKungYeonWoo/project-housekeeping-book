package com.example.cash.service.impl;

import com.example.cash.domain.Cash;
import com.example.cash.repository.CashRepository;
import com.example.cash.service.CashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-27
 */
@Service
public class CashServiceImpl implements CashService {
    @Autowired
    CashRepository cashRepository;

    @Override
    public List<Cash> findAll() {
        return cashRepository.findAll();
    }

    @Override
    public Cash create(Cash cash) {
        return cashRepository.save(cash);
    }

    @Override
    public Cash findOne(Long cashId) {
        return cashRepository.findOne(cashId);
    }

    @Override
    public void delete(Long cashId) {
        cashRepository.delete(cashId);
    }
}
