package com.pr.board.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "board")
@Builder
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

}
