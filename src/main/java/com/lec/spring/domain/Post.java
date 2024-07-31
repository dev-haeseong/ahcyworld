package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post extends BaseEntity{
    private Long id;
    private User user;
    private Folder folder;
    private String subject;
    private String content;
    private Long viewCnt;
    // 작성일은 BaseEntity
}
