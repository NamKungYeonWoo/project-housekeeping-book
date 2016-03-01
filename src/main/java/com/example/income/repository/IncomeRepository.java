package com.example.income.repository;

import com.example.income.domain.Income;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
public interface IncomeRepository extends JpaRepository<Income, Long>
{
}
