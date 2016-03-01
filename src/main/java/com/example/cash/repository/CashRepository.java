package com.example.cash.repository;

import com.example.cash.domain.Cash;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-27
 */
public interface CashRepository extends JpaRepository<Cash, Long> {
}
