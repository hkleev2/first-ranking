package com.hklee.firstranking.service.comment;

import com.hklee.firstranking.domain.comment.Comment;
import com.hklee.firstranking.domain.comment.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class SelectCommentService {

    private final CommentRepository commentRepository;

    public List<Comment> selectList(SelectCommentDto dto) {
        return commentRepository.findAllByProductId(dto.getProductId());
    }
}
