package com.hklee.firstranking.controller.comment;

import com.hklee.firstranking.domain.comment.Comment;
import com.hklee.firstranking.service.comment.CommentDto;
import com.hklee.firstranking.service.comment.CreateCommentService;
import com.hklee.firstranking.service.comment.FindCommentService;
import com.hklee.firstranking.service.comment.UpdateCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/comment")
@RestController
public class CommentController {

    private final CreateCommentService createCommentService;
    private final FindCommentService findCommentService;
    private final UpdateCommentService updateCommentService;

    @PostMapping
    public CommentDto create(@RequestBody CreateCommentRequest request) {
        return createCommentService.create(request.toServiceDto());
    }

    @GetMapping("/{productId}")
    public List<Comment> findList(@PathVariable Long productId) {
        return findCommentService.findList(productId);
    }

    @PatchMapping("/{id}")
    public CommentDto update(@PathVariable Long id, @RequestBody UpdateCommentRequest request) throws Exception {
        return updateCommentService.update(id, request.toServiceDto());
    }

    @DeleteMapping("/{id}")
    public CommentDto delete(@PathVariable Long id) throws Exception {
        return updateCommentService.delete(id);
    }

}
