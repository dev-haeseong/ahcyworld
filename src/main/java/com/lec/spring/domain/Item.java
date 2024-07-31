package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    private Long id;

    private String itemName;
    private String itemType;
    private String sourceName;
    private String fileName;
    private Long price;
    private String status;
    private String bgmImg;
}
