package com.example.prchsoff.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 20.
 */

@Entity
@Data
@Table(name = "PRCHSOFF")
public class Prchsoff
{
    @Id
    @GeneratedValue
    private Long prchsoffId; // 구매처ID

    @Column(length = 200)
    private String prchsoffName; // 구매처명
}
