package com.pr.board.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "board")
@Builder
@NoArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id", nullable = false)
    private Long id;
    @Column(name ="title", nullable = false)
    private String title;
    @Column(name ="content", nullable = false)
    private String content;
    @Column(name ="email", nullable = false)
    private String email;
    @Column(name ="nickName", nullable = false)
    private String nickName;
    @Column(name ="createDate", nullable = false)
    private LocalDateTime createDate;
    @Column(name ="updateDate")
    private LocalDateTime updateDate;
    @Column(name ="deleteYn", nullable = false)
    private String deleteYn;

    @Builder
    public Board(Long id, String title, String content, String email, String nickName, LocalDateTime createDate, LocalDateTime updateDate, String deleteYn) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.email = email;
        this.nickName = nickName;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.deleteYn = deleteYn;
    }
}