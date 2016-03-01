package com.example.expense.service.impl;

import com.example.expense.domain.ExpenseDiv;
import com.example.expense.repository.ExpenseDivRepository;
import com.example.expense.service.ExpenseDivService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
public class ExpenseDivServiceImpl implements ExpenseDivService
{
    @Autowired
    ExpenseDivRepository expenseDivRepository;

    @Override
    public List<ExpenseDiv> findAll()
    {
        return expenseDivRepository.findAll();
    }

    @Override
    public ExpenseDiv findOne(Long expenseDivId)
    {
        return expenseDivRepository.findOne(expenseDivId);
    }
}
