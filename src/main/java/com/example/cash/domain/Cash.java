package com.example.cash.domain;

import com.example.card.domain.Card;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-21
 */

@Entity
@Data
@Table(name = "CASH")
public class Cash
{
    @Id
    @GeneratedValue
    private Long cashId; // 현금ID

    @Column(length = 200)
    private String cashName; // 현금명

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRNTS_CASH_ID")
    private Cash parent;

    @OneToMany(mappedBy = "parent")
    private List<Cash> children;

    @OneToMany(mappedBy = "cash")
    private List<Card> cardList;
}
