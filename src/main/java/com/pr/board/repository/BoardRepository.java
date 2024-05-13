package com.pr.board.repository;

import com.pr.board.domain.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    //List<Board> findAll();
    Page<Board> findAllByOrderByIdDesc(Pageable pageable);
}
