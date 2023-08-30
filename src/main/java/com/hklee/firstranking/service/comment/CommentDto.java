package com.hklee.firstranking.service.comment;

import com.hklee.firstranking.domain.comment.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@AllArgsConstructor
@Builder
public class CommentDto {

    private Long id;
    private String name;
    private String comment;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    public static CommentDto of(Comment comment) {
        return CommentDto.builder()
                .id(comment.getId())
                .name(comment.getName())
                .createDate(comment.getCreateDate())
                .updateDate(comment.getUpdateDate())
                .build();
    }
}
