package com.example.card.repository;

import com.example.card.domain.Card;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
public interface CardRepository extends JpaRepository<Card, Long>
{
}
