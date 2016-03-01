package com.example.cash.service;

import com.example.cash.domain.Cash;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-27
 */
public interface CashService {
    List<Cash> findAll();

    Cash findOne(Long cashId);

    Cash create(Cash cash);

    void delete(Long cashId);
}
