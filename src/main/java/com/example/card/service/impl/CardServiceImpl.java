package com.example.card.service.impl;

import com.example.card.domain.Card;
import com.example.card.repository.CardRepository;
import com.example.card.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 21.
 */
@Service
public class CardServiceImpl implements CardService
{
    @Autowired
    CardRepository cardRepository;

    @Override
    public List<Card> findAll()
    {
        return cardRepository.findAll();
    }

    @Override
    public Card findOne(Long cardId)
    {
        return cardRepository.findOne(cardId);
    }
}
