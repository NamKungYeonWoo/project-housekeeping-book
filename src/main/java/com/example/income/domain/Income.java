package com.example.income.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 20.
 */

@Entity
@Data
@Table(name = "INCOME")
public class Income
{
    @Id
    @GeneratedValue
    private Long incomeId; // 수입ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INCOME_DIV_ID")
    private IncomeDiv incomeDiv; // 수입구분

    @Column(length = 200)
    private String incomeName; // 수입명

    private int incomeAmt; // 수입금액
}
