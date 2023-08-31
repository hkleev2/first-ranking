package com.hklee.firstranking.service.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class UpdateCommentDto {
    private Long id;
    private Long userId;
    private String text;
}
