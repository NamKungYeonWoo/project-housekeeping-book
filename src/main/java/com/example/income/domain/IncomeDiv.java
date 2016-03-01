package com.example.income.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 20.
 */

@Entity
@Data
@Table(name = "INCOME_DIV")
public class IncomeDiv
{
    @Id
    @GeneratedValue
    private Long incomeDivId; // 수입ID

    @OneToMany(mappedBy = "incomeDiv")
    private List<Income> incomeList;

    @Column(length = 200)
    private String incomeDivName; // 수입명
}
