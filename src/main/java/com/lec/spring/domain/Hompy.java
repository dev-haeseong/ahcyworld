package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hompy {
    private Long id;
    private User user;
    private String profilePicture;
    private String statusMessage;
    private String title;
    private Long todayVisitor;
    private Long totalVisitor;
    private String profile;
}
