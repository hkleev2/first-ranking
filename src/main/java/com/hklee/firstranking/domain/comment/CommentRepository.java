package com.hklee.firstranking.domain.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByProductId(Long productId);

    List<Comment> findAllByProductIdAndIsDeletedIsFalse(Long productId);
}
