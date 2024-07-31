package com.lec.spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DialectOverride;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Entity
public class User extends BaseEntity{
    private Long id;
    private String username;        // 로그인 아이디
    private String password;
    private String name;
    private String email;
    private LocalDateTime birthDay;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Long acorn;         // 도토리
    private String role;        // 기본은 member
}
