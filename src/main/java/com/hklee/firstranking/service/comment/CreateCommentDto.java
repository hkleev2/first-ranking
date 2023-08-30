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
    private String name;
    private String comment;
    private String parentId;

    public Comment toComment() {
        return Comment.builder()
                .productId(productId)
                .name(name)
                .comment(comment)
                .parentId(parentId)
                .build();
    }
}
