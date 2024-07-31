package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Folder {
    private Long id;
    private BoardType boardType;
    private String name;        // 폴더 이름
    private Hompy hompy;
}
