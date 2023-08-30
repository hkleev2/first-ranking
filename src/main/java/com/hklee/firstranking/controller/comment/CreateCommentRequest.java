package com.hklee.firstranking.controller.comment;

import com.hklee.firstranking.service.comment.CreateCommentDto;
import lombok.Data;

@Data
public class CreateCommentRequest {
    private Long productId;
    private String name;
    private String comment;
    private String parentId;

    public CreateCommentDto toServiceDto() {
        return CreateCommentDto.builder()
                .productId(productId)
                .name(name)
                .comment(comment)
                .parentId(parentId)
                .build();
    }
}
