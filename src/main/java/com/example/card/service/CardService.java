package com.example.card.service;

import com.example.card.domain.Card;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
public interface CardService
{
    List<Card> findAll();

    Card findOne(Long cardId);
}
