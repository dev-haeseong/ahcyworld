package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Attachment {
    private Long id;
    private Post post;
    private String sourceName;
    private String fileName;
    private Long scrap;
}
