package com.hklee.firstranking.service.comment;

import com.hklee.firstranking.domain.comment.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@Builder
public class CommentDto {

    private Long id;
    private Long userId;
    private String text;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private boolean isDeleted;

    public static CommentDto of(Comment comment) {
        return CommentDto.builder()
                .id(comment.getId())
                .userId(comment.getUserId())
                .text(comment.getText())
                .createDate(comment.getCreateDate())
                .updateDate(comment.getUpdateDate())
                .isDeleted(comment.isDeleted())
                .build();
    }
}
