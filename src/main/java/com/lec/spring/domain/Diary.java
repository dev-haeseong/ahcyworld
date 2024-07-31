package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Diary extends BaseEntity{
    private Long id;
    private Hompy hompy;
    private LocalDate eventDate;
    // 작성날짜는 베이스 엔티티
    private String keyWord;
    private String content;
}
