package com.hklee.firstranking.domain.comment;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long productId;

    @Column
    private Long userId;

    @Column
    private String text;

    @Column
    private Long parentId;

    @UpdateTimestamp
    @Column
    private LocalDateTime updateDate = LocalDateTime.now();

    @CreationTimestamp
    @Column
    private LocalDateTime createDate = LocalDateTime.now();

    @Column
    private boolean isDeleted;

    public void setText(String text) {
        this.text = text;
    }
    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
}
