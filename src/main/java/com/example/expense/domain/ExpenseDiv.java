package com.example.expense.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 20.
 */

@Entity
@Data
@Table(name = "EXPENSE_DIV")
public class ExpenseDiv
{
    @Id
    @GeneratedValue
    private Long expenseDivId;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "PRNTS_EXPENSE_DIV_ID")
    private ExpenseDiv parent;

    @OneToMany(mappedBy = "parent")
    private List<ExpenseDiv> children;
}
