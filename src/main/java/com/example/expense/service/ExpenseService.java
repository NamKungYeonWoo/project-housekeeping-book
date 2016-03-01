package com.example.expense.service;

import com.example.expense.domain.Expense;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
public interface ExpenseService {
    List<Expense> findAll();

    Expense findOne(Long expenseId);

    Expense create(Expense expense);

    void delete(Long expenseId);
}
