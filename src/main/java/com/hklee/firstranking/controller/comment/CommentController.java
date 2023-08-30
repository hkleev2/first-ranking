package com.hklee.firstranking.controller.comment;

import com.hklee.firstranking.domain.comment.Comment;
import com.hklee.firstranking.service.comment.CommentDto;
import com.hklee.firstranking.service.comment.CreateCommentService;
import com.hklee.firstranking.service.comment.SelectCommentService;
import com.hklee.firstranking.service.comment.UpdateCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/comment")
@RestController
public class CommentController {

    private final CreateCommentService createCommentService;
    private final SelectCommentService selectCommentService;
    private final UpdateCommentService updateCommentService;

    @PostMapping("/create")
    public CommentDto create(@RequestBody CreateCommentRequest request) {
        return createCommentService.create(request.toServiceDto());
    }

    @PostMapping("/list")
    public List<Comment> selectList(@RequestBody SelectCommentRequest request) {
        return selectCommentService.selectList(request.toServiceDto());
    }

    @PostMapping("/update")
    public void update(@RequestBody UpdateCommentRequest request) {
        updateCommentService.update(request.toServiceDto());
    }

}
