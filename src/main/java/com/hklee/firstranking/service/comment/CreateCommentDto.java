package com.hklee.firstranking.service.comment;

import com.hklee.firstranking.domain.comment.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class CreateCommentDto {
    private Long productId;
    private Long userId;
    private String text;
    private Long parentId;

    public Comment toComment() {
        return Comment.builder()
                .productId(productId)
                .userId(userId)
                .text(text)
                .parentId(parentId)
                .build();
    }
}
