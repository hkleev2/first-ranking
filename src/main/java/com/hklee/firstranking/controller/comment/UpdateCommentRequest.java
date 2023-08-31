package com.hklee.firstranking.controller.comment;

import com.hklee.firstranking.service.comment.CreateCommentDto;
import com.hklee.firstranking.service.comment.UpdateCommentDto;
import lombok.Data;

import java.util.Date;

@Data
public class UpdateCommentRequest {
    private String text;

    public UpdateCommentDto toServiceDto() {
        return UpdateCommentDto.builder()
                .text(text)
                .build();
    }
}
