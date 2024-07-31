package com.lec.spring.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Friend {
    private User user;
    private User friendUser;
    private String friendName;      // 일촌명
    private String message;

    private FriendStatus friendStatus;
}
