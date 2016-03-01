package com.example.prchsoff.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Moon, Keum Hwan
 * @since 2016-02-27
 */
@Data
public class PrchsoffDto {
    @NotNull
    @Size(min = 1, max = 127)
    private String prchsoffName;
}
