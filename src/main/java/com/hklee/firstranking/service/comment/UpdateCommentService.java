package com.hklee.firstranking.service.comment;

import com.hklee.firstranking.domain.comment.Comment;
import com.hklee.firstranking.domain.comment.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UpdateCommentService {

    private final CommentRepository commentRepository;

    public void update(UpdateCommentDto dto) {
        Comment comment = commentRepository.findById(dto.getId()).get();
        comment.setComment(dto.getComment());
        commentRepository.save(comment);
    }

}
