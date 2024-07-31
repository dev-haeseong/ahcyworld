package com.lec.spring.domain;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Entity
public class Carts extends BaseEntity{
    private Long id;

    private User userId;
    private Item itemId;

    @Enumerated(EnumType.STRING)
    private CartsStatus cartsStatus;

    // 결제날짜는 BaseEntity에 있음
}
