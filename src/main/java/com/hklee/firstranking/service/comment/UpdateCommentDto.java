package com.hklee.firstranking.service.comment;

import com.hklee.firstranking.domain.comment.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
@Builder
public class UpdateCommentDto {
    private Long id;
    private String comment;
}
