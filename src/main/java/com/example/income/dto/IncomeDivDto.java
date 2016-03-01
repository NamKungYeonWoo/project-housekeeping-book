package com.example.income.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-27
 */
@Data
public class IncomeDivDto {
    @NotNull
    private String incomeDivName;
}
