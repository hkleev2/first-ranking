package com.hklee.firstranking.domain.comment;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String text;

    @Column
    private Long parentId;

    @UpdateTimestamp
    @Column
    private LocalDateTime updateDate = LocalDateTime.now();

    @CreationTimestamp
    @Column
    private LocalDateTime createDate = LocalDateTime.now();

    @Builder.Default
    @Column
    private boolean isDeleted = false;

    public void changeText(String text) {
        this.text = text;
    }
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public boolean isOwner(Long loginId) {
        return userId.equals(loginId);
    }

}
