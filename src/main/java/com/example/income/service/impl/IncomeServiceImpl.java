package com.example.income.service.impl;

import com.example.income.domain.Income;
import com.example.income.repository.IncomeRepository;
import com.example.income.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
@Service
public class IncomeServiceImpl implements IncomeService
{
    @Autowired
    IncomeRepository incomeRepository;

    @Override
    public List<Income> findAll()
    {
        return incomeRepository.findAll();
    }

    @Override
    public Income findOne(Long incomeId)
    {
        return incomeRepository.findOne(incomeId);
    }
}
