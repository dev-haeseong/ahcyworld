package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailAuthentication {
    private Long id;
    private String email;
    private String authenticationCode;
    private String status;
    private LocalDateTime createAt;
}
