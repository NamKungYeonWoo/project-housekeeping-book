package com.example.expense.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Moon, Keum Hwan
 * @since 2016. 2. 20.
 */

@Entity
@Data
@Table(name = "EXPENSE")
public class Expense {
    @Id
    @GeneratedValue
    private Long expenseId; // 지출ID

    private Long expenseDivId; // 지출구분ID

    private Long prchsoffId; // 구매처ID

    private Long cashId; // 현금ID

    private Long cardId; // 카드ID

    @Column(length = 200)
    private String prchsBrkdwn; // 구매내역

    private Long expenseAmt; // 지출금액

    @Column(columnDefinition = "CHAR(8)")
    private String prchsDt; // 구매일

    private Date rgstDate; // 등록일자

    private Date updtDate; // 수정일자
}
