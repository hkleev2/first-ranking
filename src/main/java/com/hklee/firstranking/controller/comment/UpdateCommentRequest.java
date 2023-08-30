package com.hklee.firstranking.controller.comment;

import com.hklee.firstranking.service.comment.CreateCommentDto;
import com.hklee.firstranking.service.comment.UpdateCommentDto;
import lombok.Data;

import java.util.Date;

@Data
public class UpdateCommentRequest {
    private Long id;
    private String comment;

    public UpdateCommentDto toServiceDto() {
        return UpdateCommentDto.builder()
                .id(id)
                .comment(comment)
                .build();
    }
}
