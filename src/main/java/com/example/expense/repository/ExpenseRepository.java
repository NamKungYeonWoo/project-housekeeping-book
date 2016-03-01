package com.example.expense.repository;

import com.example.expense.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
public interface ExpenseRepository extends JpaRepository<Expense, Long>
{
}
