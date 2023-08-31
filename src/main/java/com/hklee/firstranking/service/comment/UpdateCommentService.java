package com.hklee.firstranking.service.comment;

import com.hklee.firstranking.domain.comment.Comment;
import com.hklee.firstranking.domain.comment.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@RequiredArgsConstructor
@Service
public class UpdateCommentService {

    private final CommentRepository commentRepository;
    private final Long loginId = 2L;

    public CommentDto update(Long id, UpdateCommentDto dto) throws Exception {
        Comment comment = commentRepository.findById(id).orElseThrow();

        // 요청자(로그인 아이디)가 코멘트 작성자가 맞는지 확인
        if (comment.getUserId().equals(loginId)) {
            comment.setText(dto.getText());
            commentRepository.save(comment);
            return CommentDto.of(comment);
        } else {
            throw new Exception("코멘트 작성자 본인만 수정 가능 합니다.");
        }
    }

    public CommentDto delete(Long id) throws Exception{
        Comment comment = commentRepository.findById(id).orElseThrow();

        // 요청자(로그인 아이디)가 코멘트 작성자가 맞는지 확인
        if (comment.getUserId().equals(loginId)) {
            comment.setIsDeleted(true);
            commentRepository.save(comment);
            return CommentDto.of(comment);
        } else {
            throw new Exception("코멘트 작성자 본인만 삭제 가능 합니다.");
        }
    }

}
