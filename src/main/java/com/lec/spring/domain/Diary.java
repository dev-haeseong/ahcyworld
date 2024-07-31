package com.lec.spring.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity(name = "diary_id")
public class Diary extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Hompy hompy;
    private LocalDate eventDate;
    // 작성날짜는 베이스 엔티티
    private String keyWord;
    private String content;
}
