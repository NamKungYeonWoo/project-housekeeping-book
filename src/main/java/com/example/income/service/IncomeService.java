package com.example.income.service;

import com.example.income.domain.Income;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
public interface IncomeService
{
    List<Income> findAll();

    Income findOne(Long incomeId);
}
