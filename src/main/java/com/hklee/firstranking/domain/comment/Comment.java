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
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long productId;

    @Column
    private String name;

    @Column
    private String comment;

    @Column
    private String parentId;

    @LastModifiedDate
    private LocalDateTime updateDate;

    @CreatedDate
    private LocalDateTime createDate;
}
