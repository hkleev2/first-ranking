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
public class SelectCommentDto {
    private Long productId;
    private String name;
    private String comment;
    private String parentId;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
