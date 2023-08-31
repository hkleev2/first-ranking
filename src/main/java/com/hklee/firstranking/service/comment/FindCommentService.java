package com.hklee.firstranking.service.comment;

import com.hklee.firstranking.domain.comment.Comment;
import com.hklee.firstranking.domain.comment.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FindCommentService {

    private final CommentRepository commentRepository;

    public List<Comment> findList(Long productId) {
        return commentRepository.findAllByProductId(productId);
    }
}
