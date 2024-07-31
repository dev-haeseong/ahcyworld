package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GuestBook extends BaseEntity {
    private Long id;
    private User user;
    private Hompy hompy;
    private String guestBookName;
    private String content;
    // 작성일은 베이스엔티티
    private String status;      // 기본은 show 상태
}
