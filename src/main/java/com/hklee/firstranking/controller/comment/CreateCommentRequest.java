package com.hklee.firstranking.controller.comment;

import com.hklee.firstranking.service.comment.CreateCommentDto;
import lombok.Data;

@Data
public class CreateCommentRequest {
    private Long productId;
    private Long userId;
    private String text;
    private Long parentId;

    public CreateCommentDto toServiceDto() {
        return CreateCommentDto.builder()
                .productId(productId)
                .userId(userId)
                .text(text)
                .parentId(parentId)
                .build();
    }
}
