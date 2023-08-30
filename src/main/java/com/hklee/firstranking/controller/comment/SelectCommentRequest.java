package com.hklee.firstranking.controller.comment;

import com.hklee.firstranking.service.comment.SelectCommentDto;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class SelectCommentRequest {
    private Long productId;
    private String name;
    private String comment;
    private String parentId;
    private LocalDateTime createDate;

    public SelectCommentDto toServiceDto() {
        return SelectCommentDto.builder()
                .productId(productId)
                .name(name)
                .comment(comment)
                .parentId(parentId)
                .createDate(createDate)
                .build();
    }
}
