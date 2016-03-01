package com.example.prchsoff.dto;

import lombok.Data;

/**
 * @author Moon, Keum Hwan
 * @since 2016-03-01
 */
@Data
public class PrchsoffResDto {
    @Data
    public static class ResList {
        private Long prchsoffId;
        private String prchsoffName;
    }
}
