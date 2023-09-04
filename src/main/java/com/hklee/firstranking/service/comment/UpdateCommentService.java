package com.hklee.firstranking.service.comment;

import com.hklee.firstranking.domain.comment.Comment;
import com.hklee.firstranking.domain.comment.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class UpdateCommentService {

    private final CommentRepository commentRepository;
    private final Long loginId = 2L; // todo :: member 개발 후 수정

public CommentDto update(Long id, UpdateCommentDto dto) throws RuntimeException {
        Comment comment = commentRepository.findById(id).orElseThrow(() -> new RuntimeException("id에 해당하는 댓글이 없습니다."));

        // 요청자(로그인 아이디)가 코멘트 작성자가 맞는지 확인
        if (comment.isOwner(loginId)) {
            comment.changeText(dto.getText());
            return CommentDto.of(comment);
        } else {
            throw new RuntimeException("코멘트 작성자 본인만 수정 가능 합니다.");
        }
    }

public CommentDto delete(Long id) throws RuntimeException {
        Comment comment = commentRepository.findById(id).orElseThrow(() -> new RuntimeException("id에 해당하는 댓글이 없습니다."));

        // 요청자(로그인 아이디)가 코멘트 작성자가 맞는지 확인
        if (comment.isOwner(loginId)) {
            comment.delete();
            return CommentDto.of(comment);
        } else {
            throw new RuntimeException("코멘트 작성자 본인만 삭제 가능 합니다.");
        }
    }

}
