package com.example.expense.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-28
 */
@Data
public class ExpenseDto {
    @NotNull
    private String prchsBrkdwn; // 구매 내역
}
