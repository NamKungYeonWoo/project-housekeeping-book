package com.example.card.domain;

import com.example.cash.domain.Cash;
import lombok.Data;

import javax.persistence.*;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 20.
 */

@Entity
@Data
@Table(name = "CARD")
public class Card
{
    @Id
    @GeneratedValue
    private Long cardId; // 카드ID

    @Column(length = 200)
    private String cardName; // 카드명

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CASH_ID")
    private Cash cash;
}
