package com.example.income.service;

import com.example.income.domain.IncomeDiv;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
public interface IncomeDivService
{
    List<IncomeDiv> findAll();

    IncomeDiv findOne(Long incomeDiv);

    IncomeDiv create(IncomeDiv incomeDiv);

    void delete(Long incomeDiv);
}
