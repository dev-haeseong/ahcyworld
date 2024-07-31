package com.lec.spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

//@Entity
public class BaseEntity {
    private LocalDateTime createAt;

//    @PrePersist

}
