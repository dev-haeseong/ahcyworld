package com.lec.spring.domain;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Entity
public class PaymentHistory {

    private Long id;

    private User user;          // 유저 아이디
    private User friendUser;    // 친구 아이디(null 허용)
    private String merchantUid;     // 결제번호
    private String impUid;          // 주문고유번호
    private Long payment;           // 결제금액
    private Long acornCnt;          // 도토리 개수
}
