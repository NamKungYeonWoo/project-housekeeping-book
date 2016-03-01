package com.example.expense.service.impl;

import com.example.expense.domain.Expense;
import com.example.expense.repository.ExpenseRepository;
import com.example.expense.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
@Service
public class ExpenseServiceImpl implements ExpenseService {
    @Autowired
    ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense findOne(Long expenseId) {
        return expenseRepository.findOne(expenseId);
    }

    @Override
    public Expense create(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public void delete(Long expenseId) {
        expenseRepository.delete(expenseId);
    }
}
