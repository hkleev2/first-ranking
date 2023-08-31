package com.hklee.firstranking.service.comment;

import com.hklee.firstranking.domain.comment.Comment;
import com.hklee.firstranking.domain.comment.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CreateCommentService {

    private final CommentRepository commentRepository;

    public CommentDto create(CreateCommentDto dto) {
        Comment comment = dto.toComment();

        commentRepository.save(comment);

        return CommentDto.of(comment);
    }

}
