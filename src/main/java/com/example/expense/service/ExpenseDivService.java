package com.example.expense.service;

import com.example.expense.domain.ExpenseDiv;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
public interface ExpenseDivService
{
    List<ExpenseDiv> findAll();

    ExpenseDiv findOne(Long expenseDivId);
}
