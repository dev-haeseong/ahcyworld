package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment extends BaseEntity{
    private Long id;
    private User user;
    private Post post;
    private String content;
    // 작성날짜는 베이스 엔티티
}
